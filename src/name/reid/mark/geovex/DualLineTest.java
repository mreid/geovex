package name.reid.mark.geovex;

import junit.framework.TestCase;

public class DualLineTest extends TestCase {

	public void testDualLine() {
		ROCSIConverter converter = new ROCSIConverter();
		SpecPoint p = new SpecPoint(0.0, 0.0);
		GLine dual = new DualLine(p, converter);
		
		// Sanity check
		GLine expect = converter.toLine(p);		
		assertEquals(expect, dual);

		// Modifying the prior should implicitly modify the dual line.
		converter.setPrior(0.25f);
		expect = converter.toLine(p);
		assertEquals(expect, dual);
		
		// Modifying the point should implicitly modify the dual line.
		p.setX(1); p.setY(1);
		expect = converter.toLine(new SpecPoint(1,1));
		assertEquals(expect, dual);
	}
}
