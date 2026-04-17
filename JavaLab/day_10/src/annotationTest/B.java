package annotationTest;

public class B extends A {

	@Override
	public void m1() {
		System.out.println("In m1() of B");
	}
	
	@Deprecated
	public void m2() {
		//...
	}
	@SuppressWarnings("unused")
	public void m3() {
//		@SuppressWarnings("unused")
		int y;
	}

}
