package java03_OOT;

public class StringTest {

	public StringTest() {
		start();
	}
	public void start() {
		//           0 1 2 3 4 5 6 7 8 9 0 
		String str1 = "서울시 마포구 신수동";
		String str2 = "서울시 마포구 신수동";
		String str3 = new String("서울시 마포구 신수동");
		String date = str3;
		
		byte[] byteData = {65,66,67,68}; //아스키코드값 -> ABCD
		String str4 = new String(byteData); // ABCD 
		
		char[] charData = {'X','Y','Z'}; // "XYZ"
		String str5 = new String(charData); // 
		
		int[] intData = {65,66,67,68,69,70};
		String str6 = new String(intData, 2 , 3); // index 2부터 3개를 문자로 생성하라. 
		
		System.out.println("byteDate="+ str4);
		System.out.println("charDate="+ str5);
		System.out.println("intDate="+ str6);
		
		if(str1==str3) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		if(str1.equals(str3)) {//객체와 객체가 같은지를 구한다. str3.equals(str1)
			System.out.println("같다~~");
		}else {
			System.out.println("다르다");
		}
		if(str3 == date) {
			System.out.println("같다.......");
		} else {System.out.println("다르다");
			
		}
		str3 = "서울시 종로구";
		System.out.println(date);
		
	char c = str1.charAt(2); //index 위치의 문자 1개를 얻어온다. 
		
		System.out.println("str1.charAt(2)->"+c);
		String result = str1 + str2;
		String result2 = str1.concat(str2);
		System.out.println("result="+result);
		System.out.println("result2="+result2);
		// 0123456789 0123456789
		String data2 = "Java String Test....";
		String data3 = "java String Test....";
		
		if(data2.equals(data3)) {
			System.out.println("같다@@@@@");
		}else {
			System.out.println("다르다@@@@@");
		}
		
		if(data3.equalsIgnoreCase(data3)) {//대소문자 구별없이 같은 지 비교
			System.out.println("같다");
		} else {
			System.out.println("다르다...");
		}
	
	byte[] byteCode = data2.getBytes(); // 문자열을 byte 배열로 구한다.
	
	for( byte b : byteCode) {
		System.out.println((char)b+"-->"+b);
	}
	int idx = data2.indexOf("t");//특정문자의 index위치를 구한다.
	System.out.println("indexOf->"+idx);
	
	int idx2 = data2.indexOf("t",10);
	System.out.println("indexOf->"+ idx);
	
	int idx3 =data2.lastIndexOf("t");//특정문자를 뒤에서 검색하여 index를 구한다.
	System.out.println("lasteIndexOf->"+idx3);
	
	System.out.println("length="+data2.length());
	
	//String data2 = "Java String Test..";
	//특정문자를 다른문자로 변경한다.
	data2.replaceAll("A", "에이");
	System.out.println("replaceAll=>"+data2);
	
	String data4 = "010-1234-5678";
	String[] tel = data4.split("-"); //특정문자로 문자열을 조각낸다.
	for(int i=0; i<tel.length; i++) {
		System.out.println("tel["+i+"]="+ tel[i]);
	}
	//substring  : 특정문자열에서 일부문자열을 얻어낸다.
	String tell = data4.substring(4); // 1234-5678
	String tel2 = data4.substring(4,8); //1234
	System.out.println(tell+", "+ tel2);
	
	//toCharArray() 문자열을 char배열로 구해준다.
	char[] charData2 = data2.toCharArray();
	for(char cc:charData2) {
		System.out.println(cc);
	}
	//toLowerCase : 소문자로 , toUpperCase : 대문자로
	String toLower = data2.toLowerCase();
	String toUpper = data2.toUpperCase();
	System.out.println(toLower+","+toUpper);
	
	String data6 = "  Spring        FrameWork     ";
	// trim() : 문자열의 양쪽에 공백문자 지운다.
	String dataTrim = data6.trim();
	System.out.println("AA"+dataTrim+"BB");
	
	//문자화 방법
	int num = 1234;
	String s1 =num+"";//문자화
	String s2 = String.valueOf(num);
	System.out.println(s1+1234);
	System.out.println(s2+5678);
	
	char[] aa= {'S','T','U'};
	String sss = new String(aa);
	String sss2 = String.valueOf(aa);
	
	System.out.println(sss);
	System.out.println(sss2);
	
	String data7 = "Apple";
	String data8 = "apple";
	int r1 = data7.compareTo(data8); //65 - 97 -32 양소는 왼쪽 객체가 크고, 음수는 오른쪽객체가 크다. 0은 두객체 크기가 같다.
	int r2 = data8.compareTo(data7); //32
	System.out.println(r1 +", "+ r2);
	
	/*같다
	String data7 = "Apple";
	String data8 = "apple";
	int r1 = data7.compareToIgnoreCase(data8); //65 - 97 -32 양소는 왼쪽 객체가 크고, 음수는 오른쪽객체가 크다. 0은 두객체 크기가 같다.
	int r2 = data8.compareToIgnoreCase(data7); //32
	System.out.println(r1 +", "+ r2);*/
	}
	

	
	public static void main(String[] args) {
		new StringTest().start();

	}

}
