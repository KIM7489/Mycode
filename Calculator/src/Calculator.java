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
	
	JLabel jl;
	boolean state = false;
	double add1, add2;
	double num;
	String fc = "";
	String in = ""; 
	String bt[] = { "¡ç", "C", "%", "x©÷", "7", "8", "9", "¡À", "4", "5", "6", "¡¿", "1", "2", "3", "-", ".", "0", "=", "+" };
	public Calculator() {
		
	}
	public void CalculatorContain() {
		setTitle("°è»ê±â..1");
		super.setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jl = new JLabel("0",JLabel.RIGHT);
		
		JPanel mainView = new JPanel();
		jl.setFont(new Font("Serif", Font.BOLD,50));
		jl.setBackground(Color.white);
		jl.setOpaque(true);
		
		JPanel btnView = new JPanel();
		btnView.setLayout(new GridLayout(5,4,2,2));
		JButton button[] = new JButton[bt.length];
		
		for (int i = 0; i < bt.length; i++) {
	        button[i] = new JButton(bt[i]);
	        button[i].setFont(new Font("Serif", Font.BOLD, 25));
	        button[i].addActionListener(this); 

	        if (i == 0 || i == 1 || i == 18)
	            button[i].setForeground(Color.RED); 
	        if (i == 2 || i == 3 || i == 7 || i == 11 || i == 15 || i == 19)
	            button[i].setForeground(Color.BLUE);

	        btnView.add(button[i]);

	    }
		
		
		
		mainView.setLayout(new BorderLayout()); 
	    add(jl, BorderLayout.CENTER);
	    add(btnView, BorderLayout.SOUTH); 

	    setBounds(100, 100, 300, 400); 
	    setDefaultCloseOperation(EXIT_ON_CLOSE); 
	    setVisible(true); 
		
		
	}

	public static void main(String[] args) {
		Calculator cl = new Calculator();
		cl.CalculatorContain();
		
		
	}
	public void actionPerformed(ActionEvent e) {

	    String input = e.getActionCommand(); 

	    if (input.equals("+")) {
	        add1 = add2;  
	        fc = "+";
	        in = ""; 

	    } else if (input.equals("-")) {
	        add1 = add2;
	        fc = "-";
	        in = "";

	    } else if (input.equals("¡¿")) {
	        add1 = add2;
	        fc = "¡¿";
	        in = "";

	    } else if (input.equals("¡À")) {
	        add1 = add2;
	        fc = "¡À";
	        in = "";

	    } else if (input.equals("%")) {
	        add1 = add2;
	        fc = "%";
	        in = "";
	        num = add1 / 100;
	        jl.setText(String.valueOf(num)); 
	    }

	    else if (input.equals("x©÷")) {
	        add1 = add2;
	        fc = "x©÷";
	        in = "";
	        num = add1 * add1;
	        jl.setText(String.valueOf(num));
	        state = true;

	    } else if (input.equals("C")) {  
	        in = "";
	        add2 = 0;
	        add1 = 0;
	        jl.setText("0");

	                                         
	    } else if (input.equals("¡ç")) {     
	        setBackSpace(getBackSpace().substring(0, getBackSpace().length() - 1));

	        if (getBackSpace().length() < 1) {  
	            in = "";
	            add2 = 0;
	            add1 = 0;
	            jl.setText("0");
	        }

	    } else if (input.equals("=")) {
	        if (fc.equals("+")) {
	            num = add1 + add2;
	            jl.setText(String.valueOf(num));
	            state = true; // 

	        } else if (fc.equals("-")) {
	            num = add1 - add2;
	            jl.setText(String.valueOf(num));
	            state = true;

	        } else if (fc.equals("¡¿")) {
	            num = add1 * add2;
	            jl.setText(String.valueOf(num));
	            state = true;

	        } else if (fc.equals("¡À")) {
	            num = add1 / add2;
	            jl.setText(String.valueOf(num));
	            state = true;

	        }

	    } else {
	        if (state) {
	            jl.setText("0");
	            state = false;
	            add1 = 0;
	            add2 = 0;
	            in = "";
	        }

	        in += e.getActionCommand();
	        jl.setText(in);
	        add2 = Double.parseDouble(in); 

	    }

	}


	
	private void setBackSpace(String bs) {
	    jl.setText(bs);
	}

	private String getBackSpace() {
	    return jl.getText();
	  }
	

}
