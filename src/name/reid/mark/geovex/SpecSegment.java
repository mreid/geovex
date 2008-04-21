package name.reid.mark.geovex;

public class SpecSegment extends GSegment {
	public final GPoint start;
	public final GPoint end;
	
	public SpecSegment(GPoint start, GPoint end) {
		this.start = start;
		this.end   = end;
	}
	
	public GPoint getStart() { return start; }
	public GPoint getEnd() { return end; }
	public GLine getLine() { 
		return new PairLine(getStart(), getEnd());
	}
}
