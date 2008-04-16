package name.reid.mark.geovex;

public abstract class GLine {
	
	public abstract float getA();
	public abstract float getB();
	public abstract float getC();
	/**
	 * @return The slope of this line.
	 */
	public float slope() {
		if(isVertical()) return Float.POSITIVE_INFINITY;
	
		return -getA()/getB();		
	}
	public boolean isVertical() { return (getB() == 0); }
	public float atX(float x) { return (getC() - getA()*x)/getB(); }
	public float atY(float y) { return (getC() - getB()*y)/getA(); }
	public String toString() { 
		String result = "Line: " + getA() + "X + " + getB() + "Y = " + getC();
		return result; 
	}
}
