package java03_OOT;

public class Truck extends Car {
	int speed = 100;
	public Truck() {
		System.out.println("Truck()������ �޼ҵ� ����");
		System.out.println("Truck.speed->"+speed);
		super.speedUp();
	}
	
	public Truck(String carName) {
		//����Ŭ������ ������ �޼ҵ� ȣ��
		//�ݵ�� ù��° ���๮�̿��� �Ѵ�.
		super(carName);
		System.out.println("Truck(String)������ ����~~~");
	}
		//overriding : ����Ŭ������ �޼ҵ带 ����Ŭ�������� ������
		// 			   ��ȯ��, �޼ҵ��. �Ű������� ���� �޼ҵ带 �������ϴ� ���̴�. 
	public void seedUp() {
		speed +=10;
		if(speed>=SPEED_MAX) {
		   speed=SPEED_MAX;
		}
		System.out.println("truck.speed="+speed);
	}

}
