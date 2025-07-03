package key;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyEventExample extends JFrame implements KeyListener {
	Label l;
	TextArea area;

	KeyEventExample() {
		l = new Label();
		l.setBounds(20, 50, 200, 20);

		area = new TextArea();
		area.setBounds(20, 80, 300, 300);
		area.addKeyListener(this);

		add(l);
		add(area);

		setSize(400, 400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void keyPressed(KeyEvent e) {
	
	}

	public void keyReleased(KeyEvent e) {
		String text = area.getText();
		String words[] = text.trim().split("\\s+");
		int wordCount = text.trim().isEmpty() ? 0 : words.length;
		l.setText("Words: " + wordCount + " Characters: " + text.length());
	}

	public void keyTyped(KeyEvent e) {
		
	}
}

	
