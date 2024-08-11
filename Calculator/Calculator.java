import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;

public class Calculator implements ActionListener {
	
	JTextField tf1, tf2, tf3;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;

	Calculator() {
		
		JFrame f = new JFrame(" Calculator");
		
		tf1 = new JTextField();
		tf1.setBounds(25, 35, 270, 50);
		tf1.setEditable(false);
		
		b1 = new JButton("7");
		b1.setBounds(25, 100, 60, 60);
		b2 = new JButton("4");
		b2.setBounds(25, 170, 60, 60);
		b3 = new JButton("1");
		b3.setBounds(25, 240, 60, 60);
		b4 = new JButton("0");
		b4.setBounds(25, 310, 60, 60);

		b5 = new JButton("8");
		b5.setBounds(95, 100, 60, 60);
		b6 = new JButton("5");
		b6.setBounds(95, 170, 60, 60);
		b7 = new JButton("2");
		b7.setBounds(95, 240, 60, 60);
		
		b8 = new JButton("=");
		b8.setBounds(95, 310, 60, 60);
		b8.setFont(new Font("Arial", Font.BOLD, 20));
		
		b16 = new JButton("AC");
		b16.setBounds(165, 310, 60, 60);

		b9 = new JButton("9");
		b9.setBounds(165, 100, 60, 60);
		b10 = new JButton("6");
		b10.setBounds(165, 170, 60, 60);
		b11 = new JButton("3");
		b11.setBounds(165, 240, 60, 60);
		
		b12 = new JButton("+");
		b12.setBounds(235, 100, 60, 60);
		b12.setFont(new Font("Arial", Font.BOLD, 20));
		b13 = new JButton("-");
		b13.setBounds(235, 170, 60, 60);
		b13.setFont(new Font("Arial", Font.BOLD, 20));
		b14 = new JButton("*");
		b14.setBounds(235, 240, 60, 60);
		b14.setFont(new Font("Arial", Font.BOLD, 20));
		b15 = new JButton("/");
		b15.setBounds(235, 310, 60, 60);
		b15.setFont(new Font("Arial", Font.BOLD, 20));
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);

		f.add(tf1);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b10);
		f.add(b11);
		f.add(b12);
		f.add(b13);
		f.add(b14);
		f.add(b15);
		f.add(b16);
		
		f.setSize(321, 425);
		f.setLayout(null);
		f.setVisible(true);
	}   

	public void actionPerformed(ActionEvent e) {

  	String buttonLabel = e.getActionCommand();
  	String textFieldText = tf1.getText();

    if (buttonLabel.equals("AC")) {
      tf1.setText("");
    } 
		else if (buttonLabel.equals("=")) {
      // Split the numbers and the operators 
			String parts[] = textFieldText.split("(?<=[+\\-*/])|(?=[+\\-*/])");
      double number1 = Double.parseDouble(parts[0]);
      String operator = parts[1];
      double number2 = Double.parseDouble(parts[2]);

    	// Perform the arithmetic operation
      double result = 0.0;
      switch (operator) {
        case "+":
          result = number1 + number2;
          break;
        case "-":
          result = number1 - number2;
          break;
        case "*":
          result = number1 * number2;
          break;
        case "/":
          result = number1 / number2;
          break;
        }

      // Set the result in the text field
      tf1.setText(String.valueOf(result));
    	} 
			
		else {
      // Append the button label to the text field
      tf1.setText(textFieldText + buttonLabel);
    }
}

	public static void main(String[] args) {
		new Calculator();
	} 
}