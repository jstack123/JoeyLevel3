package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener{
	HashMap<Integer,String> entries = new HashMap<Integer,String>();
	JFrame frame;
	JPanel panel;
	JButton addEntry;
	JButton searchByID;
	JButton viewList;
	JButton removeEntry;
	public LogSearch() {
		frame = new JFrame();
		panel = new JPanel();
		addEntry = new JButton("Add Entry");
		searchByID = new JButton("Search By ID");
		viewList = new JButton("View List");
		removeEntry = new JButton("Remove Entry");
		frame.add(panel); 
		panel.add(addEntry);
		panel.add(searchByID);
		panel.add(viewList);
		panel.add(removeEntry);
		frame.setVisible(true);
		addEntry.addActionListener(this);
		searchByID.addActionListener(this);
		viewList.addActionListener(this);
		removeEntry.addActionListener(this);
		frame.pack();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		LogSearch log = new LogSearch();
	}
	/* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == addEntry) {
			String enteredID = JOptionPane.showInputDialog("Enter an ID number in the space below.");
			String enteredName = JOptionPane.showInputDialog("Enter a name in the space below.");
			int ID = Integer.parseInt(enteredID);
			entries.put(ID, enteredName);
		}
		if(e.getSource() == searchByID) {
			String searchedID = JOptionPane.showInputDialog("Enter an ID number in the space below to search.");
			int IDSearched = Integer.parseInt(searchedID);
			if(entries.keySet().contains(IDSearched)) {
				JOptionPane.showMessageDialog(null, "Name: " + entries.get(IDSearched));
			} else {
				JOptionPane.showMessageDialog(null, "Sorry, this ID does not exist.");
			}
		}
		if(e.getSource() == viewList) {
			String output = "";
			for (Integer id : entries.keySet()) {
				output += "ID: " + id + "  Name: " + entries.get(id) + "\n";
			}
			JOptionPane.showMessageDialog(null, output);
		}
		if(e.getSource() == removeEntry) {
			String removeSearchedID = JOptionPane.showInputDialog("Enter an ID in the space below to remove it.");
			int searchedIDRemove = Integer.parseInt(removeSearchedID);
			if(entries.keySet().contains(searchedIDRemove)) {
				entries.remove(searchedIDRemove);
				JOptionPane.showMessageDialog(null, "ID: " + searchedIDRemove + " has been removed from the list");
			} else {
				JOptionPane.showMessageDialog(null, "Sorry, this ID does not exist is the list");
			}
		}
	}
}
