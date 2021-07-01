package java03_OOT;
import java.util.Scanner;
public class EmainChecEx_Ans01 {
	Scanner scan = new Scanner(System.in);
	
	String data = "1@1";
	String data1 = "";
	
	
	
	public EmainChecEx_Ans01() {
	
	}
	
	public void start() {
		do {
			System.out.println("이메일입력 =");
			String email = scan.nextLine();
			data1 = email;
			email_01();
		} 
		
		while(data1 != data);
		}
	
	void email_01() {
		if(data.equals(data1)) {
		String[] data2 = data1.split("@");
		
		System.out.print("아이디="+data2[0]+"\n");
		System.out.print("도메인="+data2[1]+"\n");
		} else {
			System.out.println("이메일을 잘못 입력하였습니다.");
		}
	}
	public static void main(String[] args) {
		
		new EmainChecEx_Ans01().start();

	}

}
/*
실행
이메일 입력 = goguma
이메일을 잘못입력하였습니다.

이메일 입력 = goguma.nate@com
이메일을 잘못 입력하였습니다.

이메일 입력= goguma777@nate.com
아이디 = goguma777 
도메인 = nate.com

이메일 입력 = 
*/