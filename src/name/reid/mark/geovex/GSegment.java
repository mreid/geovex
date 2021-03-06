package name.reid.mark.geovex;

public abstract class GSegment {
	public abstract GPoint getStart();
	public abstract GPoint getEnd();
	public abstract GLine getLine();
	
	public String toString() {
		return getStart() + "--" + getEnd() + " | " + getLine();
	}
}
