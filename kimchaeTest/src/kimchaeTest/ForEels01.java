package kimchaeTest;
import java.util.Scanner;
public class ForEels01 {
       public static void main(String[] agr) {
    	  //Ȧ�� �Է½� �ﰢ�� ��� �Է°��� ���ڰ� �߰� ���� ���ڿ� ���ƾߵ�
    	 
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