package javareview;
import java.util.Scanner;
public class ArraySquare {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		char a = 'Y';
		do {
			System.out.print("프로그램을 시작하시겠습니까? Y/N :");
			a = scan.next().charAt(0);
			System.out.print("정사각형 크기를 입력하시오:");
			int inumber = scan.nextInt();
			int[][] gugudan = new int[inumber][inumber];
			int c = inumber;
			char ad = 'a';
			char ac = 'b';
			String ae = "";
		
		for(int i = 0; i < gugudan.length-1; i++) {  
		 for(int j = 0; j < gugudan.length-1; j++){ 
			 gugudan[i][j] = (i+1) * (j+1);
			 gugudan[i][inumber-1] += gugudan[i][j];
			 gugudan[inumber-1][j] += gugudan[i][j];
		 }
			}
		
		for(int i = 0; i < gugudan.length; i++) { 
			for(int j = 0; j < gugudan.length; j++) {
				System.out.print(gugudan[i][j]+"\t");
			}
			System.out.println();
		}  
		System.out.println("종료 하시려면 \"\"를 입려하시오:");
		} while(a == 'Y');
	}
}
