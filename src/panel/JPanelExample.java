package panel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JPanelExample extends JFrame implements ActionListener {
    JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    JButton btn_add, btn_sub, btn_mul, btn_div, btn_eq, btn_cl;
    Font f1;
    JPanel panel;
    JTextField textField;
    String textFieldValue = "";
    int num1 = 0, num2 = 0, result = 0;
    String operator = "";

    JPanelExample() {
        setLayout(null);
        getContentPane().setBackground(Color.cyan);
        f1 = new Font("Arial", Font.BOLD, 20);

        
        textField = new JTextField();
        textField.setBounds(20, 10, 300, 60);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setFont(f1);
        textField.setForeground(new Color(0, 128, 255));
        add(textField);

        
        btn0 = new JButton("0");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btn_add = new JButton("+");
        btn_sub = new JButton("-");
        btn_mul = new JButton("*");
        btn_div = new JButton("/");
        btn_eq = new JButton("=");
        btn_cl = new JButton("C");

        btn0.setFont(f1); btn1.setFont(f1); btn2.setFont(f1); btn3.setFont(f1);
        btn4.setFont(f1); btn5.setFont(f1); btn6.setFont(f1); btn7.setFont(f1);
        btn8.setFont(f1); btn9.setFont(f1); btn_add.setFont(f1); btn_sub.setFont(f1);
        btn_mul.setFont(f1); btn_div.setFont(f1); btn_eq.setFont(f1); btn_cl.setFont(f1);

   
        btn0.addActionListener(this); btn1.addActionListener(this); btn2.addActionListener(this);
        btn3.addActionListener(this); btn4.addActionListener(this); btn5.addActionListener(this);
        btn6.addActionListener(this); btn7.addActionListener(this); btn8.addActionListener(this);
        btn9.addActionListener(this); btn_add.addActionListener(this); btn_eq.addActionListener(this);
        btn_cl.addActionListener(this); btn_sub.addActionListener(this);
        btn_mul.addActionListener(this); btn_div.addActionListener(this);

       
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        panel.setBounds(20, 100, 300, 350);

       
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn_add);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        panel.add(btn_sub);
        panel.add(btn7);
        panel.add(btn8);
        panel.add(btn9);
        panel.add(btn_mul);
        panel.add(btn0);
        panel.add(btn_cl);
        panel.add(btn_eq);
        panel.add(btn_div);

        add(panel);

        setSize(360, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn0) {
            textFieldValue += "0";
        }
        if (e.getSource() == btn1) {
            textFieldValue += "1";
        }
        if (e.getSource() == btn2) {
            textFieldValue += "2";
        }
        if (e.getSource() == btn3) {
            textFieldValue += "3";
        }
        if (e.getSource() == btn4) {
            textFieldValue += "4";
        }
        if (e.getSource() == btn5) {
            textFieldValue += "5";
        }
        if (e.getSource() == btn6) {
            textFieldValue += "6";
        }
        if (e.getSource() == btn7) {
            textFieldValue += "7";
        }
        if (e.getSource() == btn8) {
            textFieldValue += "8";
        }
        if (e.getSource() == btn9) {
            textFieldValue += "9";
        }

        if (e.getSource() == btn_cl) {
            textFieldValue = "";
            textField.setText("");
        }

        if (e.getSource() == btn_add) {
            num1 = Integer.parseInt(textField.getText());
            operator = "+";
            textFieldValue = "";
            textField.setText("");
        }

        if (e.getSource() == btn_sub) {
            num1 = Integer.parseInt(textField.getText());
            operator = "-";
            textFieldValue = "";
            textField.setText("");
        }

        if (e.getSource() == btn_mul) {
            num1 = Integer.parseInt(textField.getText());
            operator = "*";
            textFieldValue = "";
            textField.setText("");
        }

        if (e.getSource() == btn_div) {
            num1 = Integer.parseInt(textField.getText());
            operator = "/";
            textFieldValue = "";
            textField.setText("");
        }

        if (e.getSource() == btn_eq) {
            num2 = Integer.parseInt(textField.getText());
            switch (operator) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": 
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        textField.setText("Error");
                        return;
                    }
                    break;
            }
            textField.setText(String.valueOf(result));
            textFieldValue = String.valueOf(result);
        } else {
            textField.setText(textFieldValue);
        }
    }

    
}
