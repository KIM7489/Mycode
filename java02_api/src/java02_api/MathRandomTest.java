package java02_api;

public class MathRandomTest {

	public static void main(String[] args) {
		// ���� : ��ǻ�Ͱ� ����Ǵ� ������ 0.0�� 1.0������ ���� �����ȴ�.
		
		for(int i=1; i<=1000; i++) {
			double ran = Math.random();
			// (����ȭ)(����*(ū��-������+1))+������
			int ranInt = (int)(ran*(6-1+1)) + 1;
			System.out.print(ranInt+"\t");
			if(i%10==0)System.out.println();
		}

	}

}
