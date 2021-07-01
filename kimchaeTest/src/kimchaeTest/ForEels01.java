package kimchaeTest;
import java.util.Scanner;
public class ForEels01 {
       public static void main(String[] agr) {
    	  //홀수 입력시 삼각형 출력 입력값의 숫자가 중간 영어 숫자와 같아야됨
    	 
    	 Scanner scan = new Scanner(System.in);
    	 int odd = scan.nextInt();
    	 int e = odd-1;
    	 int d = 0;
   
    
    	 for(int q = 1; q <= odd; q+=2) {
  
         for(int i = 1; i <= odd/2-d; i++) {
        	  System.out.print(" ");
        	 }
         for(int j = 1; j <= odd-e; j++) {
        	 System.out.print("A");
         }
         System.out.println();
         e -=2 ;
         d++;
       }
}
}