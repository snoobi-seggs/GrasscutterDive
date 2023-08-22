package emu.grasscutter.data.excels;

import com.google.gson.annotations.SerializedName;
import emu.grasscutter.data.GameResource;
import emu.grasscutter.data.ResourceType;
import emu.grasscutter.game.props.SceneType;
import java.util.List;
import lombok.Getter;

@ResourceType(name = "SceneTagConfigData.json")
@Getter
public class SceneTagData extends GameResource {
    @Getter(onMethod_ = @Override)
    private int id;

    @SerializedName("DJCOAOBDIHP")
	private boolean idk1;
	@SerializedName("LOLNNMPKHIB")
	private boolean idk2;
	
	private boolean isDefaultValid; // shld be there by default
	
    private String sceneTagName;
	private int sceneId;
	private List<SceneTagCondition> cond;
	
	public class SceneTagCondition {
		@Getter private String condType = null; // TODO set actual scene tag
		@Getter private int param1 = 0;
		@Getter private int param2 = 0;
	}
	
}
