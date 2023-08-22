package emu.grasscutter.data.excels;

import com.google.gson.annotations.SerializedName;
import emu.grasscutter.data.GameResource;
import emu.grasscutter.data.ResourceType;
import emu.grasscutter.game.props.SceneType;
import java.util.List;
import lombok.Getter;

@ResourceType(name = "MapLayerGroupExcelConfigData.json")
@Getter
public class MapLayerGroupData extends GameResource {
    @Getter(onMethod_ = @Override)
    private int id;

    @SerializedName("FIIAHPKBCDE")
	private List<Integer> areaIds;
	@SerializedName("ODEFCAMHKNK")
	private float mapFloorId;	//MapLayerFloorExcel (first level of the maplayer)
	
}
