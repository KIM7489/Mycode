package kimchaeTest;
import java.util.Scanner;
public class ArrayScore {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.print("�л���=");
	int person = scan.nextInt();
	
	int num[][] = new int[person][7];
	
    for(int i = 0; i < person+2; i++) {
    	
    	System.out.print("�̸�=");
        int name = scan.nextInt();
    	
    	System.out.print("����=");
    	int kor = scan.nextInt();
    	
    	System.out.print("����=");
    	int math = scan.nextInt();
    	
    	System.out.print("����=");
    	int eng = scan.nextInt();
    	
    	int total = kor+math+eng; 
    	int ave = total/3;
    	
    for(int j = 0; j < 7; j++) {
    	if(i < person) {
    	num[i][0] = name;
    	num[i][1] = kor;
    	num[i][2] = math;
    	num[i][3] = eng;
    	num[i][4] = total;
    	num[i][5] = ave;
    	}
    }
    }
   
   for(int i = 0; i < 3; i++) {
	int k = 1;
	   num[person][i+1] = num[k][i+1] + num[i][i+1]+ num[i][i+1];
	   num[person+1][i+1] = num[person][i+1];
	   k++;
	   
   }

	}

}
/*
�л����� �Է¹޾� �̸��� , �������� ������ �Է¹��� ��
�� �л��� ����, ���, ����, ��������, ����� ���Ͽ�
���������� ����϶�. 

����
�л��� = 3
�̸� = ȫ�浿
���� = 90
���� = 89
���� = 90
�̸� = �̼���
���� = 80
���� = 89
���� = 90
�̸� = �躴ä
���� = 90
���� = 90
���� = 90
:
:
=========================================================================
�̸�    ����     ����     ����    ����     ���    ����
=========================================================================
ȫ�浿   90      89     90     269       
�̼���   90      90     43    
�躴ä   90      89     50     


���� ���� ---  --- ---
���� ��� ---  --- ---
*/