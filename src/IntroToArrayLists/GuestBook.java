package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener{
	JFrame frame;
	JPanel panel;
	JButton addName;
	JButton viewNames;
	ArrayList<String> names = new ArrayList<String>();
	
	
	
public static void main(String[] args) {
	GuestBook guestbook = new GuestBook();
	

	
}
	public GuestBook() {
		frame = new JFrame();
		panel = new JPanel();
		addName = new JButton();
		viewNames = new JButton();
		frame.add(panel);
		panel.add(addName);
		panel.add(viewNames);
		addName.setText("Add Name");
		viewNames.setText("View Names");
		addName.addActionListener(this);
		viewNames.addActionListener(this);
		frame.setVisible(true);
		frame.pack();

	}
	
	
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==addName) {
			names.add(JOptionPane.showInputDialog("Type in the name of the person in the blank space."));
		}
		
		
		if(e.getSource()==viewNames) {
			int total = 0;
			String finalList = "";
			for(String s: names) {
				finalList += "Guest #" + (total+=1) + ": " + s + "\n";
			}
			JOptionPane.showMessageDialog(null, finalList);

		}
	}
	
}
