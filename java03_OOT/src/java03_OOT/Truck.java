package java03_OOT;

public class Truck extends Car {
	int speed = 100;
	public Truck() {
		System.out.println("Truck()생성자 메소드 실행");
		System.out.println("Truck.speed->"+speed);
		super.speedUp();
	}
	
	public Truck(String carName) {
		//상위클래스의 생성자 메소드 호출
		//반드시 첫번째 실행문이여야 한다.
		super(carName);
		System.out.println("Truck(String)생성자 실행~~~");
	}
		//overriding : 상위클래스의 메소드를 하위클래스에서 재정의
		// 			   반환형, 메소드명. 매개변수가 같은 메소드를 재정의하는 것이다. 
	public void seedUp() {
		speed +=10;
		if(speed>=SPEED_MAX) {
		   speed=SPEED_MAX;
		}
		System.out.println("truck.speed="+speed);
	}

}
