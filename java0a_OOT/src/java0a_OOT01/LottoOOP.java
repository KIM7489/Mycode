package java0a_OOT01;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoOOP {
	Random random = new Random();
	Scanner scan = new Scanner(System.in);
	public LottoOOP() {
	
	}
	// 1게임 만들기 + 보너스 포삼 중복검사
	 int[] lottocCreate() {
		int lotto[] = new int[7];
		for(int i =0; i<lotto.length; i++) {
			//로또번호 생성
			lotto[i] = random.nextInt(45)+1;
			//중복 검사 호출
			i = doubleCheck(lotto, i);
		}
		return lotto;
	}
	
	//중복 검사
	public int doubleCheck(int lotto[], int i) {
		for(int j = 0; j < i; j++) {
			if(lotto[j] == lotto[i]) {
				i--;
				break;
			}
		}
		return i;
	}
	
	//출력
	public void lottoprint(int cnt, int lotto[]) {
		System.out.print(cnt+"게임=");
		System.out.print(Arrays.toString(Arrays.copyOfRange(lotto, 0, 5)));//번호
		System.out.println(", bonus="+ lotto[6]);
	}
	//계속여부 확인하는 메소드
	public boolean yesNo() {
		do{
			System.out.print("계속하시겠습니까(y:예, n:아니오)?");
		String qa = scan.nextLine();
		if(qa.equalsIgnoreCase("y")) {
			return true;
		}else if(qa.equalsIgnoreCase("n")) {
			return false;
		}	
	}while(true);
		}
	public void lottoStrat() {
		do {
			System.out.println("게임수=");
			int game = Integer.parseInt(scan.nextLine());
			
			for(int i=1; i<= game; i++) {
			int lotto[]= lottocCreate();
			Arrays.sort(lotto,0,5); //정렬
			lottoprint(i, lotto);//출력
			}
		} while(true);
	}
	public static void main(String[] args) {
		LottoOOP oop = new LottoOOP();
		oop.lottoStrat();
	}

}
