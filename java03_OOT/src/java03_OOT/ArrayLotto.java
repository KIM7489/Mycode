package java03_OOT;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayLotto {
	    Scanner scan = new Scanner(System.in); // ���ɳ� ���� inputLotto() start() ����
//������
	
	public ArrayLotto() {
		start();
	
	}
	
//�Է� �޼ҵ�
	
	public int inputLotto() {
		System.out.print("���Ӽ�=");
		return scan.nextInt();
	}

// ���� ���� �޼ҵ�
	
	public int lottorandom() { //1 ~ 45 
		int min = 1;
		int max = 45;
		int number = (int)((Math.random()*(max-min))+min); // Math.random() = 0 ~ 1 �̸� �Ǽ� ���� ����  // 1 ~ 45 ���� ���� ����
		return number;   // 1���� 45 ������ ������ ����
	}

// �ߺ� ���� �޼ҵ�
	
	
// ���� �޼ҵ�
	
	public void start() {
		int over = 1; // while ���� ���� 
		do { 
			int game = inputLotto();
			int[] lottonumber = new int[6];
			int[] bonus = new int[1];
		for(int i = 0; i < game; i++) { // ���Ӽ� ��ŭ �ݺ�
		 
			for(int j = 0; j < lottonumber.length; j++) { // ������ �迭�� ����
			 lottonumber[j] = lottorandom();
           
			 for(int  c=0; c<j; c++) {  // �ߺ� ����  
             if(lottonumber[j] == lottonumber[c]) {  
            	 j--;
             } 
            }
		 }
		 Arrays.sort(lottonumber); // ���� ���� 
		 
		 for(int b = 0; b < lottonumber.length; b++) { // ���ʽ� �ߺ� ����
			bonus[0] = lottorandom();
			 if(bonus[0] == lottonumber[b]) {
				 b--;
			 }
		 }
		 System.out.println("��ȣ ="+Arrays.toString(lottonumber)+"���ʽ�="+Arrays.toString(bonus)); // Arrays.toString �迭 ���� ���
		}
		System.out.println("����Ͻðڽ��ϱ�[1:��, 2:�ƴϿ�]?");
		over = scan.nextInt(); // while ���� ���� ����
		} while(over == 1); 
	}
	public static void main(String[] args) {
		new ArrayLotto();
		
	}

}
