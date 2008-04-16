package name.reid.mark.geovex;

/**
 * Represents the point (x,y).
 * 
 * @author mreid
 */
public class GVPoint {
	public static final float TOLERANCE = 0.000001f;
	public final float x, y;
	
	public GVPoint(double x, double y) {
		this.x = (float) x;
		this.y = (float) y;
	}
	
	public GVPoint(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public float distTo(GVPoint other) {
		float dx = x - other.x;
		float dy = y - other.y;
		return ((Double) Math.sqrt( ((Float) (dx*dx + dy*dy)).doubleValue() )).floatValue();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(! (obj instanceof GVPoint)) return false;
		GVPoint other = (GVPoint) obj;
		
		return this.distTo(other) < TOLERANCE;
	}
	
	@Override
	public String toString() {
		return "(" + x + "," + y +")";
	}
}
