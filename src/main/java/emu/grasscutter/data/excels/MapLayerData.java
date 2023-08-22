package emu.grasscutter.data.excels;

import com.google.gson.annotations.SerializedName;
import emu.grasscutter.data.GameResource;
import emu.grasscutter.data.ResourceType;
import emu.grasscutter.game.props.SceneType;
import java.util.List;
import lombok.Getter;

@ResourceType(name = "MapLayerExcelConfigData.json")
@Getter
public class MapLayerData extends GameResource {
    @Getter(onMethod_ = @Override)
    private int id;

    @SerializedName("NLPFIGAEBFP")
	private int idk1;
	@SerializedName("GCBPOOPNLLD")
	private float level;	//how deep thoronium is in me
	
}
