package java03_OOT;

public class Test {

	public static void main(String[] args) {
		
		
		int lotto[] = new int[7];
		
		for(int i=0; i<lotto.length; i++) {// i=0
			lotto[i] = 1;		
			//중복검사
			for(int c=0; c<i; c++) {//    1 
				if(lotto[i]==lotto[c]) {
					i--;
				}
			}
		}
		 
		for(int i=0; i<lotto.length-1; i++) {
			System.out.print(lotto[i]+", ");
		}
		System.out.println("bonus="+ lotto[6]);
	}
}