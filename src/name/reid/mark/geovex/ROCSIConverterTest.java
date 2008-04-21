package name.reid.mark.geovex;

import junit.framework.TestCase;

public class ROCSIConverterTest extends TestCase {

	private ROCSIConverter convert = new ROCSIConverter();
	
	public void testToLine() {
		// (0,0) -> Y = 0.5 - 0.5X
		GPoint p = new SpecPoint(0, 0);
		GLine l = new SpecLine(0.5, 1, 0.5);
		
		assertEquals(p + " -> " + l, l, convert.toLine(p));
	}

	public void testToPoint() {
		// Y = X -> (0.5, 0.25)
		GLine l = new SpecLine(1, -1, 0);
		GPoint p = new SpecPoint(0.5, 0.25);
		
		assertEquals(l + " -> " + p, p, convert.toPoint(l));
	}
}
