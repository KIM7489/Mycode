package test;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottotTry {
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	public LottotTry() {}

	
	//입력메소드
	
	int lottoCount()  {
		System.out.print("게임수 입력:");
		return Integer.parseInt(scan.nextLine());
	}
	
	//난수 생성 + 중복 제거 메소드
	
	int[] lottoNumber() {
		int[] number = new int[7];
	for(int j = 0; j < number.length; j++) { //배열에 난수 저장
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
	
	//출력 메소드
	void outNumber() {
		int number[] = lottoNumber();
	for(int i = 0; i < number.length; i++) {
		if(i==6) {
			System.out.print("\t"+"보너스="+number[i]);
		} else {
		System.out.printf("[%s]",number[i]);}
		}
	}
	
	//실행 메소드
	void start() {
	try {
		String out = "Y";
		String cc;
		boolean over = true; 
while(over) {
		int cnt = lottoCount();
		for(int i = 1; i <= cnt; i++) {
			System.out.printf("%d 게임 =",i);
			outNumber();
			System.out.println();
		}
		System.out.println();
		System.out.print("시스템을 종료 하시겠습니까? (Y/N)");
		out = scan.nextLine();
	
		if(out.equals("Y") || out.equals("y")) {
			System.out.println("========시스템을 종료합니다.========");
			break; 
		} else if(out.equals("N") || out.equals("n")){
			System.out.println("======== Regame ========");
		} else {
			while(true) {
				System.out.println("Y 또는 N가 아닙니다. 다시입력하시오");
				 cc = scan.nextLine();
				 if(cc.equals("Y") || cc.equals("y")) {
					 over = false;
					 System.out.println("========시스템을 종료합니다.========");
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
		System.out.println("입력하신 정보가 숫자가 아닙니다 다시 입력해 주세요.");
		start();
}

	}
	public static void main(String[] args) {
		new LottotTry().start();

	}

}
