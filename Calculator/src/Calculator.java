import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Calculator extends JFrame implements ActionListener {
	
	JLabel label;
	boolean state = false;
	double num1, num2;
	double result;
	String func = "";
	String nInput = ""; 
	String btn[] = { "��", "C", "%", "x��", "7", "8", "9", "��", "4", "5", "6", "��", "1", "2", "3", "-", ".", "0", "=", "+" };
	public Calculator() {
		
	}
	public void CalculatorContain() {
		setTitle("����..1");
		super.setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label = new JLabel("0",JLabel.RIGHT);
		
		JPanel mainView = new JPanel();
		label.setFont(new Font("Serif", Font.BOLD,50));
		label.setBackground(Color.white);
		label.setOpaque(true);
		
		JPanel btnView = new JPanel();
		btnView.setLayout(new GridLayout(5,4,2,2));
		JButton button[] = new JButton[btn.length];
		
		for (int i = 0; i < btn.length; i++) {
	        button[i] = new JButton(btn[i]);
	        button[i].setFont(new Font("Serif", Font.BOLD, 25)); // Font ����
	        button[i].addActionListener(this); // �͸�Ŭ������ ��ư �̺�Ʈ �߰� ,�̺�Ʈ �������� ��ü�̹Ƿ� this�� ����

	        if (i == 0 || i == 1 || i == 18)
	            button[i].setForeground(Color.RED); // ��ɺ� �� ����
	        if (i == 2 || i == 3 || i == 7 || i == 11 || i == 15 || i == 19)
	            button[i].setForeground(Color.BLUE);

	        btnView.add(button[i]);

	    }
		
		
		
		mainView.setLayout(new BorderLayout()); // �������� ���̾ƿ� ��ġ
	    add(label, BorderLayout.CENTER); // ���â ��ġ
	    add(btnView, BorderLayout.SOUTH); // ��ưâ ��ġ

	    setBounds(100, 100, 300, 400); // �������� ũ�� ����
	    setDefaultCloseOperation(EXIT_ON_CLOSE); // X��ư�� ������ ������ ����
	    setVisible(true); // �������� ���̵��� ����
		
		
	}

	public static void main(String[] args) {
		Calculator cl = new Calculator();
		cl.CalculatorContain();
		
		
	}
	public void actionPerformed(ActionEvent e) {

	    String input = e.getActionCommand(); // �̺�Ʈ�� �߻���Ų ��ü�� ���ڿ��� �����ͼ� input�� ����

	    if (input.equals("+")) {
	        num1 = num2;  
	        func = "+";
	        nInput = ""; // �������� ���� ������ ����

	    } else if (input.equals("-")) {
	        num1 = num2;
	        func = "-";
	        nInput = "";

	    } else if (input.equals("��")) {
	        num1 = num2;
	        func = "��";
	        nInput = "";

	    } else if (input.equals("��")) {
	        num1 = num2;
	        func = "��";
	        nInput = "";

	    } else if (input.equals("%")) {
	        num1 = num2;
	        func = "%";
	        nInput = "";
	        result = num1 / 100;
	        label.setText(String.valueOf(result)); //������� ���ڿ��� ��ȯ�Ͽ� ���â�� ���
	    }

	    else if (input.equals("x��")) {
	        num1 = num2;
	        func = "x��";
	        nInput = "";
	        result = num1 * num1;
	        label.setText(String.valueOf(result));
	        state = true;

	    } else if (input.equals("C")) {  // Clear
	        nInput = "";
	        num2 = 0;
	        num1 = 0;
	        label.setText("0");

	                                         // substring(start, end) - start���� end ������ ���ڿ� �ڸ���
	    } else if (input.equals("��")) {     // ���ʺ��� ���������� ���������� ��
	        setBackSpace(getBackSpace().substring(0, getBackSpace().length() - 1));

	        if (getBackSpace().length() < 1) {  // �� �̻� ���� ���ڰ� ������, 0���� clear
	            nInput = "";
	            num2 = 0;
	            num1 = 0;
	            label.setText("0");
	        }

	    } else if (input.equals("=")) {
	        if (func.equals("+")) {
	            result = num1 + num2;
	            label.setText(String.valueOf(result)); //������� ���ڿ��� ��ȯ�Ͽ� ���â�� ���
	            state = true; // ��� ���� ���� �� ���� �Է��� ������ �� ȭ�鿡 ǥ�õ� ��� ���� �����.

	        } else if (func.equals("-")) {
	            result = num1 - num2;
	            label.setText(String.valueOf(result));
	            state = true;

	        } else if (func.equals("��")) {
	            result = num1 * num2;
	            label.setText(String.valueOf(result));
	            state = true;

	        } else if (func.equals("��")) {
	            result = num1 / num2;
	            label.setText(String.valueOf(result));
	            state = true;

	        }

	    } else {
	        if (state) {
	            label.setText("0");
	            state = false;
	            num1 = 0;
	            num2 = 0;
	            nInput = "";
	        }

	        nInput += e.getActionCommand();
	        label.setText(nInput);
	        num2 = Double.parseDouble(nInput); //���ڿ����� double�� ��

	    }

	}


	
	private void setBackSpace(String bs) {
	    label.setText(bs);
	}

	private String getBackSpace() {
	    return label.getText();
	  }
	

}
