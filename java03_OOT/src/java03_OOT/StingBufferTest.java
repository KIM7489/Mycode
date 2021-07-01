package java03_OOT;

public class StingBufferTest {

	public StingBufferTest() {
	start();
	}
	public void start() {
		StringBuffer sb1 = new StringBuffer();// 16byte
		StringBuffer sb2 = new StringBuffer(100);// 100byte
		// append() : 문자열 추가
		sb1.append("Buffer append Test..");
		sb1.append(123456);
		
		// insert(): index위치 문자 삽입
		sb1.insert(5,"스트링버퍼");
		sb1.insert(15, 23235.123123);
		// 012345 7
		// Buffe
	//delete
		sb1.deleteCharAt(1);
		sb1.delete(1,4); // index 1부터 4앞까지 지우기
	//replace
		sb1.replace(1, 3, "(자바)"); // index 1부터 3앞까지를 "(자바)"로 치환
	//reverse
		sb1.reverse();
	
		//확보된 공간 확인하기
		System.out.println("sb1.capacity=" +sb1.capacity());
		System.out.println("sb1.capacity=" +sb2.capacity());
		System.out.println(sb1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
