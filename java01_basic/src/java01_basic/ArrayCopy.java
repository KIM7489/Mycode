package java01_basic;

public class ArrayCopy {

	public static void main(String[] args) {
		//배열의 복사
		// 얕은 복사 
		// 깊은 복사 
		int num[] = {20, 33, 23 , 34, 23, 53 ,32 ,12};
		// 원본 배열 명
		// arraycopy(object src, int srcPos, object dest, int destPos, int length)
	 
		
		//num 배열에서 index 2에서부터 3개만 복사를 하여 새로운 배열에 대입
		
		int target[] = new int[10];
		
		System.arraycopy(num ,0 ,target ,1 ,5);
		for(int i =0; i<target.length; i++) {
		System.out.println("target["+ i +"]"+ target[i]);
		}
	}

}
