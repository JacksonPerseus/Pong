package LinusMichel.PongB2;

import java.util.Timer;
import java.util.TimerTask;

public class Movement {

	Timer move;
		public Movement() {
			System.out.println("gfhfhfh");
			
			move = new Timer(true);
			move.scheduleAtFixedRate(new TimerTask() {

				@Override
				public void run() {
					
					if(Pong.moveup == true) {
						
						
						if(Pong.y >=20) {
							Pong.y  -=2;
						}
					}else if(Pong.movedown == true) {
						
						if(Pong.y <= 600 - 200) {
							Pong.y += 2;
						}
						
					}
					
				}
				
			}, 0, 6);
			
		}
	
}
