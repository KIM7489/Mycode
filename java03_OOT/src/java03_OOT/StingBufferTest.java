package java03_OOT;

public class StingBufferTest {

	public StingBufferTest() {
	start();
	}
	public void start() {
		StringBuffer sb1 = new StringBuffer();// 16byte
		StringBuffer sb2 = new StringBuffer(100);// 100byte
		// append() : ���ڿ� �߰�
		sb1.append("Buffer append Test..");
		sb1.append(123456);
		
		// insert(): index��ġ ���� ����
		sb1.insert(5,"��Ʈ������");
		sb1.insert(15, 23235.123123);
		// 012345 7
		// Buffe
	//delete
		sb1.deleteCharAt(1);
		sb1.delete(1,4); // index 1���� 4�ձ��� �����
	//replace
		sb1.replace(1, 3, "(�ڹ�)"); // index 1���� 3�ձ����� "(�ڹ�)"�� ġȯ
	//reverse
		sb1.reverse();
	
		//Ȯ���� ���� Ȯ���ϱ�
		System.out.println("sb1.capacity=" +sb1.capacity());
		System.out.println("sb1.capacity=" +sb2.capacity());
		System.out.println(sb1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
