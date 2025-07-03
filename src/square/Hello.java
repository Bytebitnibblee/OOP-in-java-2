package square;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Hello extends JFrame implements ActionListener {
    JTextField text_Field, result_Field;
    JLabel label, result_Label;
    JButton squareButton;

    public Hello() {
        setLayout(null);
        
        label = new JLabel("Enter number:");
        text_Field = new JTextField();
        result_Label = new JLabel("Square Number:");
        result_Field = new JTextField();
        result_Field.setEditable(false);
        squareButton = new JButton("Square Number");
        
        label.setBounds(30, 30, 100, 30);
        text_Field.setBounds(150, 30, 200, 30);
        squareButton.setBounds(150, 80, 200, 30);
        result_Label.setBounds(30, 130, 120, 30);
        result_Field.setBounds(160, 130, 190, 30);
        
        add(label);
        add(text_Field);
        add(squareButton);
        add(result_Label);
        add(result_Field);
        
        squareButton.addActionListener(this);
        text_Field.addActionListener(this);
        
        setSize(400, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double number = Double.parseDouble(text_Field.getText());
            double square = number * number;
            result_Field.setText(String.valueOf(square));
        } catch (NumberFormatException ex) {
            result_Field.setText("Invalid Input");
        }
    }

  
}