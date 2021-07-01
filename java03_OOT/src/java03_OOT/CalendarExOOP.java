package java03_OOT;
import java.util.Calendar;
import java.util.Scanner;

public class CalendarExOOP {
	Scanner scan = new Scanner(System.in);
	Calendar date;  //null
	
	public CalendarExOOP() {
			calendarStart();
	}
				
	public void calendarStart() {
		///////////
		int year = getDate("�⵵");
		int month = getDate("��");
		
		titleprint(year,month);  //��������� �޼ҵ� ȣ��
		
		date = Calendar.getInstance();
		//�Է¹��� ���, 1���� ����
		date.set(year, month-1,1); // �� , �� , ��
		//���� ���ϱ�
		int week = date.get(Calendar.DAY_OF_WEEK); // ���� ���� ���� ���� 3
		//���������� �̿��Ͽ� �������
		spaceprint(week-1);
		//���� ����� ��������
		int lastDay = date.getActualMaximum(Calendar.DAY_OF_MONTH);
		//��¥ ���
		dayprint(week-1, lastDay);
	};   
		//��¥ ���
		public void dayprint(int space, int lastDay) {
			for(int day =1; day<=lastDay; day++) {
				System.out.print(day+"\t");
				if((day+space)%7==0) { 
					System.out.println();
				}
			}
		}
		//
	public void spaceprint(int cnt) {
	    for(int i=1; i<=cnt; i++) {
	    	System.out.print("\t");	
	}
	}
//Ÿ��Ʋ ���
	public void titleprint(int year, int month) {
		System.out.println("\t\t"+year+"��"+month+"��");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��\t");
	}
	/// �ֿܼ��� �⵵, ���� �Է¹޴� �޼ҵ� 
	public int getDate(String msg) {
		System.out.print(msg+"->");
		return Integer.parseInt(scan.nextLine());
	}
	
	
	public static void main(String[] args) {
		new CalendarExOOP(); 

	}

}
