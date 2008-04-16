package name.reid.mark.geovex;

/**
 * Represents a specific line aX + bY = c.
 * 
 * @author mreid
 */
public class SpecLine extends GLine { 

	public final float a, b, c;
	
	/**
	 * Constructs a new line with equation aX + bY = c
	 * @param a The X coefficient
	 * @param b The Y coefficient
	 * @param c The constant
	 */
	public SpecLine(float a, float b, float c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public SpecLine(double a, double b, double c) {
		this.a = (float) a;
		this.b = (float) b;
		this.c = (float) c;
	}
	
	public float getA() { return a; }
	public float getB() { return b; }
	public float getC() { return c; }
}
