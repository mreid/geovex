package name.reid.mark.geovex;

import java.util.ArrayList;

public class SpecCurve extends GCurve {

	private final ArrayList mySegments = new ArrayList();

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
		GSegment last = (GSegment) mySegments.remove(lastIndex);
		mySegments.add(new SpecSegment(last.getStart(), point));
		mySegments.add(new SpecSegment(point, last.getEnd()));
	}

	public boolean isEmpty() {
		return mySegments.isEmpty();
	}
	
	public GSegment getSegment(int index) {
		return (GSegment) mySegments.get(index);
	}
	
	public int size() {
		return mySegments.size();
	}

}
