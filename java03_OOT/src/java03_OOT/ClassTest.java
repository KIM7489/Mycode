package java03_OOT;

public class ClassTest {
    int b;
	//생성자 메소드 : 객체를 생성할때 한번 실행되는 메소드
	//             메소드명이 클래스명과 같아야한다.
	// 생성자 메소드를 구현하지 않으면 컴파일시 컴파일러가
	// 매개변수가 없는 생성자메소드를 자동으로 추가 해준다.
    // ClassTest(){}

	ClassTest() {
	b= 1234;
		//실행문
		System.out.println("생성자메소드가 실해됨...");
	}

	ClassTest(int a) {
		System.out.println(a+"메소드 실행");
	}
	//매소드 : 하나의 실행 단뒤
	//		클래스를 객체 생성후 메소드를 호출하여야 실행된다.
	//반환형 메소드명(매개변수, 매개변수){
	// }
	//메소드명 생성 규칙 :
	//			소문자로 시작한다. 합성어 일때는 두번째 단어에서 부터 첫번째 글자를 대문자로
	void sum() {
		//실행부
		System.out.println("메소드가 실행됨");
	}
	void total(int a, int d) {
		System.out.print("합으"+a);
	}
	//내부 클래스
}
	
