package swing;

import java.awt.event.ActionEvent;

import javax.swing.*;

public class ThirdApp extends JFrame {
    JTextField textField;
    JButton button;
    JLabel label;

    public ThirdApp() {
         setLayout(null);

        
        textField = new JTextField();
        textField.setBounds(50, 100, 200, 30); 
        add(textField);

        button = new JButton("Submit");
        button.setBounds(50, 150, 200, 40);
        add(button);

    
        label = new JLabel();
        label.setBounds(50, 200, 300, 30); 
        add(label);

              setSize(400, 300); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);
        setVisible(true);  
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    	String name=textField.getText();
    	label.setText("welcome:"+name);
    	
    }
}
