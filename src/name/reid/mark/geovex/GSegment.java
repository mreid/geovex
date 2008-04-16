package name.reid.mark.geovex;

public class GSegment {
	public final GPoint start;
	public final GPoint end;
	public final GLine  line;
	
	public GSegment(GPoint start, GPoint end) {
		this.start = start;
		this.end   = end;
		this.line  = new PairLine(this.start, this.end);
	}
}
