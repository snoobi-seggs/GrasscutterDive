package emu.grasscutter.game.ability.mixins;

import com.google.protobuf.ByteString;
import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.binout.AbilityMixinData;
import emu.grasscutter.game.ability.Ability;
import emu.grasscutter.game.entity.*;
import emu.grasscutter.game.props.CampTargetType;
import emu.grasscutter.game.world.Position;

//@AbilityAction(AbilityModifierAction.Type.ServerCreateGadgetOnKillMixin)
public class MixinServerCreateGadgetOnKill extends AbilityMixinHandler {

    @Override
    public boolean execute(
            Ability ability, AbilityMixinData mixinData, ByteString abilityData) {
        //var entity = ability.getOwner();
        //var entityCreated =
        //        new EntityGadget(
        //                entity.getScene(),
        //                action.gadgetID,
        //                new Position(createGadget.getPos()),
        //                new Position(createGadget.getRot()),
        //                action.campID,
        //                CampTargetType.getTypeByName(action.campTargetType).getValue());
        //if (action.ownerIsTarget) entityCreated.setOwner(target);
        //else entityCreated.setOwner(entity);
        //
        //entity.getScene().addEntity(entityCreated);
        //
        //Grasscutter.getLogger()
        //        .trace(
        //                "Gadget {} created at pos {} rot {}",
        //                action.gadgetID,
        //                entityCreated.getPosition(),
        //                entityCreated.getRotation());
        //
        return false;
    }
}
