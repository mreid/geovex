package name.reid.mark.geovex;

public class DualSegment extends GSegment {

	private final GSegment mySegment;
	private final Converter myConverter;
	
	public DualSegment(GSegment segment, Converter converter) {
		mySegment = segment;
		myConverter = converter;
	}

	public GPoint getStart() {
		GLine line = mySegment.getLine();
		if(line.isLAI()) return GPoint.PAI;
		return myConverter.toPoint(line);
	}

	public GPoint getEnd() {
		GLine line = mySegment.getLine();
		if(line.isLAI()) return GPoint.PAI;
		return myConverter.toPoint(line);		
	}
	
	public GLine getLine() {
		if(! mySegment.getStart().isPAI()) return myConverter.toLine(mySegment.getStart());
		if(! mySegment.getEnd().isPAI()) return myConverter.toLine(mySegment.getEnd());		
		return GLine.LAI;
	}
}
