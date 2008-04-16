package name.reid.mark.geovex;

/**
 * Responsible for conversion between ROC lines and points and Statistical Information
 * lines and points.
 * 
 * @author mreid
 */
public class Converter {

	  private float pi = 0.5f;
	    
	  public GVPoint toSIPoint(GVLine rocLine) {
	    float m = rocLine.slope();
	    float cost = (rocLine.isVertical() ? 1.0f : pi*m/(pi*m + (1-pi)));
	    float fn0  = (rocLine.isVertical() ? 0.0f : 1 - rocLine.atX(0.0f));
	    float loss = pi*(1-cost)*fn0;
	    
	    return new GVPoint(cost, loss);
	  }
	  
	  public GVLine toSILine(GVPoint rocPoint) {
	    float fn = 1 - rocPoint.y;
	    float fp = rocPoint.x;
	    
	    return new GVLine(1, -1*((1-pi)*fp - pi*fn), pi*fn);
	  }
	  
	  public GVPoint toROCPoint(GVLine siLine) {
	    float l0 = siLine.atX(0.0f);
	    float m  = siLine.slope();
	    float fn = l0/pi;
	    float fp = (m + l0)/(1 - pi);
	    
	    return new GVPoint(fp, 1-fn);
	  }
	  
	  public GVLine toROCLine(GVPoint siPoint) {
	    float c = siPoint.x;
	    float l = siPoint.y;
	    
	    return new GVLine(-c*(1-pi), pi*(1-c), pi*(1-c) - l);
	  }

	  public GVCurve toROCCurve(GVCurve siCurve) {
		  GVCurve rocCurve = new GVCurve();
		  for(int i = 0 ; i < siCurve.size() - 1; i++) {
			  rocCurve.add(toROCPoint(siCurve.getSegment(i).line));
		  }
		  return rocCurve;
	  }
}
