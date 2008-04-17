package name.reid.mark.geovex;

public abstract class Converter {

	public abstract GLine toLine(GPoint point);
	
	public abstract GPoint toPoint(GLine line);

	public GCurve toCurve(GCurve curve) {
		  SpecCurve result = new SpecCurve();
		  for(int i = 0 ; i < curve.size() - 1; i++) {
			  result.add(toPoint(curve.getSegment(i).getLine()));
		  }
		  return result;
	}
}
