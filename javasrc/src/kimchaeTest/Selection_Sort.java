package kimchaeTest;
import java.util.Random;
public class Selection_Sort {

	public static void main(String[] args) {
		// 1~100������ ������ 10���̻� �����Ͽ� �迭������ ������������ �����ϰ� ����϶�
		// Selection Sort[���� ����] �̿�.
	
	//�迭 ����
	int math[] = new int[10];

	//���� ����
	for(int i=0; i<math.length;i++) {
	   
	double random = Math.random();
	    math[i] = (int)(random*100+1-1)+1;
   //���� �˿�
		if(math[i]==0) {
			System.out.print("�ٽ� �ۼ����� �Ф�");
			break;
		}
	}
	
	 // ��������
	
		for(int i = 0; i < math.length-1; i++) {// 0,1,3,4,5,6,7,8
			for(int j = i+1; j < math.length; j++) {   
				// 0 -> 1 2 3 4 5 6 7 8 9
				// 1 -> 2 3 4 5 6 7 8 9 
				if(math[i] < math[j]) {
				int min = math[i];
				math[i]=math[i];
				math[i] = min;
				}
			}
		}
			
		for(int data: math) {
			System.out.print(data+"\t");
		}
		System.out.println();
			}
	
 
	}

