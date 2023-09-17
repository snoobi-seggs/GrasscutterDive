package emu.grasscutter.game.ability.actions;

import com.google.protobuf.ByteString;
import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.binout.AbilityModifier.AbilityModifierAction;
import emu.grasscutter.game.ability.Ability;
import emu.grasscutter.game.entity.GameEntity;
import emu.grasscutter.scripts.ScriptLoader;
import emu.grasscutter.scripts.data.ScriptArgs;
import javax.script.Bindings;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;

@AbilityAction(AbilityModifierAction.Type.ServerLuaCall)
public final class ActionServerLuaCall extends AbilityActionHandler {
    @Override
    public boolean execute(
            Ability ability, AbilityModifierAction action, ByteString abilityData, GameEntity target) {
        var scene = target.getScene();
        var scriptManager = scene.getScriptManager();
        var functionName = action.funcName;
        var argNum = action.paramNum;
        var arg1 = action.param1.get(ability);
        var arg2 = action.param2.get(ability);
        var arg3 = action.param3.get(ability);

        // Set the script library's manager.
        var scriptLib = ScriptLoader.getScriptLib();
        scriptLib.setCurrentEntity(target);
        scriptLib.setSceneScriptManager(scriptManager);
        // Attempt to call the function.
        return switch (action.luaCallType) {
            default -> false;
            case FromGroup -> {
                var groupId = target.getGroupId();
                var group = scriptManager.getGroupById(groupId);
                var script = group.getBindings();

                // Set the script library's group.
                scriptLib.setCurrentGroup(group);

                yield ActionServerLuaCall.callFunction(script, functionName, argNum, arg1, arg2, arg3);
            }
            case SpecificGroup -> {
                var groupId = action.callParamList[0];
                var group = scriptManager.getGroupById(groupId);
                var script = group.getBindings();

                // Set the script library's group.
                scriptLib.setCurrentGroup(group);

                yield ActionServerLuaCall.callFunction(script, functionName, argNum, arg1, arg2, arg3);
            }
        };
    }

    /**
     * Handles fetching and calling a function.
     *
     * @param bindings The bindings to fetch the function from.
     * @param functionName The name of the function to call.
     * @return Whether the function was called successfully.
     */
    private static boolean callFunction(Bindings bindings, String functionName, int argNum, float arg1, float arg2, float arg3) {
        try {
            // Resolve the function from the script.
            var function = bindings.get(functionName);
            if (!(function instanceof LuaFunction luaFunction))
                throw new Exception("Function is not a LuaFunction.");

            // Attempt to invoke the function.
            Grasscutter.getLogger().warn("SERVER_LUA_CALL {} of {} PARAMS. ({}, {}, {})", functionName, argNum, arg1, arg2, arg3);
            ScriptArgs args = new ScriptArgs(0, 0); // the first 2 params arent use anyways, (groupId, eventType)
            args.setParam1((int) arg1);
            args.setParam2((int) arg2);
            args.setParam3((int) arg3);
            luaFunction.invoke(new LuaValue[] {ScriptLoader.getScriptLibLua(), CoerceJavaToLua.coerce(args)});

            return true;
        } catch (Exception exception) {
            Grasscutter.getLogger().warn("Unable to invoke {}.", functionName, exception);
            return false;
        }
    }
}
