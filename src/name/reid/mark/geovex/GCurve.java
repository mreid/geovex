package name.reid.mark.geovex;

/**
 * A GVCurve is a series of points with line segments connecting them.
 * 
 * @author mreid
 */
public abstract class GCurve {

	public abstract int size(); 

	public abstract GSegment getSegment(int index);
	
	public GPoint getPoint(int index) {
		if(index == size()) {
			return getSegment(index - 1).getEnd();
		} else {
			return getSegment(index).getStart();
		}
	}

	public String toString() {
		String result = "Curve Points:";
		for(int i = 0 ; i < size() ; i++) {
			result += getPoint(i) + " ";
		}
		result += "\nCurve Lines:";
		for(int i = 0 ; i < size() ; i++) {
			result += getSegment(i).getLine() + " ";
		}
		return result;
	}
}
