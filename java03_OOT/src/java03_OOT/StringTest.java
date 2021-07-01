package java03_OOT;

public class StringTest {

	public StringTest() {
		start();
	}
	public void start() {
		//           0 1 2 3 4 5 6 7 8 9 0 
		String str1 = "����� ������ �ż���";
		String str2 = "����� ������ �ż���";
		String str3 = new String("����� ������ �ż���");
		String date = str3;
		
		byte[] byteData = {65,66,67,68}; //�ƽ�Ű�ڵ尪 -> ABCD
		String str4 = new String(byteData); // ABCD 
		
		char[] charData = {'X','Y','Z'}; // "XYZ"
		String str5 = new String(charData); // 
		
		int[] intData = {65,66,67,68,69,70};
		String str6 = new String(intData, 2 , 3); // index 2���� 3���� ���ڷ� �����϶�. 
		
		System.out.println("byteDate="+ str4);
		System.out.println("charDate="+ str5);
		System.out.println("intDate="+ str6);
		
		if(str1==str3) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		if(str1.equals(str3)) {//��ü�� ��ü�� �������� ���Ѵ�. str3.equals(str1)
			System.out.println("����~~");
		}else {
			System.out.println("�ٸ���");
		}
		if(str3 == date) {
			System.out.println("����.......");
		} else {System.out.println("�ٸ���");
			
		}
		str3 = "����� ���α�";
		System.out.println(date);
		
	char c = str1.charAt(2); //index ��ġ�� ���� 1���� ���´�. 
		
		System.out.println("str1.charAt(2)->"+c);
		String result = str1 + str2;
		String result2 = str1.concat(str2);
		System.out.println("result="+result);
		System.out.println("result2="+result2);
		// 0123456789 0123456789
		String data2 = "Java String Test....";
		String data3 = "java String Test....";
		
		if(data2.equals(data3)) {
			System.out.println("����@@@@@");
		}else {
			System.out.println("�ٸ���@@@@@");
		}
		
		if(data3.equalsIgnoreCase(data3)) {//��ҹ��� �������� ���� �� ��
			System.out.println("����");
		} else {
			System.out.println("�ٸ���...");
		}
	
	byte[] byteCode = data2.getBytes(); // ���ڿ��� byte �迭�� ���Ѵ�.
	
	for( byte b : byteCode) {
		System.out.println((char)b+"-->"+b);
	}
	int idx = data2.indexOf("t");//Ư�������� index��ġ�� ���Ѵ�.
	System.out.println("indexOf->"+idx);
	
	int idx2 = data2.indexOf("t",10);
	System.out.println("indexOf->"+ idx);
	
	int idx3 =data2.lastIndexOf("t");//Ư�����ڸ� �ڿ��� �˻��Ͽ� index�� ���Ѵ�.
	System.out.println("lasteIndexOf->"+idx3);
	
	System.out.println("length="+data2.length());
	
	//String data2 = "Java String Test..";
	//Ư�����ڸ� �ٸ����ڷ� �����Ѵ�.
	data2.replaceAll("A", "����");
	System.out.println("replaceAll=>"+data2);
	
	String data4 = "010-1234-5678";
	String[] tel = data4.split("-"); //Ư�����ڷ� ���ڿ��� ��������.
	for(int i=0; i<tel.length; i++) {
		System.out.println("tel["+i+"]="+ tel[i]);
	}
	//substring  : Ư�����ڿ����� �Ϻι��ڿ��� ����.
	String tell = data4.substring(4); // 1234-5678
	String tel2 = data4.substring(4,8); //1234
	System.out.println(tell+", "+ tel2);
	
	//toCharArray() ���ڿ��� char�迭�� �����ش�.
	char[] charData2 = data2.toCharArray();
	for(char cc:charData2) {
		System.out.println(cc);
	}
	//toLowerCase : �ҹ��ڷ� , toUpperCase : �빮�ڷ�
	String toLower = data2.toLowerCase();
	String toUpper = data2.toUpperCase();
	System.out.println(toLower+","+toUpper);
	
	String data6 = "  Spring        FrameWork     ";
	// trim() : ���ڿ��� ���ʿ� ���鹮�� �����.
	String dataTrim = data6.trim();
	System.out.println("AA"+dataTrim+"BB");
	
	//����ȭ ���
	int num = 1234;
	String s1 =num+"";//����ȭ
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
	int r1 = data7.compareTo(data8); //65 - 97 -32 ��Ҵ� ���� ��ü�� ũ��, ������ �����ʰ�ü�� ũ��. 0�� �ΰ�ü ũ�Ⱑ ����.
	int r2 = data8.compareTo(data7); //32
	System.out.println(r1 +", "+ r2);
	
	/*����
	String data7 = "Apple";
	String data8 = "apple";
	int r1 = data7.compareToIgnoreCase(data8); //65 - 97 -32 ��Ҵ� ���� ��ü�� ũ��, ������ �����ʰ�ü�� ũ��. 0�� �ΰ�ü ũ�Ⱑ ����.
	int r2 = data8.compareToIgnoreCase(data7); //32
	System.out.println(r1 +", "+ r2);*/
	}
	

	
	public static void main(String[] args) {
		new StringTest().start();

	}

}
