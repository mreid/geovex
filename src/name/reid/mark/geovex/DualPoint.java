package name.reid.mark.geovex;

public class DualPoint extends GPoint {

	private final GLine myLine;
	private final Converter myConverter;
	
	public DualPoint(GLine line, Converter converter) {
		myLine = line;
		myConverter = converter;
	}
	
	public float getX() {
		return myConverter.toPoint(myLine).getX();
	}

	public float getY() {
		return myConverter.toPoint(myLine).getY();
	}

}
