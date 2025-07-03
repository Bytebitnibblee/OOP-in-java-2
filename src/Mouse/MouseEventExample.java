package Mouse;
import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;

	public class MouseEventExample extends JFrame implements MouseListener {
		JLabel l1, l2;
		
		MouseEventExample() {
			addMouseListener(this);
			l1 = new JLabel();
			l1.setBounds(20, 50, 200, 20);
			add(l1);
			
			l2 = new JLabel();
			l2.setBounds(20, 100, 200, 20);
			add(l2);
			
			setSize(300, 300);
			setLayout(null);
			setVisible(true);
		}
		
		public void mouseClicked(MouseEvent e) {
			l1.setText("Mouse Clicked: x:" + e.getX() + ", y:" + e.getY());
			
			Graphics g=getGraphics();
			g.setColor(Color.red);
			g.fillOval(e.getX(), e.getY(), 3,5); 
		}
		public void mouseEntered(MouseEvent e) {
			l1.setText("Mouse Entered");
		}
		
		public void mouseExited(MouseEvent e) {
			l1.setText("Mouse Exited");
		}
		
		public void mousePressed(MouseEvent e) {
			l2.setText("Mouse Pressed");
		}
		public void mouseReleased(MouseEvent e) {
			l2.setText("Mouse Released");
		}
	}

	
