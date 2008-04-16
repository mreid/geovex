package name.reid.mark.geovex;

import java.util.ArrayList;

public class SpecCurve extends GCurve {

	private final ArrayList<GPoint> myPoints = new ArrayList<GPoint>();

	public void add(int position, float x, float y) {
		add(position, new SpecPoint(x, y));
	}
	
	public void add(float x, float y) {
		add(new SpecPoint(x,y));
	}
	
	public void add(int position, GPoint point) {
		myPoints.add(position, point);
	}
	
	public void add(GPoint point) {
		myPoints.add(point);
	}

	@Override
	public GPoint getPoint(int index) {
		return myPoints.get(index);
	}

	@Override
	public int size() {
		return myPoints.size();
	}

}
