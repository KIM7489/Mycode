import java.util.Scanner;

public class StandardWeight {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.print("���̸� �Է��Ͻÿ� :");
	int age = scan.nextInt();
	System.out.print("������ �Է��Ͻÿ� 1.����/2.���� :");
	int gender = scan.nextInt();
	System.out.print("Ű�� �Է��Ͻÿ� :");
	int tall = scan.nextInt();
	System.out.print("����ü���� �Է��Ͻÿ� :");
	int wgh = scan.nextInt();

	double wghmen =  (age >= 36)? (double)(tall - 100)*0.95 : (double)(tall - 100)*0.90;  //���� ǥ�� ü��
	double wghgril = (age >= 36)? (double)(tall - 100)*0.90 : (double)(tall - 100)*0.85;  //���� ǥ�� ü��
	
	double sum = (double)(wgh/wghmen)*100;    // ǥ��ü�� ����
	double sum2 = (double)(wgh/wghgril)*100;   // ǥ��ü�� ����
	String name = "";
	
    if(gender == 1) {
       
    	if(sum >= 126) {
    	//����
    	name = "����";
    } else if(sum >= 116 && sum <=125) {
    	//���� ����
    	name = "���� ����";
    } else if(sum >= 96 && sum <=115) {
    	// ǥ����
    	name = "ǥ����";
    } else if(sum >= 86 && sum <=95) {
    	// ���� ������
    	name = "���� ������";
    } else {
       // ������ 
    	name = "������";
    } 
    
    System.out.printf("����=%d\n����(1.����,2.����)=%d\nŰ=%d\n����ü��=%d\nǥ��ü��=%d\n����� ǥ��ü�������� %f ���� %s �Դϴ�.\n",age ,gender, tall, wgh , (int)wghmen, sum, name);
    
    }
    
    if(gender == 2) {
    	
    	if(sum2 >= 126) {
    	name = "����";
        } else if(sum2 >= 116 && sum2 <=125) {
        	name = "���� ����";
        } else if(sum2 >= 96 && sum2 <=115) {
        	name = "ǥ����";
        } else if(sum2 >= 86 && sum2 <=95) {
        	name = "���� ������";
        } else {
        	name = "������";
        } 
    	
    	System.out.printf("����=%d\n����(1.����,2.����)=%d\nŰ=%d\n����ü��=%d\nǥ��ü��=%d\n����� ǥ��ü�������� %f ���� %s �Դϴ�.\n",age ,gender, tall, wgh , (int)wghgril, sum2, name);
    
    }	
    }
	}
