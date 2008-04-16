package name.reid.mark.geovex;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConverterTest {

	public Converter convert = new ROCSIConverter();
	
	@Test
	public void testToSIPoint() {
		assertEquals(new SpecPoint(0.5, 0.25), convert.toPoint(new SpecLine(1,-1,0)));
		assertEquals(new SpecPoint(0.5, 0.125), convert.toPoint(new SpecLine(1,-1,-0.5)));
	}

	@Test
	public void testToSILine() {
		fail("Not yet implemented");
	}

	@Test
	public void testToROCPoint() {
		fail("Not yet implemented");
	}

	@Test
	public void testToROCLine() {
		fail("Not yet implemented");
	}

	@Test
	public void testToROCCurve() {
		fail("Not yet implemented");
	}

}
