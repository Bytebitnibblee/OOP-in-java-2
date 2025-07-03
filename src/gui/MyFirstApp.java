package gui;

import java.awt.Button;
import java.awt.Frame;

import javax.swing.JFrame;

public class MyFirstApp extends JFrame {

 
	MyFirstApp()
	{
		setTitle("fruit application");
		
		setLayout(null);
		
		
		//button object created
		Button b = new Button("Click");
		
		//location and size
		b.setBounds(300, 100, 100, 60);                          
		
		add(b);
		
		//size of window
		setSize(600,700);
		
		//make visible
		setVisible(true);
		

}
}
