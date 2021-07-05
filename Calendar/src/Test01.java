import java.util.Calendar;

public class Test01 {

	public Test01() {
		
	}

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
	    cal.set(Calendar.DATE,15);
//		cal.set(Calendar.HOUR_OF_DAY, ac);
//		for(int i = 1; i < 31; i++) {
//		cal.set(Calendar.HOUR_OF_DAY, i);
//		
//		int a = cal.get(Calendar.DAY_OF_WEEK);
//		System.out.print(Calendar.HOUR_OF_DAY);
//		ac++;
//		}
		System.out.print(cal.get(Calendar.DAY_OF_MONTH));
	}

}
