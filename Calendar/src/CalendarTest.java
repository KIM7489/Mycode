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
	
	JPanel panNorth = new JPanel();
	JPanel panCenter = new JPanel();
	
	JLabel j1;
	JLabel j2;
	JLabel j3;
	String year[] = new String[12];
	int add1 = 2021;
	
	String month[] = new String[12];
	int add2 = 1;
	
	String day[] = {"일","월","화","수","목","금","토"};
	
	JComboBox comboBtn1;
	JComboBox comboBtn2;
	
	public CalendarTest() {
	
	}
	
	
	public void calendarStart(){
	setTitle("Calendar");
	setSize(600,500);
	setResizable(true);
		
	  for(int i=0; i < year.length; i++) {
		  year[i] = String.valueOf(add1);
		  month[i] = String.valueOf(add2);
		  add1--;
		  add2++;
	  }
	  
	  JButton btn1 = new JButton("<==");
	  JButton btn2 = new JButton("==>");
	  panNorth.setBackground((Color.GREEN));
	  comboBtn1 = new JComboBox(year);
	  comboBtn2 = new JComboBox(month);
	  comboBtn1.addActionListener(this);
	  comboBtn2.addActionListener(this);
	  panNorth.add(btn1);
	  panNorth.add(comboBtn1);
	  panNorth.add(comboBtn2);
	  panNorth.add(btn2);
	  panCenter.setLayout(new GridLayout(6,7));
	  
	  cal.set(2021,6,1);
	  int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // 마지막 월
	  int week = cal.get(Calendar.DAY_OF_WEEK); // 현제 요일
	 
	  for(int i = 0; i < day.length; i++) {
		  String space[] = new String[day.length]; 
//		  space[i] = " ";
		  j1 = new JLabel(day[i]);
		  j1.setFont(new Font("Serif", Font.BOLD,20));
		  panCenter.add(j1);
		  
		  if(i == day.length-1) {
			  for(int j = 0; j < week-1; j++) {
				  String space1[] = new String[week-1];
				  space1[j] = "";
				  j1 = new JLabel(space1[j],JLabel.LEFT);
				  panCenter.add(j1);
			  }
			
			  for(int c = 1; c <= lastDay; c++) {
				    String day[] = new String[lastDay];
					String space2[] = new String[lastDay];
					day[c-1] = String.valueOf(c);
//					space2[c-1] = "    ";
					j1 = new JLabel(day[c-1],JLabel.LEFT);
					j1.setFont(new Font("Serif", Font.BOLD,30));
					panCenter.add(j1);
			 }
			  
			  
			  
			  
		  }
	  
	  }
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
		  panCenter = new JPanel();
		  panCenter.setLayout(new GridLayout(6,7));
		  
		  String year = comboBtn1.getSelectedItem().toString();
		  String month = comboBtn2.getSelectedItem().toString();
		 
		  int year1 = Integer.valueOf(year);
		  int month1 = Integer.valueOf(month);
		 
		  cal.set(year1,month1-1,1);
		 
		  int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // 마지막 월
		  int week = cal.get(Calendar.DAY_OF_WEEK); // 현제 요일
		 
		  for(int i = 0; i < day.length; i++) {
			  String space[] = new String[day.length]; 
//			  space[i] = " ";
			  j1 = new JLabel(day[i]);
			  j1.setFont(new Font("Serif", Font.BOLD,20));

			  panCenter.add(j1);
			  
			  if(i == day.length-1) {
				  for(int j = 0; j < week-1; j++) {
					  String space1[] = new String[week-1];
					  space1[j] = " ";
					  j2 = new JLabel(space1[j],JLabel.LEFT);
					  panCenter.add(j2);
				  }
				
				  for(int c = 1; c <= lastDay; c++) {
					    String day[] = new String[lastDay];
						String space2[] = new String[lastDay];
						day[c-1] = String.valueOf(c);
//						space2[c-1] = "    ";
						j3 = new JLabel(day[c-1],JLabel.LEFT);
						j3.setFont(new Font("Serif", Font.BOLD,30));
						panCenter.add(j3);
				 }
			  }
	}
		 
		  add(panCenter,BorderLayout.CENTER);
}
}
