package LinusMichel.PongB2;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements  KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode() ==  KeyEvent.VK_UP) {
			Pong.moveup = true;
			//Pong.jl1.setText(Boolean.toString(Pong.moveup)); // Zum Überprüfen ob KeyHandler funktioniert.
		} else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			Pong.movedown = true;
			//Pong.jl2.setText(Boolean.toString(Pong.movedown)); // Zum Überprüfen ob KeyHandler funktioniert.
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		if(e.getKeyCode() ==  KeyEvent.VK_UP) {
			Pong.moveup = false;
			//Pong.jl1.setText(Boolean.toString(Pong.moveup)); // Zum Überprüfen ob KeyHandler funktioniert.
		} else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			Pong.movedown = false;
			//Pong.jl2.setText(Boolean.toString(Pong.movedown)); // Zum Überprüfen ob KeyHandler funktioniert.
		}
		
	}

	
	
}
