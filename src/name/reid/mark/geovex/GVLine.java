package name.reid.mark.geovex;

/**
 * Represents a line aX + bY = c.
 * 
 * @author mreid
 */
public class GVLine {

	public static GVLine NULL = new GVLine(0, 0, 0);
	
	public final float a, b, c;
	
	/**
	 * Constructs a new line with equation aX + bY = c
	 * @param a The X coefficient
	 * @param b The Y coefficient
	 * @param c The constant
	 */
	public GVLine(float a, float b, float c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public GVLine(double a, double b, double c) {
		this.a = (float) a;
		this.b = (float) b;
		this.c = (float) c;
	}
	
	public static GVLine create(GVPoint start, GVPoint end) {
		if(start.equals(end)) return GVLine.NULL;
		
		float a = end.y - start.y;
		float b = start.x - end.x;
		float c = a*start.x + b*start.y;
		
		return new GVLine(a, b, c);
	}
	
	/**
	 * @return The slope of this line.
	 */
	public float slope() {
		if(b == 0) return Float.POSITIVE_INFINITY;

		return -a/b;		
	}

	public boolean isVertical() { return (b == 0); }

	public float atX(float x) { return (c - a*x)/b; }
	public float atY(float y) { return (c - b*y)/a; }

	public String toString() { 
		String result = "Line: " + a + "X + " + b + "Y = " + c;
		return result; 
	}
}
