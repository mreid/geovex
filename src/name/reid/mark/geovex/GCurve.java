package name.reid.mark.geovex;

/**
 * A GVCurve is a series of points with line segments connecting them.
 * 
 * @author mreid
 */
public abstract class GCurve {

	public abstract int size(); 

	public abstract GPoint getPoint(int index);

	public GSegment getSegment(int index) {
		return new GSegment(getPoint(index), getPoint(index + 1));
		
	}	
}
