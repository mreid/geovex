package name.reid.mark.geovex;

public class GBounds {

	private float xmin;
	private float xmax;
	private float ymin;
	private float ymax;
	
	public GBounds(float xmin, float ymin, float xmax, float ymax) {
		this.xmax = xmax;
		this.xmin = xmin;
		this.ymax = ymax;
		this.ymin = ymin;
	}
	
	public GSegment clip(GLine line) {
		float x0 = xmin;
		float x1 = xmax;
		float y0 = line.atX(x0);
		float y1 = line.atX(x1);
		
		if(y0 < ymin) {
			y0 = ymin; 
			x0 = line.atY(y0);
		}
		
		if(y1 > ymax) {
			y1 = ymax;
			x1 = line.atY(y1);
		}
		
		return new GSegment(new SpecPoint(x0, y0), new SpecPoint(x1, y1));
	}
}
