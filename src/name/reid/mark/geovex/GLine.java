package name.reid.mark.geovex;

public abstract class GLine {
	
	// Represents a line with solutions "at infinity"
	public static final GLine LAI = new SpecLine(0, 0, 1);
	
	public static final float TOLERANCE = 0.0001f;
	
	public abstract float getA();
	public abstract float getB();
	public abstract float getC();
	
	public boolean isLAI() {
		return this == LAI;
	}
	
	/**
	 * @return The slope of this line.
	 */
	public float slope() {
		return -getA()/getB();		
	}
	
	public float intercept() {
		return atX(0.0f);
	}
	
	/**
	 * A line is considered vertical if the magnitude of the reciprocal of its slope is 
	 * sufficiently close to zero.
	 * 
	 * @return true iff |1/slope| < TOLERANCE
	 */
	public boolean isVertical() { return Math.abs(1/slope()) < TOLERANCE; }
	public float atX(float x) { return (getC() - getA()*x)/getB(); }
	public float atY(float y) { return (getC() - getB()*y)/getA(); }

	/**
	 * Two lines are equal if their slopes and intercepts are the same (up to
	 * differences smaller than a specific tolerance (See TOLERANCE field).
	 */
	public boolean equals(Object obj) {
		if(! (obj instanceof GLine)) return false;
		
		GLine other = (GLine) obj;
		
		if(this.isVertical() && other.isVertical()) {
			// If both lines are vertical ensure their x-intercepts are close
			return Math.abs(this.atY(0.0f) - other.atY(0.0f)) < TOLERANCE;
		} else if(this.isVertical() || other.isVertical()) {
			// If one is vertical and the other isn't then they are different
			return false;
		} else {
			// Otherwise, see if the slopes are multiplicatively close and 
			// the intercepts are additively close
			float interceptDiff = Math.abs(this.intercept() - other.intercept());
			float slopeRatio = Math.abs(this.slope() / other.slope());			
			
			return (interceptDiff < TOLERANCE) && ((1 - slopeRatio) < TOLERANCE);
		}
	}
	
	public String toString() { 
		if(isLAI()) return "Line: (LAI)";
		String result = "Line: " + getA() + "X + " + getB() + "Y = " + getC();
		return result; 
	}
}
