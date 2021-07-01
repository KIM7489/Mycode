package kimchaeTest;
import java.util.Random;
public class Selection_Sort {

	public static void main(String[] args) {
		// 1~100사이의 난수를 10개이상 생성하여 배열대입후 오름차순으로 정렬하고 출력하라
		// Selection Sort[선택 정렬] 이용.
	
	//배열 선언
	int math[] = new int[10];

	//난수 생성
	for(int i=0; i<math.length;i++) {
	   
	double random = Math.random();
	    math[i] = (int)(random*100+1-1)+1;
   //난수 검열
		if(math[i]==0) {
			System.out.print("다시 작성하자 ㅠㅠ");
			break;
		}
	}
	
	 // 선택정렬
	
		for(int i = 0; i < math.length-1; i++) {// 0,1,3,4,5,6,7,8
			for(int j = i+1; j < math.length; j++) {   
				// 0 -> 1 2 3 4 5 6 7 8 9
				// 1 -> 2 3 4 5 6 7 8 9 
				if(math[i] < math[j]) {
				int min = math[i];
				math[i]=math[i];
				math[i] = min;
				}
			}
		}
			
		for(int data: math) {
			System.out.print(data+"\t");
		}
		System.out.println();
			}
	
 
	}

