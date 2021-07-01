package test;
import java.util.Arrays;
import java.util.Scanner;
public class Sutudent {
	public Sutudent() {
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.print("학생수=");
		
		int student = Integer.parseInt(scan.nextLine());
		String subjectscore[][] = new String[student+2][7];
	//이름 평균 받기
		for(int i = 0; i < student; i++) {
			System.out.print("이름=");
			subjectscore[i][0] = scan.nextLine();
			System.out.print("국어=");
			subjectscore[i][1] = scan.nextLine();
			System.out.print("영어=");
			subjectscore[i][2] = scan.nextLine();
			System.out.print("수학=");
			subjectscore[i][3] = scan.nextLine();
			
          int a = Integer.parseInt(subjectscore[i][1]);
          int b = Integer.parseInt(subjectscore[i][2]);
          int c = Integer.parseInt(subjectscore[i][3]);
          String e = String.valueOf(a+b+c);
          String f = String.valueOf((a+b+c)/3);
          subjectscore[i][4] = e;
          subjectscore[i][5] = f;
		}
	
		for(int i = 1; i <= 3; i++) {
		String c;
		for(int j = 0; j < 1; j++) {
		int a = Integer.parseInt(subjectscore[j][i]);
		a += a;
		c = String.valueOf(a);
		subjectscore[student+1][1] = c;
		}
		}
		System.out.println("학생명\t국어\t영어\t수학\t총점\t평균\t석차\t");
	
		for(int i = 0; i < student+1; i++) {
			System.out.print(subjectscore[i][0]+"\t");
			for(int j= 1; j <= 6; j++) {
			System.out.print(subjectscore[i][j]+"\t");
			}
			System.out.println();
		}

	}
	
}
