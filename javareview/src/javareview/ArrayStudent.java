package javareview;
import java.util.Scanner;

public class ArrayStudent {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		do {  
		 
		System.out.print("�л���=");
		int student = scan.nextInt();
		scan.nextLine();
		String name[] = new String[student];
		int main[][] = new int[student+2][6];
		
		
		String tittle[] = {"����","����","����"};
		
		for(int i = 0; i < student; i++) {
			System.out.print("�̸� =");
			name[i] = scan.nextLine();
		  for(int j = 0; j < tittle.length; j++) {
			 System.out.print(tittle[j]+"=");
			 main[i][j] = scan.nextInt();
		  }
		  scan.nextLine();
		}
			
		//���
		System.out.println("�̸�\t����\t����\t��Ȯ\t����\t���\t����\t");
		
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
