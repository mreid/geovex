package name.reid.mark.geovex;

public class ROCSIConverter extends Converter {

	private float pi = 0.5f;

	public float getPrior() { return pi; }
	
	public void setPrior(float prior) {
		this.pi = prior;
	}

	public GLine toLine(GPoint point) {
		float fn = 1 - point.getY();
		float fp = point.getX();

		return new SpecLine((pi*fn - (1-pi)*fp), 1, pi*fn);
	}

	public GPoint toPoint(GLine line) {
		float m = line.slope();
		float cost = (line.isVertical() ? 1.0f : pi*m/(pi*m + (1-pi)));
		float fn0  = (line.isVertical() ? 0.0f : 1 - line.atX(0.0f));
		float loss = pi*(1-cost)*fn0;

		return new SpecPoint(cost, loss);
	}

}
