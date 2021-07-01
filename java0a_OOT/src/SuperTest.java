class SuperTest {
	int a;
	
	public SuperTest(int a) {
	this.a = a;
	
	}

	
class SubTest extends SuperTest{
	
	public SubTest(int a) {super(a);}
	public SubTest() {super(10);}
	

}
	public static void main(String[] args) {
		SuperTest ob = new SuperTest(10); 
		SuperTest oc = new SubTest();
	}

}
