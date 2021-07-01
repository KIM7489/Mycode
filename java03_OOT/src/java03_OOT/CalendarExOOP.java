package java03_OOT;
import java.util.Calendar;
import java.util.Scanner;

public class CalendarExOOP {
	Scanner scan = new Scanner(System.in);
	Calendar date;  //null
	
	public CalendarExOOP() {
			calendarStart();
	}
				
	public void calendarStart() {
		///////////
		int year = getDate("년도");
		int month = getDate("월");
		
		titleprint(year,month);  //제목출력할 메소드 호출
		
		date = Calendar.getInstance();
		//입력받은 년월, 1일을 셋팅
		date.set(year, month-1,1); // 년 , 월 , 일
		//요일 구하기
		int week = date.get(Calendar.DAY_OF_WEEK); // 현제 요일 값을 리턴 3
		//요일정보를 이용하여 공백출력
		spaceprint(week-1);
		//현재 년월의 마지막날
		int lastDay = date.getActualMaximum(Calendar.DAY_OF_MONTH);
		//날짜 출력
		dayprint(week-1, lastDay);
	};   
		//날짜 출력
		public void dayprint(int space, int lastDay) {
			for(int day =1; day<=lastDay; day++) {
				System.out.print(day+"\t");
				if((day+space)%7==0) { 
					System.out.println();
				}
			}
		}
		//
	public void spaceprint(int cnt) {
	    for(int i=1; i<=cnt; i++) {
	    	System.out.print("\t");	
	}
	}
//타이틀 출력
	public void titleprint(int year, int month) {
		System.out.println("\t\t"+year+"년"+month+"월");
		System.out.println("일\t월\t화\t수\t목\t금\t토\t");
	}
	/// 콘솔에서 년도, 월을 입력받는 메소드 
	public int getDate(String msg) {
		System.out.print(msg+"->");
		return Integer.parseInt(scan.nextLine());
	}
	
	
	public static void main(String[] args) {
		new CalendarExOOP(); 

	}

}
