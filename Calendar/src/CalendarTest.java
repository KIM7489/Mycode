import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalendarTest extends JFrame implements ActionListener {
	Calendar cal = Calendar.getInstance();
	//테스트
	JPanel panNorth = new JPanel();
	JPanel panCenter = new JPanel();
	
	JLabel j1;
	JLabel j2;
	JLabel j3;
	String year[] = new String[80];
	int add1 = 1950;
	int nowYear = cal.get(Calendar.YEAR);
	int nowMonth = cal.get(Calendar.MONTH);
	int comboSet1;
	int comboSet2; 
	
	String month[] = {"1","2","3","4","5","6","7","8","9","10","11","12"};
	
	String day[] = {"일","월","화","수","목","금","토"};
	
	JComboBox comboBtn1;
	JComboBox comboBtn2;
	
	public CalendarTest() {
	
	}

	public void calendarStart(){
//프레임 셋팅 
	setTitle("Calendar");
	setSize(600,500);
	setResizable(true);

	
// 콤보박스 년도 입력
	for(int i=0; i < year.length; i++) {
		  year[i] = String.valueOf(add1);
		  add1++; 
	  }
// 버튼생성 
	  JButton btn1 = new JButton("<==");
	  JButton btn2 = new JButton("==>");
	  panNorth.setBackground((Color.GREEN));
	  comboBtn1 = new JComboBox(year);
	  comboBtn2 = new JComboBox(month);
// 액션 생성	  
	  comboBtn1.addActionListener(this);
	  comboBtn2.addActionListener(this);
// 패널에 버튼 콤모박스 추가	 
	  panNorth.add(btn1);
	  panNorth.add(comboBtn1);
	  panNorth.add(comboBtn2);
	  panNorth.add(btn2);
// 배치 관리자 배치 	
	  panCenter.setLayout(new GridLayout(6,7));	
	  
	  
	  
// 콤보 박스 초기값  현제 년 월
	  
	  comboSet1 = nowYear - 1950;
	  comboSet2 = nowMonth;
	  comboBtn1.setSelectedIndex(comboSet1);
	  comboBtn2.setSelectedIndex(comboSet2);

// 프레임 배치관리자 패널 추가 	
	  setLayout(new BorderLayout());
	  add(panNorth,BorderLayout.NORTH);
	  add(panCenter,BorderLayout.CENTER);
	  setVisible(true);
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public static void main(String[] args) {
		CalendarTest cal = new CalendarTest();
		cal.calendarStart();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		  
		  remove(panCenter);
		  setVisible(false);
		  panCenter = new JPanel();
		  panCenter.setLayout(new GridLayout(6,7));
		  
		  String year = comboBtn1.getSelectedItem().toString();
		  String month = comboBtn2.getSelectedItem().toString();
		 
		  int year1 = Integer.valueOf(year);
		  int month1 = Integer.valueOf(month);
		  int day1 = 1;
		  cal.set(year1,month1-1,day1);
		 
		  int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // 마지막 월
		  int week = cal.get(Calendar.DAY_OF_WEEK); // 현제 요일
		 
		  for(int i = 0; i < day.length; i++) {
			  String space[] = new String[day.length]; 
//			  space[i] = " ";
			  
			  j1 = new JLabel(day[i]);
			  j1.setFont(new Font("Serif", Font.BOLD,20));
			  if(i == 0) {
				 j1.setForeground(Color.red);
			  }else if(i == 6) {
				  j1.setForeground(Color.blue);
			  }
			  panCenter.add(j1);
			  
			  if(i == day.length-1) {
				  for(int j = 0; j < week-1; j++) {
					  String space1[] = new String[week-1];
					  space1[j] = "";
					  j2 = new JLabel(space1[j],JLabel.LEFT);
					  panCenter.add(j2);
				  }
				
				  for(int c = 1; c <= lastDay; c++) {
					    cal.set(Calendar.DATE,day1);
					    int d = cal.get(Calendar.DAY_OF_WEEK);
					    String day[] = new String[lastDay];
						String space2[] = new String[lastDay];
						day[c-1] = String.valueOf(c);
						j3 = new JLabel(day[c-1],JLabel.LEFT);
						j3.setFont(new Font("Serif", Font.BOLD,30));
					
						if(d==1) {
							j3.setForeground(Color.red);
						}else if(d==7){
							j3.setForeground(Color.blue);
						}

						
						panCenter.add(j3);
						day1++;
				 }
			  }
	}
		 
		  add(panCenter,BorderLayout.CENTER);
		  setVisible(true);
}
}
