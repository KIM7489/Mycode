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
			System.out.println("�̸����Է� =");
			String email = scan.nextLine();
			data1 = email;
			email_01();
		} 
		
		while(data1 != data);
		}
	
	void email_01() {
		if(data.equals(data1)) {
		String[] data2 = data1.split("@");
		
		System.out.print("���̵�="+data2[0]+"\n");
		System.out.print("������="+data2[1]+"\n");
		} else {
			System.out.println("�̸����� �߸� �Է��Ͽ����ϴ�.");
		}
	}
	public static void main(String[] args) {
		
		new EmainChecEx_Ans01().start();

	}

}
/*
����
�̸��� �Է� = goguma
�̸����� �߸��Է��Ͽ����ϴ�.

�̸��� �Է� = goguma.nate@com
�̸����� �߸� �Է��Ͽ����ϴ�.

�̸��� �Է�= goguma777@nate.com
���̵� = goguma777 
������ = nate.com

�̸��� �Է� = 
*/