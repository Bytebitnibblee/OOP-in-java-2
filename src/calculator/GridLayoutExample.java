package calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridLayoutExample extends JFrame implements ActionListener {
    private JTextField display;
    private String operator = "";
    private double num1, num2, result;

    GridLayoutExample() {
        setTitle("Colorful Calculator");
        setSize(400, 500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display field
        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);
        
        // Buttons Panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));
        panel.setBackground(Color.BLACK);

        String[] buttons = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", "C", "=", "+"};
        Color numberColor = new Color(200, 200, 200);
        Color operatorColor = new Color(255, 165, 0); 
        Color equalsColor = new Color(0, 128, 255); 

        for (String buttonText : buttons) {
            JButton button = new JButton(buttonText);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.setForeground(Color.WHITE);
            
            if (buttonText.matches("[0-9]") || buttonText.equals("0")) {
                button.setBackground(numberColor);
            } else if (buttonText.equals("=")) {
                button.setBackground(equalsColor);
            } else {
                button.setBackground(operatorColor);
            }
            
            button.addActionListener(this);
            panel.add(button);
        }
        
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
            display.setText(display.getText() + command);
        } else if (command.equals("C")) {
            display.setText("");
            num1 = num2 = result = 0;
            operator = "";
        } else if (command.equals("=")) {
            num2 = Double.parseDouble(display.getText());
            switch (operator) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": result = num1 / num2; break;
            }
            display.setText(String.valueOf(result));
        } else {
            num1 = Double.parseDouble(display.getText());
            operator = command;
            display.setText("");
        }
    }

    
}
