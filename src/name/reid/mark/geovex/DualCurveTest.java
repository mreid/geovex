package name.reid.mark.geovex;

import junit.framework.TestCase;


public class DualCurveTest extends TestCase {

	public void testGetPoint() {
		ROCSIConverter convert = new ROCSIConverter();
		SpecCurve c = new SpecCurve();
		c.add(0,0);
		c.add(1,1);
		
		GCurve dual = new DualCurve(c, convert);
		assertEquals("Size", 3, dual.size());
		System.out.println("Prior = " + convert.getPrior());
		System.out.println("Primary: " + c);
		System.out.println("Dual: " + dual);
		
		convert.setPrior(0.25f);
		System.out.println("Prior = " + convert.getPrior());
		System.out.println("Primary: " + c);
		System.out.println("Dual: " + dual);		
	}

}
