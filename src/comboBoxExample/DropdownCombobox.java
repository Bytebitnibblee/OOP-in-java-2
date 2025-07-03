package comboBoxExample;
import javax.swing.*;

public class DropdownCombobox extends JFrame{
	DropdownCombobox(){
		String country[]={"Nepal", "India", "Aus", "U.S.A", "England","NewZealand"};
		JComboBox cb = new JComboBox(country);
		cb.setBounds(50,50,150,30);
		add(cb);
		setLayout(null);
		setSize(400,300);
		setVisible(true);
	}
	

}
