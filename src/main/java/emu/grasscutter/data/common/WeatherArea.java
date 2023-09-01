package emu.grasscutter.data.common;

import com.google.gson.annotations.SerializedName;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.GameData;
import emu.grasscutter.game.world.Position;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class WeatherArea {
    @Setter private int area_id;
	@Getter @Setter private List<Point> points; //this is really x and z
	@Getter @Setter private float bottom = -99999f; //min height
	@Getter @Setter private float top = 99999f;    //max height
    @Getter @Setter private boolean isAccurateBorder;
	@Getter @Setter private boolean isUseHeightBorder;
	
	public class Point {
		public float x;
		public float y;
		
		public Point(float x, float y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public int getAreaId() {
		return this.area_id;
	}
	
	/**
     * Return true if the given point is contained inside the boundary.
     * See: http://www.ecse.rpi.edu/Homepages/wrf/Research/Short_Notes/pnpoly.html
     * @param test The point to check
     * @return true if the point is inside the boundary, false otherwise
     *
     */
    public boolean contains(float x, float y) {
	  Point test = new Point(x,y);
      int i;
      int j;
      boolean result = false;
      for (i = 0, j = points.size() - 1; i < points.size(); j = i++) {
        if ((points.get(i).y > test.y) != (points.get(j).y > test.y) &&
            (test.x < (points.get(j).x - points.get(i).x) * (test.y - points.get(i).y) / (points.get(j).y - points.get(i).y) + points.get(i).x)) {
          result = !result;
         }
      }
      return result;
    }
	
	public String toString() {
		String ret = "Data:\n" + getAreaId() + "\n  TOP : " + top + " BOTTOM : " + bottom + "\n  POINTS\n";
		for (Point point : points) {
			ret = ret + "    X : " + point.x + " Y : " + point.y + "\n";
		}
		return ret;
	}
	
	public void onLoad() {
		//make ignore height
		if (this.isUseHeightBorder == false) {
			this.bottom = -99999f;
			this.top = 99999f;
		}
	}
}