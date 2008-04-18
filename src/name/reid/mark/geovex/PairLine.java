package name.reid.mark.geovex;

public class PairLine extends GLine {

	private final GPoint start;
	private final GPoint end;
	
	public PairLine(GPoint start, GPoint end) {
		this.start = start;
		this.end = end;
	}
	
	public boolean isLAI() {
		return start.isPAI() || end.isPAI();
	}

	public float getA() {
		return end.getY() - start.getY();
	}

	public float getB() {
		return start.getX() - end.getX();
	}

	public float getC() {
		return getA()*start.getX() + getB()*start.getY();
	}
}
