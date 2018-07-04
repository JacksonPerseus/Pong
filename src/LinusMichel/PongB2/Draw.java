package LinusMichel.PongB2;


	import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.swing.JPanel;

	public class Draw extends JPanel{
		static Font pixelfont;
		protected void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			g.setColor(Color.black);
			g.fillRect(0, 0, 800, 600);
			
			g.setColor(Color.white);
			
			for(int i = 0; i<= 30; i++) {
				
				g.fillRect(800/2 -5, i * 20, 10, 10);
				
			}
			
			g.fillRect(Pong.x, Pong.y, 25, 150);
			g.fillRect(Pong.gegnerx, Pong.gegnery, 25, 150);
			try {
				pixelfont = Font.createFont(Font.TRUETYPE_FONT, new File("coders_crux.ttf")).deriveFont(125);
				GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
				ge.registerFont(pixelfont);
			} catch (FontFormatException | IOException e) {
				
				e.printStackTrace();
			}
			//g.setFont(pixelfont);
			g.setFont(new Font("System", 1,50));
			g.drawString("" + Pong.playerPoints, 800/2 - 95, 75);
			g.drawString("" + Pong.gegnerPoints, 800/2 + 50, 75);
			g.fillRect(Pong.ballx, Pong.bally, 20, 20);
			
			repaint();
			
		}
		
	}