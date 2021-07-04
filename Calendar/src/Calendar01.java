import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calendar01 extends JFrame implements ActionListener {
	Calendar cal = Calendar.getInstance();
	
	String day[] = {"��","��","ȭ","��","��","��","��"};
	String day1 = "";
	
	JPanel panMain;
	JPanel panCenter;
	
	JLabel jl; // ����
	JLabel jl2; // ��
	JLabel jl3; // ���� �����̽�

	String year[] = new String[12];
	String month[] = new String[12];
	
	int num1 = 0;
	int num2 = 0;
	int add1 = 2021; // �޺��ڽ� year
	int add2 = 1;	 // �޺��ڽ� month
	int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // ������ ��
	int week = cal.get(Calendar.DAY_OF_WEEK); // ���� ����
	
	public Calendar01() {}
	

	public void CalendarStart() {
	setTitle("Calendar"); // Ÿ��Ʋ ����
	setSize(500,400);     // Frame �ʱ� ������
	setResizable(true);   // ����ڰ� ũ�� ���� �����ϰ� ���� 

	
// -------------------------------------------------------------     ��� �г� �⵵ �� 	
	for(int i = 0; i < 12; i++) {   //�޺��ڽ� year month ���� 
		
		month[i] = String.valueOf(add2);
		year[i] = String.valueOf(add1);
		add1--;
		add2++;
	}
	

	JButton btn = new JButton("<��");
	btn.addActionListener(this); 
	JComboBox combo = new JComboBox(year);
	combo.addActionListener(this); 
	JComboBox combomonth = new JComboBox(month);
	combomonth.addActionListener(this); 
	JButton btn3 = new JButton("��>");
		
	panMain = new JPanel();
	panMain.setBackground(Color.GREEN);
	panMain.add(btn);
	panMain.add(combo);
	panMain.add(combomonth);
	panMain.add(btn3);

//-----------------------------------------------------------      ��� �г� d�Դϴ�.
	



//-----------------------------------------------------------      �ϴ� �г� 	
	
	panCenter = new JPanel();
	panCenter.setBackground(Color.LIGHT_GRAY);
	panCenter.setLayout(new GridLayout(4,4));
	String num3 = year[num1];
	String num4 = month[num2];
	int year1 = Integer.valueOf(num3);
	int month1 = Integer.parseInt(num4);
	
	cal.set(year1,month1,1);
	int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // ������ ��
	int week = cal.get(Calendar.DAY_OF_WEEK); // ���� ����
				
	
	
	for(int i = 0; i < day.length; i++ ) {   // jl1 ���� ����
		
	 }
	
	for(int c = 0; c < week-1; c++) {
			
										String space3[] = new String[week-1];
										space3[c] = "    ";
			
										}

	for(int j = 1; j <= lastDay; j++) {
		
			
										String day[] = new String[lastDay];
										String space2[] = new String[lastDay];
										day[j-1] = String.valueOf(j);
										space2[j-1] = "    ";
										
										
									}
	
	
	jl = new JLabel(day1,JLabel.LEFT);
	jl.setFont(new Font("Serif", Font.BOLD,30));
	jl2 = new JLabel();
	jl2.setFont(new Font("Serif", Font.BOLD,30));
	
	panCenter.add(jl);
	panCenter.add(jl2);
//-----------------------------------------------------------      �ϴ� �г�	
	
	setLayout(new BorderLayout()); // JFrame�� Default ��ġ �����ڴ� BorderLayout������ �׳� ��������
	add(panMain,BorderLayout.NORTH);
	add(panCenter,BorderLayout.CENTER);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Frame ���� ���� �����ϰ� ����
	setVisible(true);     // Frame�� ȭ�鿡 ����ϰ� ������� 
	}
	
	public static void main(String[] args) {
		Calendar01 cal = new Calendar01();
		cal.CalendarStart();

	}


public void actionPerformed(ActionEvent e) {
	String input = e.getActionCommand();
	
	if(input.equals("<��")) {
	  num1 ++;
	  
	  if(num1 > year.length){
		  num1 = year.length;
		  
	  }

		for(int i = 0; i < day.length; i++ ) {
			String space1[] = new String[day.length];
			space1[i] = "    "; 
			jl = new JLabel(day[i]+space1[i],JLabel.LEFT);
			jl.setFont(new Font("Serif", Font.BOLD,30));
			jl.setOpaque(true);
			panCenter.add(jl);
		
		if(i== day.length-1) {
				
			for(int c = 0; c < week-1; c++) {
					String space3[] = new String[week-1];
					space3[c] = "    ";
					jl3 = new JLabel(space3[c]);
					jl3.setOpaque(true);
					panCenter.add(jl3);
				}
				
			for(int j = 1; j <= lastDay; j++) {
					String day[] = new String[lastDay];
					String space2[] = new String[lastDay];
					day[j-1] = String.valueOf(j);
					space2[j-1] = "    ";
					jl2 = new JLabel(day[j-1]+space2[j-1], JLabel.LEFT);
					jl2.setFont(new Font("Serif", Font.BOLD,30));
					jl2.setOpaque(true);
					panCenter.add(jl2);
				}
		 }
		
		}
	 
	}
	
}

}
