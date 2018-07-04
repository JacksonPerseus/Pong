package LinusMichel.PongB2;



import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;



public class Pong {

	static boolean moveup = false;
	static boolean movedown = false;
	static JLabel jl1;
	static JLabel jl2;
	static int x = 20, y = 185;
	static int gegnerx = 755, gegnery = 185;
	static int playerPoints = 0, gegnerPoints = 0;
	static int ballx = 200, bally = 200;
	static int balldirx = 1, balldiry= -1;
	
	public Pong() {
		new Movement();
		new GegnerMovement();
		new BallMovement();
		new BallKollision();
		/*try {
			pixelfont = Font.createFont(Font.TRUETYPE_FONT, new File("coders_crux.ttf")).deriveFont(125);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("coders_crux.ttf")));
		} catch (FontFormatException | IOException e) {
			
			e.printStackTrace();
		}*/
		
	}
	
	public static void main(String[] args) {
		
		Pong p = new Pong();
		JFrame jf = new JFrame();
		jf.setVisible(true);
		jf.setSize(800, 600);
		jf.getContentPane().setBackground(Color.black);
		jf.setTitle("Pongb2");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(null);
		jf.setResizable(false);
		jf.setLocationRelativeTo(null);
		jf.requestFocus();
		jf.setLayout(null);
		
		
		Draw draw = new Draw();
		draw.setBounds(0, 0, 800, 600);
		draw.setVisible(true);
		jf.getContentPane().add(draw);
		
		jl1 = new JLabel();
		//jl1 = new JLabel(Boolean.toString(moveup)); // Zum Überprüfen ob KeyHandler funktioniert.
		jl1.setBounds(0, 500, 400, 100);
		jl1.setVisible(true);
		jf.getContentPane().add(jl1);
		
		jl2 = new JLabel();
		//jl2 = new JLabel(Boolean.toString(movedown)); // Zum Überprüfen ob KeyHandler funktioniert.
		jl2.setBounds(400, 500, 400, 100);
		jl2.setVisible(true);
		jf.getContentPane().add(jl2);
		
		jf.addKeyListener(new KeyHandler());
		
		
	}

}
