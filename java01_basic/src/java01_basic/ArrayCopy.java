package java01_basic;

public class ArrayCopy {

	public static void main(String[] args) {
		//�迭�� ����
		// ���� ���� 
		// ���� ���� 
		int num[] = {20, 33, 23 , 34, 23, 53 ,32 ,12};
		// ���� �迭 ��
		// arraycopy(object src, int srcPos, object dest, int destPos, int length)
	 
		
		//num �迭���� index 2�������� 3���� ���縦 �Ͽ� ���ο� �迭�� ����
		
		int target[] = new int[10];
		
		System.arraycopy(num ,0 ,target ,1 ,5);
		for(int i =0; i<target.length; i++) {
		System.out.println("target["+ i +"]"+ target[i]);
		}
	}

}
