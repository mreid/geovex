package name.reid.mark.geovex;

public class DualCurve extends GCurve {
	private final GCurve myCurve;
	private final Converter myConverter;
	
	public DualCurve(GCurve curve, Converter converter) {
		myCurve = curve;
		myConverter = converter;
	}

	@Override
	public GSegment getSegment(int index) {
		return new DualSegment(myCurve.getSegment(index), myConverter);
		
	}
	
	@Override
	public int size() {
		return myCurve.size();
	}
}
