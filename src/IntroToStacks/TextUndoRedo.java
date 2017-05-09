package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.xml.soap.Text;

public class TextUndoRedo implements KeyListener {
	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should
	 * look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last
	 * character is erased from the JLabel. Save that deleted character onto a
	 * Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is
	 * pressed, the top Character is popped off the Stack and added back to the
	 * JLabel.
	 * 
	 */
	JFrame frame;
	JPanel panel;
	JLabel label;
	Stack<Character> characters = new Stack<Character>();

	public static void main(String[] args) {
		TextUndoRedo text = new TextUndoRedo();
	}

	public TextUndoRedo() {
		frame = new JFrame();
		panel = new JPanel();
		label = new JLabel();
		panel.add(label);
		frame.add(panel);
		frame.addKeyListener(this);
		frame.setVisible(true);
		frame.setSize(500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub 
		String text = label.getText();
		if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			
			String newText = text.substring(0, text.length()-1);
			char lastCharacter = text.charAt(text.length()-1);
			label.setText(newText);
			System.out.println(newText);
			characters.push(lastCharacter);
			
		//	char lastCharacter = text.charAt(text.length()-1);
		//	String leftOverChar = text.substring(0, text.length()-1);
			//characters.push(lastCharacter);
			//label.setText(leftOverChar);
			//.out.println(lastCharacter);
			//System.out.println(leftOverChar);
		} else if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			if(characters.isEmpty() == true) {
				System.out.println("There are no more characters that you can undo.");
			}
			
			char top  = characters.pop();
			label.setText(label.getText() + top);
			System.out.println("undo");
		}
		else {
			char key = e.getKeyChar();
			label.setText(label.getText() + key);
			System.out.println(key);
			
		
			
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
