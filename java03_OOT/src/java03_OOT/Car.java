package java03_OOT;

public class Car extends Object {
	int speed = 0;
	final int SPEED_MAX = 180;
	final int SPEED_MIN = 0;
	String carName = "�׷���";
	
	public Car() {
		System.out.println("Car()�����ڸ޼ҵ� ����");
	}
	public Car(String carName) {
		this.carName = carName;
		System.out.println("Car(String)������ �޼ҵ� ����");
	}
	public void speedUp() {
		speed++;
		if(speed>=SPEED_MAX) speed=SPEED_MAX;
	}
	public void speedDown() {
		speed--;
		if(speed<=SPEED_MIN) {
			speed = SPEED_MIN;
		}
	}
}
