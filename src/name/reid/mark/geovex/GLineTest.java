package name.reid.mark.geovex;

import junit.framework.TestCase;


public class GLineTest extends TestCase {

	public void testSlope() {
		// Line representing Y = X;
		GLine line = new SpecLine(1, -1, 0);
		assertEquals("Slope of " + line, 1.0, line.slope(), GLine.TOLERANCE);

		// Change of intercept does not affect slope
		line = new SpecLine(1, -1, 10);
		assertEquals("Slope of " + line, 1.0, line.slope(), GLine.TOLERANCE);		

		// Scaling of coefficients does not affect slope
		line = new SpecLine(2, -2, 10);
		assertEquals("Slope of " + line, 1.0, line.slope(), GLine.TOLERANCE);

		// Negative of earlier coefficients leaves slope the same
		line = new SpecLine(-1, 1, 10);
		assertEquals("Slope of " + line, 1.0, line.slope(), GLine.TOLERANCE);
		
		// Change of intercept does not affect slope
		line = new SpecLine(1, -1, 10);
		assertEquals("Slope of " + line, 1.0, line.slope(), GLine.TOLERANCE);
		
		// Line representing Y = -X;
		line = new SpecLine(1, 1, 0);
		assertEquals("Slope of " + line, -1.0, line.slope(), GLine.TOLERANCE);

		// Change of intercept does not affect slope
		line = new SpecLine(1, 1, 10);
		assertEquals("Slope of " + line, -1.0, line.slope(), GLine.TOLERANCE);		

		// Scaling of coefficients does not affect slope
		line = new SpecLine(2, 2, 10);
		assertEquals("Slope of " + line, -1.0, line.slope(), GLine.TOLERANCE);

		// Negative of earlier coefficients leaves slope the same
		line = new SpecLine(-1, -1, 10);
		assertEquals("Slope of " + line, -1.0, line.slope(), GLine.TOLERANCE);
		
		// Change of intercept does not affect slope
		line = new SpecLine(1, 1, 10);
		assertEquals("Slope of " + line, -1.0, line.slope(), GLine.TOLERANCE);		
	}

	public void testIntercept() {
		// Line representing Y = X;
		GLine line = new SpecLine(1, -1, 0);
		assertEquals("Intercept of " + line, 0.0, line.intercept(), GLine.TOLERANCE);

		// Scaling of coefficients does not affect intercept
		line = new SpecLine(2, -2, 0);
		assertEquals("Intercept of " + line, 0.0, line.intercept(), GLine.TOLERANCE);

		// Negative of earlier coefficients leaves intercept the same
		line = new SpecLine(-1, 1, 0);
		assertEquals("Intercept of " + line, 0.0, line.intercept(), GLine.TOLERANCE);
		
		// Intercept for Y = X + 5
		line = new SpecLine(1, -1, -5);
		assertEquals("Intercept of " + line, 5.0, line.intercept(), GLine.TOLERANCE);
	}

	public void testIsVertical() {
		// Line representing X = 0 is vertical;
		GLine line = new SpecLine(1, 0, 0);
		assertTrue(line + " is vertical", line.isVertical());

		// Line representing Y = 0 is not vertical;
		line = new SpecLine(0, 1, 0);
		assertFalse(line + " is not vertical", line.isVertical());

		// Line representing X = -5 is vertical;
		line = new SpecLine(1, 0, -5);
		assertTrue(line + " is vertical", line.isVertical());

		// Line representing Y = 20 is not vertical;
		line = new SpecLine(0, 1, 20);
		assertFalse(line + " is not vertical", line.isVertical());

		// Line representing Y = X is not vertical;
		line = new SpecLine(1, -1, 0);
		assertFalse(line + " is not vertical", line.isVertical());

		// Line representing Y = X + 1is not vertical;
		line = new SpecLine(1, -1, -1);
		assertFalse(line + " is not vertical", line.isVertical());

		// Line representing 0.1Y + 10000X = 0 is vertical;
		line = new SpecLine(10000, 0.1, 0);
		assertTrue(line + " is vertical", line.isVertical());

		// Line representing 50Y + 1000000X = 20000 is vertical;
		line = new SpecLine(1000000, 50, 20000);
		assertTrue(line + " is vertical", line.isVertical());
	}

	public void testEquals() {
		GLine l1 = new SpecLine(1, -1, 0);
		GLine l2 = new SpecLine(2, -2, 0);
		assertEquals(l1 + " = " + l2, l1, l2);

		l1 = new SpecLine(-1, 1, 0);
		l2 = new SpecLine(2, -2, 0);
		assertEquals(l1 + " = " + l2, l1, l2);

		l1 = new SpecLine(1, -1, 10);
		l2 = new SpecLine(2, -2, 20);
		assertEquals(l1 + " = " + l2, l1, l2);

		l1 = new SpecLine(1, 0, -5);
		l2 = new SpecLine(2, 0, -10);
		assertEquals(l1 + " = " + l2, l1, l2);

		l1 = new SpecLine(1, -1, 10);
		l2 = new SpecLine(2, -2, 20.000001);
		assertEquals(l1 + " = " + l2, l1, l2);

		l1 = new SpecLine(1, -1, 10);
		l2 = new SpecLine(2, -2.000001, 20.000001);
		assertEquals(l1 + " = " + l2, l1, l2);
	}
}
