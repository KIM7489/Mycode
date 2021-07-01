package java01_basic;

public class ArrayTest01 {

	public static void main(String[] args) {
		//배열은 같은 데이터형으 ㅣ변수를 여러개 선언할 때 필요하다.
		
		//배열의 선언 (1차원배열)
		int num[] = new int[4]; // 정수:0 실수:0.0 논리형:false
		String[] name = new String[5]; //null
		num[2] = 100;
		name[1] = "홍길동";
		
		System.out.println("num[1]="+num[1]);
		System.out.println("num[0]="+num[0]);
		System.out.println("name[1]="+name[1]);
		//배열명.length -> 배열의 개수를 구하여 준다.
		for(int idx=0; idx < num.length; idx++) {//0
			System.out.println("num["+idx+"]="+num[idx]);

		}
		//배열 생성시 초기값 설정하는 방법 2
		int data3[] = {8,7,5,37,75};
		for(int i = 0;)
		
		}
		

	}


