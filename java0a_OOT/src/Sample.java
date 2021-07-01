class Test{
	int x;
	public void setX(int x) {this.x = x;}
	public int getX() {return x;}
}
class Ex{
	Test y;
	public void setY(Test y) {this.y=y;}
	public Test getY() {return y;}
}
	public class Sample {
	public static void main(String[] args) {
		Ex o = new Ex();
		Test i = new Test();
		int n =10;
		i.setX(n);
		o.setY(i);
	System.out.println(o.getY().getX());
}
}
