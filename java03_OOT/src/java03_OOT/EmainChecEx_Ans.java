package java03_OOT;
import java.util.Scanner;

public class EmainChecEx_Ans {
	
	
	public EmainChecEx_Ans() {
		
	}
	public void start() {
		do {
			String email = inputEmail();
			if(emailCheck(email)) {// ����� �� �̸���
				//���̵�, ������ �и� ���
				 emailPrint(email);
			} else {// �߸��� ����
				erroMailMessage(email);
			}
		} while(true);
		
	}
	//���̵� ������ �и��Ͽ� ����ϱ�
	
	public void emailPrint(String email) {
	/*String emailSplit[] = email.split("@");
	System.out.println("���̵�="+emailSplit[0]);
	System.out.println("������="+ emailSplit[1]);
	*/
	int atMark = email.indexOf("@");
	String id = email.substring(0,atMark);
	String domain = email.substring(atMark+1);
	System.out.println("���̵�="+id);
	System.out.println("������="+ domain);
	
	}
	//�̸����Է�
	public String inputEmail() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�̸����Է�=");
		return scan.nextLine();
	}
	//�̸��� ����, �߸� Ȯ��
	public boolean emailCheck(String email) {
		// ���� : true �߸� : false
		//@ : atmark
		int atMark = email.indexOf("@"); // 0 1 2 3 4 5 -1
		int point = email.indexOf(".");
		if(atMark == -1 || point == -1 || atMark > point || point-atMark <= 2 ) {//�߸��� �����ּ��϶�
			return false;
		} else {//������� �϶�
			return true;
		}
	}
	//�߸��� ���� �޽���
	public void erroMailMessage(String email) {
		System.out.println(email+"�� �߸��� �̸��� �ּ��Դϴ�.");
	}
	
	
	
	
	public static void main(String[] args) {
		new EmainChecEx_Ans().start();

	}

}
