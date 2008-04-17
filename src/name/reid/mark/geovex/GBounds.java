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
	
	public boolean inside(GPoint point) {
		float x = point.getX();
		float y = point.getY();
		return (xmin <= x && x <= xmax && ymin <= y && y <= ymax);
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
		
		return new SpecSegment(new SpecPoint(x0, y0), new SpecPoint(x1, y1));
	}	
}
