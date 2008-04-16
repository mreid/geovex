package name.reid.mark.geovex;

/**
 * Responsible for conversion between ROC lines and points and Statistical Information
 * lines and points.
 * 
 * @author mreid
 */
public class SIROCConverter extends Converter {

	private float pi = 0.5f;

	public GPoint toPoint(GLine siLine) {
		float l0 = siLine.atX(0.0f);
		float m  = siLine.slope();
		float fn = l0/pi;
		float fp = (m + l0)/(1 - pi);

		return new SpecPoint(fp, 1-fn);
	}

	public GLine toLine(GPoint siPoint) {
		float c = siPoint.getX();
		float l = siPoint.getY();

		return new SpecLine(-c*(1-pi), pi*(1-c), pi*(1-c) - l);
	}
}
