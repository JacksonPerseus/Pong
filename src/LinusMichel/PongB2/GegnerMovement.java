package LinusMichel.PongB2;

import java.util.Timer;
import java.util.TimerTask;

public class GegnerMovement {
Timer move;
	public GegnerMovement() {
		move = new Timer();
		move.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				   
				
				if(Pong.ballx >= 600/2 -10) {
					
					if(Pong.bally == Pong.gegnery) {
						
					}else if(Pong.bally > Pong.gegnery +75) {
						
						if(Pong.gegnery <= 800 -200) {
							
							Pong.gegnery +=2;
							
						}
						
					}else if (Pong.gegnery < Pong.gegnery +75) {
						
						if(Pong.gegnery >= 20) {
							
							Pong.gegnery -= 2;
							
						}
						
					}
					
				}
				
			}
			
		}, 0, 6);
	}
}
