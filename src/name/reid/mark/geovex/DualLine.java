package name.reid.mark.geovex;

public class DualLine extends GLine {

	private final GPoint myPoint;
	private final Converter myConverter;
	
	public DualLine(GPoint point, Converter converter) {
		myPoint = point;
		myConverter = converter;
	}
	
	@Override
	public float getA() {
		return myConverter.toLine(myPoint).getA();
	}

	@Override
	public float getB() {
		return myConverter.toLine(myPoint).getB();
	}

	@Override
	public float getC() {
		return myConverter.toLine(myPoint).getC();
	}

}
