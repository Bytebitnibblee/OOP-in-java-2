package gui;
 
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FirstApp extends JFrame implements ActionListener{
	
	public FirstApp() {
		setLayout(null);
		
		   JButton b = new JButton("Click Me");
	        b.setBounds(200, 100, 100, 50);  
	        add(b);

	        
	        JTextField b1 = new JTextField();
	        b1.setBounds(200, 200, 100, 50); 
	        add(b1);
	        
		b.addActionListener(this);
		
		setSize(400,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
		
		public void actionPerformed(ActionEvent e) {
			System.out.println("oh!! You have Clicked the button!!");
		}
	}


