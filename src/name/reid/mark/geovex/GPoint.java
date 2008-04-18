package name.reid.mark.geovex;

public abstract class GPoint {

	public static final float TOLERANCE = 0.000001f;

	/**
	 * This point represents a point "at infinity".
	 */
	public static final GPoint PAI = new SpecPoint(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
	
	public abstract float getX();
	public abstract float getY();

	public boolean isPAI() {
		return this == PAI;
	}
	
	public float distTo(GPoint other) {
		float dx = getX() - other.getX();
		float dy = getY() - other.getY();
		return (float) Math.sqrt(dx*dx + dy*dy);
	}
	
	public boolean equals(Object obj) {
		if(! (obj instanceof GPoint)) return false;
		GPoint other = (GPoint) obj;
		
		return this.distTo(other) < TOLERANCE;
	}
	
	public String toString() {
		if(isPAI()) return "(PAI)";
		return "(" + getX() + "," + getY() +")";
	}
	
}
