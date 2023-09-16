package emu.grasscutter.game.ability.actions;

import com.google.protobuf.ByteString;
import emu.grasscutter.data.binout.AbilityModifier.AbilityModifierAction;
import emu.grasscutter.data.common.DynamicFloat;
import emu.grasscutter.game.ability.Ability;
import emu.grasscutter.game.entity.GameEntity;
import emu.grasscutter.server.packet.send.PacketServerGlobalValueChangeNotify;

import emu.grasscutter.Grasscutter;

@AbilityAction(AbilityModifierAction.Type.AddGlobalValue)
public final class ActionAddGlobalValue extends AbilityActionHandler {
    @Override
    public boolean execute(
            Ability ability, AbilityModifierAction action, ByteString abilityData, GameEntity target) {
        // Get the key and value (min and max also).
        var valueKey = action.key;
        var value = action.ratio;
        float minValue = action.minValue.get(ability);
        float maxValue = action.maxValue.get(ability);

        // Get the global value.
        float currentVal = target.getGlobalAbilityValues().get(valueKey);
        float newValue = currentVal + value.get(ability);

        // Check if this new value is outside range, if so, take appropriate min/max val
        if (minValue >= newValue || newValue >= maxValue) {
            newValue = value.get(ability) >= 0 ? maxValue : minValue; // If ratio is add NOT subtract, then take maxVal, else minVal
            // Log
            Grasscutter.getLogger().warn("ActionAddGlobalValue ENTITY {} KEY {} exceed range [{} , {}], set to {} instead",
                                            target.getId(),
                                            valueKey,
                                            minValue,
                                            maxValue,
                                            newValue
            );
        }

        // Add the value to currentVal, cld be negative
        target.getGlobalAbilityValues().put(valueKey, newValue);
        // Update the target.
        target.onAbilityValueUpdate(); // maybe have a SGV event call

        // Log
        Grasscutter.getLogger().warn("ActionAddGlobalValue: [\n    GameEntityID: {}\n    KEY: {}\n    ADD_AMT: {}\n    PREV_VAL: {}\n    AFTER_VAL: {}\n]",
                                        valueKey,
                                        target.getId(),
                                        value.get(ability),
                                        currentVal,
                                        target.getGlobalAbilityValues().get(valueKey)
        );

        // Send a value update packet.
        target
                .getScene()
                .getHost()
                .sendPacket(new PacketServerGlobalValueChangeNotify(target, valueKey, newValue));

        return true;
    }
}
