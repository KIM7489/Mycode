import java.util.Scanner;

public class StandardWeight {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.print("나이를 입력하시오 :");
	int age = scan.nextInt();
	System.out.print("성별을 입력하시오 1.남자/2.여자 :");
	int gender = scan.nextInt();
	System.out.print("키를 입력하시오 :");
	int tall = scan.nextInt();
	System.out.print("현재체중을 입력하시오 :");
	int wgh = scan.nextInt();

	double wghmen =  (age >= 36)? (double)(tall - 100)*0.95 : (double)(tall - 100)*0.90;  //남자 표준 체중
	double wghgril = (age >= 36)? (double)(tall - 100)*0.90 : (double)(tall - 100)*0.85;  //여자 표준 체중
	
	double sum = (double)(wgh/wghmen)*100;    // 표준체중 지수
	double sum2 = (double)(wgh/wghgril)*100;   // 표준체중 지수
	String name = "";
	
    if(gender == 1) {
       
    	if(sum >= 126) {
    	//비만형
    	name = "비만형";
    } else if(sum >= 116 && sum <=125) {
    	//조금 비만형
    	name = "조금 비만형";
    } else if(sum >= 96 && sum <=115) {
    	// 표준형
    	name = "표준형";
    } else if(sum >= 86 && sum <=95) {
    	// 조금 마른형
    	name = "조금 마른형";
    } else {
       // 마른형 
    	name = "마른형";
    } 
    
    System.out.printf("나이=%d\n성별(1.남자,2.여자)=%d\n키=%d\n현재체중=%d\n표준체중=%d\n당신의 표준체중지수는 %f 으로 %s 입니다.\n",age ,gender, tall, wgh , (int)wghmen, sum, name);
    
    }
    
    if(gender == 2) {
    	
    	if(sum2 >= 126) {
    	name = "비만형";
        } else if(sum2 >= 116 && sum2 <=125) {
        	name = "조금 비만형";
        } else if(sum2 >= 96 && sum2 <=115) {
        	name = "표준형";
        } else if(sum2 >= 86 && sum2 <=95) {
        	name = "조금 마른형";
        } else {
        	name = "마른형";
        } 
    	
    	System.out.printf("나이=%d\n성별(1.남자,2.여자)=%d\n키=%d\n현재체중=%d\n표준체중=%d\n당신의 표준체중지수는 %f 으로 %s 입니다.\n",age ,gender, tall, wgh , (int)wghgril, sum2, name);
    
    }	
    }
	}
