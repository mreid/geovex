package name.reid.mark.geovex;

import java.util.ArrayList;

/**
 * A GVCurve is a series of points with line segments connecting them.
 * 
 * @author mreid
 */
public class GVCurve {

	private final ArrayList<GVPoint> myPoints = new ArrayList<GVPoint>();

	public int size() {
		return myPoints.size();
	}
	
	public void add(int position, float x, float y) {
		add(position, new GVPoint(x, y));
	}
	
	public void add(float x, float y) {
		add(new GVPoint(x,y));
	}
	
	public void add(int position, GVPoint point) {
		myPoints.add(position, point);
	}
	
	public void add(GVPoint point) {
		myPoints.add(point);
	}
	
	public GVPoint getPoint(int position) {
		return myPoints.get(position);
	}
	
	public GVSegment getSegment(int index) {
		return new GVSegment(getPoint(index), getPoint(index + 1));
		
	}	
}
