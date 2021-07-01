import java.util.Scanner;
public class ForTest8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		int menu = scan.nextInt();
		System.out.print("가로");
		if(menu == 1) {
	    System.out.print("가로=");
	    int w = scan.nextInt();
	    System.out.print("세로=");
	    int h= scan.nextInt();
	   
		}

	}
	}
}
/* 
사각형의 넓이 = 가로 * 세로
원의 넓이 = 반지름 * 반지름 * 3.145192
 
실행 
메뉴[1.사각형의 넓이, 2. 원의 넓이, 3. 종료]? 1
가로=
세로=
사각형의 넓이=

메뉴[1.사각형의 넓이, 2. 원의 넓이 3. 종료]? 2 
반지름 = 
원의 넓이 =

메뉴[1.사각형의 넓이, 2. 원의 넓이 3. 종료]? 3


 */