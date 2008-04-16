package name.reid.mark.geovex;

public class ROCSIConverter extends Converter {

	private float pi = 0.5f;

	@Override
	public GLine toLine(GPoint point) {
		float fn = 1 - point.getY();
		float fp = point.getX();

		return new SpecLine(1, -1*((1-pi)*fp - pi*fn), pi*fn);
	}

	@Override
	public GPoint toPoint(GLine line) {
		float m = line.slope();
		float cost = (line.isVertical() ? 1.0f : pi*m/(pi*m + (1-pi)));
		float fn0  = (line.isVertical() ? 0.0f : 1 - line.atX(0.0f));
		float loss = pi*(1-cost)*fn0;

		return new SpecPoint(cost, loss);
	}

}
