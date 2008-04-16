package name.reid.mark.geovex;

public class GVSegment {
	public final GVPoint start;
	public final GVPoint end;
	public final GVLine  line;
	
	public GVSegment(GVPoint start, GVPoint end) {
		this.start = start;
		this.end   = end;
		this.line  = GVLine.create(start, end);
	}
}
