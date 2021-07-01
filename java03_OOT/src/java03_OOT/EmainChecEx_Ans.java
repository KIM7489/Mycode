package java03_OOT;
import java.util.Scanner;

public class EmainChecEx_Ans {
	
	
	public EmainChecEx_Ans() {
		
	}
	public void start() {
		do {
			String email = inputEmail();
			if(emailCheck(email)) {// 제대로 된 이메일
				//아이디, 도메인 분리 출력
				 emailPrint(email);
			} else {// 잘못된 메일
				erroMailMessage(email);
			}
		} while(true);
		
	}
	//아이디 도메인 분리하여 출력하기
	
	public void emailPrint(String email) {
	/*String emailSplit[] = email.split("@");
	System.out.println("아이디="+emailSplit[0]);
	System.out.println("도메인="+ emailSplit[1]);
	*/
	int atMark = email.indexOf("@");
	String id = email.substring(0,atMark);
	String domain = email.substring(atMark+1);
	System.out.println("아이디="+id);
	System.out.println("도메인="+ domain);
	
	}
	//이메일입력
	public String inputEmail() {
		Scanner scan = new Scanner(System.in);
		System.out.println("이메일입력=");
		return scan.nextLine();
	}
	//이메일 정상, 잘못 확인
	public boolean emailCheck(String email) {
		// 정상 : true 잘못 : false
		//@ : atmark
		int atMark = email.indexOf("@"); // 0 1 2 3 4 5 -1
		int point = email.indexOf(".");
		if(atMark == -1 || point == -1 || atMark > point || point-atMark <= 2 ) {//잘못된 메일주소일때
			return false;
		} else {//정상메일 일때
			return true;
		}
	}
	//잘못된 메일 메시지
	public void erroMailMessage(String email) {
		System.out.println(email+"은 잘못된 이메일 주소입니다.");
	}
	
	
	
	
	public static void main(String[] args) {
		new EmainChecEx_Ans().start();

	}

}
