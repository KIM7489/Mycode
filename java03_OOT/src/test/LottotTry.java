package test;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottotTry {
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	public LottotTry() {}

	
	//�Է¸޼ҵ�
	
	int lottoCount()  {
		System.out.print("���Ӽ� �Է�:");
		return Integer.parseInt(scan.nextLine());
	}
	
	//���� ���� + �ߺ� ���� �޼ҵ�
	
	int[] lottoNumber() {
		int[] number = new int[7];
	for(int j = 0; j < number.length; j++) { //�迭�� ���� ����
			number[j] = ran.nextInt(45)+1;
	
	for(int i = 0; i < j; i++) {
	     if(number[i] == number[j]) {
						j--;
					}
	
	}
		}
	Arrays.sort(number);
	return number;
	}
	
	//��� �޼ҵ�
	void outNumber() {
		int number[] = lottoNumber();
	for(int i = 0; i < number.length; i++) {
		if(i==6) {
			System.out.print("\t"+"���ʽ�="+number[i]);
		} else {
		System.out.printf("[%s]",number[i]);}
		}
	}
	
	//���� �޼ҵ�
	void start() {
	try {
		String out = "Y";
		String cc;
		boolean over = true; 
while(over) {
		int cnt = lottoCount();
		for(int i = 1; i <= cnt; i++) {
			System.out.printf("%d ���� =",i);
			outNumber();
			System.out.println();
		}
		System.out.println();
		System.out.print("�ý����� ���� �Ͻðڽ��ϱ�? (Y/N)");
		out = scan.nextLine();
	
		if(out.equals("Y") || out.equals("y")) {
			System.out.println("========�ý����� �����մϴ�.========");
			break; 
		} else if(out.equals("N") || out.equals("n")){
			System.out.println("======== Regame ========");
		} else {
			while(true) {
				System.out.println("Y �Ǵ� N�� �ƴմϴ�. �ٽ��Է��Ͻÿ�");
				 cc = scan.nextLine();
				 if(cc.equals("Y") || cc.equals("y")) {
					 over = false;
					 System.out.println("========�ý����� �����մϴ�.========");
					 break;
				 } else if (cc.equals("N") || cc.equals("n")) {
					 System.out.println("======== Regame ========");
					 break;
				 }
			}
		}
	
	}
}  catch(NumberFormatException e){
		String message = e.getMessage();
		System.out.println("�Է��Ͻ� ������ ���ڰ� �ƴմϴ� �ٽ� �Է��� �ּ���.");
		start();
}

	}
	public static void main(String[] args) {
		new LottotTry().start();

	}

}
