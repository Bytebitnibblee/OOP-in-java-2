package add;

import javax.swing.*;

public class TwoNum {
    public static void main(String[] args) {
        JFrame f = new JFrame("Add two numbers:");

        JLabel l1 = new JLabel("First num:");
        l1.setBounds(50, 20, 100, 30);
        JTextField t1 = new JTextField();
        t1.setBounds(150, 20, 100, 30);

        JLabel l2 = new JLabel("Second num:");
        l2.setBounds(50, 60, 100, 30);
        JTextField t2 = new JTextField();
        t2.setBounds(150, 60, 100, 30);

        JButton b = new JButton("Add");
        b.setBounds(100, 100, 80, 30);

        JLabel result = new JLabel("Result:");
        result.setBounds(100, 140, 200, 30);

        // Add action listener to button
        b.addActionListener(e -> {
            try {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int sum = num1 + num2;
                result.setText("Result: " + sum);
            } catch (NumberFormatException ex) {
                result.setText("Please enter valid numbers.");
            }
        });

        // Add components to frame
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b);
        f.add(result);

        f.setSize(350, 250);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
