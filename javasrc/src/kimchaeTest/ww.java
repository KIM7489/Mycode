package kimchaeTest;
import java.util.Scanner;
public class ww {
	
	ww(){

	 }
	void start() {
		while(true) {
		try {
			Scanner scan = new Scanner(System.in);
		    System.out.print("�л���=");
			int cnt = Integer.parseInt(scan.nextLine());
			
			//������ ������ ���� Ȯ��
			String name[] = new String[cnt];// �л��̸� ������ �迭
			int jumsu[][] = new int[cnt+2][6];// �л� ������ ������ �迭
			
			// �̸��� ������ �Է¹޾� �迭�� ����
			String tittle[] = {"����", "����", "����"};
		    
			for(int i = 0; i < cnt; i++) {//0,1,2,3
		        System.out.print("�̸�=");
		         name[i] = scan.nextLine();
		         for(int j = 0; j <tittle.length; j++) {
		        	 System.out.print(tittle[j]+"=");
		        	 jumsu[i][j] = Integer.parseInt(scan.nextLine());
		         }
		    }
			// ���κ� ����, ��� 
			// ���� ����
			for(int i =0; i < cnt; i++) {// 0,1,2
				for(int j=0; j<3; j++) {// 0,1,2
				     jumsu[i][3] += jumsu[i][j]; //���κ� ����
				     jumsu[cnt][j]+= jumsu[i][j];//��������
				}
				//���κ� ���
				jumsu[i][4] = jumsu[i][3]/3;
			}
			    //���� ���
			for(int i =0; i<3; i++) {
				jumsu[cnt+1][i] = jumsu[cnt][i]/cnt;
			}
			    //���� ���ϱ�
			for(int i = 0; i<cnt; i++) {//0,1,2,3
				//i�� �������� ��ġ
				for(int j =0; j<cnt; j++) {
					//������           //���� ����
					if(jumsu[i][3] < jumsu[j][3]) {
					   jumsu[i][5]++;
					}
				}
				jumsu[i][5]++;
			}
			for(int i=0; i<cnt-1; i++) {//3 �� -> 0,1
				// 3-1-0
				for(int j=0; j<cnt-1-i; j++) {// 0,1,
					if(jumsu[j][5] > jumsu[j+1][5]) {
						//��ȯ
						//�̸��ٲٱ�
						String nameTemp = name[j];
						name[j] = name[j];
						name[j+1] = nameTemp;
						
						for(int k=0; k<jumsu[j].length; k++) {
							int temp = jumsu[j][k];
							jumsu[j][k] = jumsu[j+1][k];
							jumsu[j+1][k] = temp;
						}
					}
				}
			}
			
			//=======���============================
				System.out.println("�̸�\t����\t����\t����\t����\t���\t����");
			for(int i = 0; i< cnt; i++) {//i =0
				//�̸�
				System.out.print(name[i]+"\t");
		        //������� ����, ����, ����. ����, ���
				for(int j=0; j<jumsu[i].length; j++) {
					System.out.print(jumsu[i][j]+"\t");
				}
				System.out.println();
			}
			//���� ����
			System.out.print("����\t");
			for(int i=0; i<3; i++) {//012
				System.out.print(jumsu[cnt][i]+"\t");
			}
			System.out.println();
			//���� ����
				System.out.print("���\t");
			for(int i =0; i<3; i++) {
				System.out.print(jumsu[cnt+1][i]+"\t");
			}
			System.out.println();
			System.out.println("��� �����Ͻðڽ��ϱ�? Y/N");
			String cc = scan.nextLine();
		}catch(NumberFormatException e) {
			System.out.println("�Է��Ͻ� ������ ���ڰ� �ƴմϴ�. �ٽ� �Է��� �ּ���.");
		}
	}
	}
	public static void main(String[] args)  {
		ww cc = new ww();
		cc.start();
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