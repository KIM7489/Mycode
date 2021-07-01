package kimchaeTest;
import java.util.Scanner;
public class ww {
	
	ww(){

	 }
	void start() {
		while(true) {
		try {
			Scanner scan = new Scanner(System.in);
		    System.out.print("학생수=");
			int cnt = Integer.parseInt(scan.nextLine());
			
			//데이터 저장할 공간 확보
			String name[] = new String[cnt];// 학생이름 저장할 배열
			int jumsu[][] = new int[cnt+2][6];// 학생 점수를 저장할 배열
			
			// 이름과 점수를 입력받아 배열에 저장
			String tittle[] = {"국어", "영어", "수학"};
		    
			for(int i = 0; i < cnt; i++) {//0,1,2,3
		        System.out.print("이름=");
		         name[i] = scan.nextLine();
		         for(int j = 0; j <tittle.length; j++) {
		        	 System.out.print(tittle[j]+"=");
		        	 jumsu[i][j] = Integer.parseInt(scan.nextLine());
		         }
		    }
			// 개인별 총점, 평균 
			// 과목별 총점
			for(int i =0; i < cnt; i++) {// 0,1,2
				for(int j=0; j<3; j++) {// 0,1,2
				     jumsu[i][3] += jumsu[i][j]; //개인별 총점
				     jumsu[cnt][j]+= jumsu[i][j];//과목별총점
				}
				//개인별 평균
				jumsu[i][4] = jumsu[i][3]/3;
			}
			    //과목별 평균
			for(int i =0; i<3; i++) {
				jumsu[cnt+1][i] = jumsu[cnt][i]/cnt;
			}
			    //석차 구하기
			for(int i = 0; i<cnt; i++) {//0,1,2,3
				//i가 본인점수 위치
				for(int j =0; j<cnt; j++) {
					//내점수           //상대방 점수
					if(jumsu[i][3] < jumsu[j][3]) {
					   jumsu[i][5]++;
					}
				}
				jumsu[i][5]++;
			}
			for(int i=0; i<cnt-1; i++) {//3 명 -> 0,1
				// 3-1-0
				for(int j=0; j<cnt-1-i; j++) {// 0,1,
					if(jumsu[j][5] > jumsu[j+1][5]) {
						//교환
						//이름바꾸기
						String nameTemp = name[j];
						name[j] = name[j];
						name[j+1] = nameTemp;
						
						for(int k=0; k<jumsu[j].length; k++) {
							int temp = jumsu[j][k];
							jumsu[j][k] = jumsu[j+1][k];
							jumsu[j+1][k] = temp;
						}
					}
				}
			}
			
			//=======출력============================
				System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차");
			for(int i = 0; i< cnt; i++) {//i =0
				//이름
				System.out.print(name[i]+"\t");
		        //점수출력 국어, 영어, 수학. 총점, 평균
				for(int j=0; j<jumsu[i].length; j++) {
					System.out.print(jumsu[i][j]+"\t");
				}
				System.out.println();
			}
			//과목별 총점
			System.out.print("총점\t");
			for(int i=0; i<3; i++) {//012
				System.out.print(jumsu[cnt][i]+"\t");
			}
			System.out.println();
			//과목별 총점
				System.out.print("평균\t");
			for(int i =0; i<3; i++) {
				System.out.print(jumsu[cnt+1][i]+"\t");
			}
			System.out.println();
			System.out.println("계속 실행하시겠습니까? Y/N");
			String cc = scan.nextLine();
		}catch(NumberFormatException e) {
			System.out.println("입력하신 정보가 숫자가 아닙니다. 다시 입력해 주세요.");
		}
	}
	}
	public static void main(String[] args)  {
		ww cc = new ww();
		cc.start();
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