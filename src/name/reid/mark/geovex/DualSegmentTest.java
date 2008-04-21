package name.reid.mark.geovex;


public class DualSegmentTest {

	public void testGetStart() {
		SpecSegment s = new SpecSegment(new SpecPoint(0,0), new SpecPoint(0.5, 0.5));
		ROCSIConverter conv = new ROCSIConverter();
		
		System.out.println(s);
		
		DualSegment d = new DualSegment(s, conv);
		System.out.println(d);
		
		conv.setPrior(0.25f);
		System.out.println(d);
		
//		assertTrue(true);
	}

}
