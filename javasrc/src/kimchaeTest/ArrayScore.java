package kimchaeTest;
import java.util.Scanner;
public class ArrayScore {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.print("학생수=");
	int person = scan.nextInt();
	
	int num[][] = new int[person][7];
	
    for(int i = 0; i < person+2; i++) {
    	
    	System.out.print("이름=");
        int name = scan.nextInt();
    	
    	System.out.print("국어=");
    	int kor = scan.nextInt();
    	
    	System.out.print("수학=");
    	int math = scan.nextInt();
    	
    	System.out.print("영어=");
    	int eng = scan.nextInt();
    	
    	int total = kor+math+eng; 
    	int ave = total/3;
    	
    for(int j = 0; j < 7; j++) {
    	if(i < person) {
    	num[i][0] = name;
    	num[i][1] = kor;
    	num[i][2] = math;
    	num[i][3] = eng;
    	num[i][4] = total;
    	num[i][5] = ave;
    	}
    }
    }
   
   for(int i = 0; i < 3; i++) {
	int k = 1;
	   num[person][i+1] = num[k][i+1] + num[i][i+1]+ num[i][i+1];
	   num[person+1][i+1] = num[person][i+1];
	   k++;
	   
   }

	}

}
/*
학생수를 입력받아 이름과 , 세과묵의 점수를 입력받은 후
각 학생의 총점, 평균, 석차, 과목별총점, 평균을 구하여
석차순으로 출력하라. 

실행
학생수 = 3
이름 = 홍길동
국어 = 90
영어 = 89
수학 = 90
이름 = 이순신
국어 = 80
영어 = 89
수학 = 90
이름 = 김병채
국어 = 90
영어 = 90
수학 = 90
:
:
=========================================================================
이름    국어     영어     수학    총점     평균    석차
=========================================================================
홍길동   90      89     90     269       
이순신   90      90     43    
김병채   90      89     50     


과목별 총점 ---  --- ---
과목별 평균 ---  --- ---
*/