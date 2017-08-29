package com.level3.exercises;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ArrayListPuzzles implements ActionListener, KeyListener {
	public static void main(String[] args) {
		//Number 1
		/*ArrayList<String> food = new ArrayList<String>();
		food.add("Steak/pork");
		food.add("Salads");
		food.add("fruits and veggies");
		food.add("Hamburgers/Hot Dogs");
		food.add("Pizza");
		food.add("Pasta");
		food.add("Chicken/fish");
		food.add("Beans and rice");
		Random random = new Random();

		int r = random.nextInt(food.size());

		System.out.println("You should eat " + food.get(r) + " tonight.");
*/
		
		//Number2
		/*ArrayList<String> jokes = new ArrayList<String>();
		ArrayList<String> punchlines = new ArrayList<String>();
		
		
		
		jokes.add("Where do animals go when their tail falls off?");
		jokes.add("What do you call a cow with no legs?");
		jokes.add("What did the buffalo say to his son when he left for college?");
		jokes.add("Why can't you hear a pterodactyl?");
		punchlines.add("The retail store.");
		punchlines.add("Ground beef.");
		punchlines.add("Bison.");
		punchlines.add("Because the 'p' is silent.");
		
		Random randomJokes = new Random();
		Random randomPunchlines = new Random();

		int rN= randomJokes.nextInt(jokes.size());
		int rP = randomPunchlines.nextInt(punchlines.size());
		String r1 = jokes.get(rN);
		String r2 = punchlines.get(rN);
		
		JOptionPane.showMessageDialog(null, r1);
		JOptionPane.showMessageDialog(null, r2);
		
		/*JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		
		frame.add(panel);
		panel.add(label);
		label.setText("Press space to see joke");
		frame.addKeyListener(null);
		frame.setSize(200, 200);
		frame.setVisible(true);
		*/
		
		//Number 3
		/*ArrayList<String> adjectives = new ArrayList<String>();
		ArrayList<String> nouns = new ArrayList<String>();
		adjectives.add("huge ");
		adjectives.add("tiny ");
		adjectives.add("aggresive");
		adjectives.add("ugly ");
		nouns.add("house");
		nouns.add("shoes");
		nouns.add("table");
		nouns.add("donkey");
		Random randomAdjectives = new Random();
		Random randomNouns = new Random();
		int rA = randomAdjectives.nextInt(adjectives.size());
		int rN = randomNouns.nextInt(nouns.size());
		String r3 = adjectives.get(rA);
		String r4 = nouns.get(rN);
		JOptionPane.showMessageDialog(null, r3+r4);
		*/
		
		//Number 4
		/*ArrayList<String> overload = new ArrayList<String>();
		for (int i = 0; i < 1000000000; i++) {
			overload.add("hi");
		}
		*/
	} 
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode()==KeyEvent.VK_SPACE) {
			System.out.println("efsadf");
		}
		
		
		
		
		
		//if (e.getKeyCode()==KeyEvent.VK_SPACE) {
		//	System.out.println("blahblah");
		//	JOptionPane.showMessageDialog(null, r1);
			//JOptionPane.showMessageDialog(null, r2);
		// }
		
		
	}
	
		

	

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
