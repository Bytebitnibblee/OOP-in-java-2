package form;

import javax.swing.*;

public class Pro extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField textField1, textField2 , textField3 , textField4;
    JButton button;
    JLabel label , label1 , label2;

    public Pro() {
        setLayout(null);


        textField1 = new JTextField();
        textField2 = new JTextField();
        label = new JLabel();
        label1 = new JLabel("First Num: ");
        label2 = new JLabel("Second Num: ");
        button = new JButton("Add");


        label.setBounds(200, 190, 100, 40);
        label1.setBounds(30, 60, 100, 30);
        label2.setBounds(30, 110, 100, 30);
        textField1.setBounds(100, 60, 200, 40);
        textField2.setBounds(100, 110, 200, 40);
        button.setBounds(140, 260, 100, 40);


        add(label);
        add(label1);
        add(label2);
        add(textField1);
        add(textField2);
        add(button);


        setSize(400, 400);
        setVisible(true);

    }}