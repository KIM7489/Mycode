package javareview;
import java.util.Scanner;
public class ArraySquare {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		char a = 'Y';
		do {
			System.out.print("���α׷��� �����Ͻðڽ��ϱ�? Y/N :");
			a = scan.next().charAt(0);
			System.out.print("���簢�� ũ�⸦ �Է��Ͻÿ�:");
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
		System.out.println("���� �Ͻ÷��� \"\"�� �Է��Ͻÿ�:");
		} while(a == 'Y');
	}
}
