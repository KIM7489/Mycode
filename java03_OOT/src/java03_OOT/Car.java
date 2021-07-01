package java03_OOT;

public class Car extends Object {
	int speed = 0;
	final int SPEED_MAX = 180;
	final int SPEED_MIN = 0;
	String carName = "그랜져";
	
	public Car() {
		System.out.println("Car()생성자메소드 실행");
	}
	public Car(String carName) {
		this.carName = carName;
		System.out.println("Car(String)생성자 메소드 실행");
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
