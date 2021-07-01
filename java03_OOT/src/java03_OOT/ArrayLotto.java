package java03_OOT;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayLotto {
	    Scanner scan = new Scanner(System.in); // 스케너 선언 inputLotto() start() 공용
//생성자
	
	public ArrayLotto() {
		start();
	
	}
	
//입력 메소드
	
	public int inputLotto() {
		System.out.print("게임수=");
		return scan.nextInt();
	}

// 난수 생성 메소드
	
	public int lottorandom() { //1 ~ 45 
		int min = 1;
		int max = 45;
		int number = (int)((Math.random()*(max-min))+min); // Math.random() = 0 ~ 1 미만 실수 랜덤 생성  // 1 ~ 45 이하 난수 생성
		return number;   // 1부터 45 이하의 난수를 리턴
	}

// 중복 제거 메소드
	
	
// 실행 메소드
	
	public void start() {
		int over = 1; // while 실행 조건 
		do { 
			int game = inputLotto();
			int[] lottonumber = new int[6];
			int[] bonus = new int[1];
		for(int i = 0; i < game; i++) { // 게임수 만큼 반복
		 
			for(int j = 0; j < lottonumber.length; j++) { // 난수를 배열에 저장
			 lottonumber[j] = lottorandom();
           
			 for(int  c=0; c<j; c++) {  // 중복 제거  
             if(lottonumber[j] == lottonumber[c]) {  
            	 j--;
             } 
            }
		 }
		 Arrays.sort(lottonumber); // 난수 정렬 
		 
		 for(int b = 0; b < lottonumber.length; b++) { // 보너스 중복 제거
			bonus[0] = lottorandom();
			 if(bonus[0] == lottonumber[b]) {
				 b--;
			 }
		 }
		 System.out.println("번호 ="+Arrays.toString(lottonumber)+"보너스="+Arrays.toString(bonus)); // Arrays.toString 배열 내용 출력
		}
		System.out.println("계속하시겠습니까[1:예, 2:아니오]?");
		over = scan.nextInt(); // while 실행 종료 결정
		} while(over == 1); 
	}
	public static void main(String[] args) {
		new ArrayLotto();
		
	}

}
