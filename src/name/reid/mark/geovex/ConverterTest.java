package name.reid.mark.geovex;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConverterTest {

	public Converter convert = new Converter();
	
	@Test
	public void testToSIPoint() {
		assertEquals(new GVPoint(0.5, 0.25), convert.toSIPoint(new GVLine(1,-1,0)));
		assertEquals(new GVPoint(0.5, 0.125), convert.toSIPoint(new GVLine(1,-1,-0.5)));
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
