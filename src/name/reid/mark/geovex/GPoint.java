package name.reid.mark.geovex;

public abstract class GPoint {

	public static final float TOLERANCE = 0.000001f;

	public abstract float getX();
	public abstract float getY();

	public float distTo(GPoint other) {
		float dx = getX() - other.getX();
		float dy = getY() - other.getY();
		return ((Double) Math.sqrt( ((Float) (dx*dx + dy*dy)).doubleValue() )).floatValue();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(! (obj instanceof GPoint)) return false;
		GPoint other = (GPoint) obj;
		
		return this.distTo(other) < TOLERANCE;
	}
	
	@Override
	public String toString() {
		return "(" + getX() + "," + getY() +")";
	}
	
}
