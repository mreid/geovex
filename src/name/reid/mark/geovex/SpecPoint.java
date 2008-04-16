package name.reid.mark.geovex;

/**
 * Represents the point (x,y).
 * 
 * @author mreid
 */
public class SpecPoint extends GPoint {
	private float x;
	private float y;

	public SpecPoint(double x, double y) {
		this.x = (float) x;
		this.y = (float) y;
	}
	
	public SpecPoint(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public float getX() { return x; }
	public float getY() { return y; }
	
	public void setX(float x) { this.x = x; }
	public void setY(float y) { this.y = y; }
}
