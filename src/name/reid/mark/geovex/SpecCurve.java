package name.reid.mark.geovex;

import java.util.ArrayList;

public class SpecCurve extends GCurve {

	private final ArrayList<SpecSegment> mySegments = new ArrayList<SpecSegment>();

	public SpecCurve() {
		this(new SpecSegment(GPoint.PAI, GPoint.PAI));
	}
	
	public SpecCurve(SpecSegment segment) {
		mySegments.add(segment);
	}
	
	public void add(float x, float y) {
		add(new SpecPoint(x,y));
	}
	
	public void add(GPoint point) {
		int lastIndex = mySegments.size() - 1;
		SpecSegment last = mySegments.remove(lastIndex);
		mySegments.add(new SpecSegment(last.start, point));
		mySegments.add(new SpecSegment(point, last.end));
	}

	public boolean isEmpty() {
		return mySegments.isEmpty();
	}
	
	@Override
	public SpecSegment getSegment(int index) {
		return mySegments.get(index);
	}
	
	@Override
	public int size() {
		return mySegments.size();
	}

}
