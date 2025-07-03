package set;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Pros extends JFrame implements ActionListener {

    JTextField textField1, textField2;
    JButton addButton, subButton, mulButton, divButton;
    JLabel label1, label2, txt_result;

    public Pros() {
        setLayout(null);
        
        getContentPane().setBackground(new Color(200, 220, 240));
        
        Font font = new Font("Arial", Font.BOLD, 16);
        Font font2 = new Font("Arial", Font.ITALIC, 16);
        
        textField1 = new JTextField();
        textField2 = new JTextField();
        label1 = new JLabel("First Num: ");
        label2 = new JLabel("Second Num: ");
        addButton = new JButton("Add");
        subButton = new JButton("Subtract");
        mulButton = new JButton("Multiply");
        divButton = new JButton("Divide");
        txt_result = new JLabel("Result: 0");
        
        label1.setFont(font);
        label2.setFont(font2);
        txt_result.setFont(font);
        addButton.setFont(font);
        subButton.setFont(font);
        mulButton.setFont(font);
        divButton.setFont(font);
        textField1.setFont(font2);
        textField2.setFont(font);
        
        label1.setBounds(30, 30, 100, 30);
        label2.setBounds(30, 80, 120, 30);
        textField1.setBounds(150, 30, 200, 40);
        textField2.setBounds(150, 80, 200, 40);
        addButton.setBounds(30, 140, 90, 40);
        subButton.setBounds(130, 140, 100, 40);
        mulButton.setBounds(240, 140, 100, 40);
        divButton.setBounds(350, 140, 90, 40);
        txt_result.setBounds(150, 200, 200, 40);

        add(label1);
        add(label2);
        add(textField1);
        add(textField2);
        add(addButton);
        add(subButton);
        add(mulButton);
        add(divButton);
        add(txt_result);
        
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);

        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double first = Double.parseDouble(textField1.getText());
            double second = Double.parseDouble(textField2.getText());
            double result = 0;

            if (e.getSource() == addButton) {
                result = first + second;
            } else if (e.getSource() == subButton) {
                result = first - second;
            } else if (e.getSource() == mulButton) {
                result = first * second;
            } else if (e.getSource() == divButton) {
                if (second != 0) {
                    result = first / second;
                } else {
                    txt_result.setText("Error: Division by zero");
                    return;
                }
            }
            
            txt_result.setText("The result is: " + result);
        } catch (NumberFormatException ex) {
            txt_result.setText("Invalid Input");
        }
    }
}
