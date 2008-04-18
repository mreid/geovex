package name.reid.mark.geovex;

public class DualLine extends GLine {

	private final GPoint myPoint;
	private final Converter myConverter;
	
	public DualLine(GPoint point, Converter converter) {
		myPoint = point;
		myConverter = converter;
	}
	
	public float getA() {
		return myConverter.toLine(myPoint).getA();
	}

	public float getB() {
		return myConverter.toLine(myPoint).getB();
	}

	public float getC() {
		return myConverter.toLine(myPoint).getC();
	}

}
