package java02_api;
import java.util.Random;
import java.util.Scanner;

public class RandomTest {

	public static void main(String[] args) {
		
	    Random ran = new Random();
	   
	   for(int i=1; i<1000; i++) {
	    	int random = ran.nextInt(50); // 0~49 
			//정수(int)를 구한다
		    //int random = ran.nextInt();// -21억 ~ 21억
		    //int random = ran.nextInt(100);// 0~99사이의 난수
		    //boolean random = ran.nextBoolean();// true, false
	    	// 50~100 큰값-작은값+1 0~50
	    	int random = ran.nextInt(51)+50;
	    	
	    	System.out.print(random+"\t");

	    	if(i%10==0) {
	    		System.out.println();
	    	}
			
		}

	}

}
