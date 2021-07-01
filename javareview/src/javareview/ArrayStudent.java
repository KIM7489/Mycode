package javareview;
import java.util.Scanner;

public class ArrayStudent {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		do {  
		 
		System.out.print("학생수=");
		int student = scan.nextInt();
		scan.nextLine();
		String name[] = new String[student];
		int main[][] = new int[student+2][6];
		
		
		String tittle[] = {"국어","영어","수학"};
		
		for(int i = 0; i < student; i++) {
			System.out.print("이름 =");
			name[i] = scan.nextLine();
		  for(int j = 0; j < tittle.length; j++) {
			 System.out.print(tittle[j]+"=");
			 main[i][j] = scan.nextInt();
		  }
		  scan.nextLine();
		}
			
		//출력
		System.out.println("이름\t국어\t영어\t수확\t총점\t평균\t석차\t");
		
		for(int i = 0; i < main.length; i++) {
			System.out.print(name[0]+"\t");
			for(int j = 0; j < main.length; j++) {
			System.out.print(main[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		} while(true);

	}

}
