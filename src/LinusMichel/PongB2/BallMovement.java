package LinusMichel.PongB2;

import java.util.Timer;
import java.util.TimerTask;

public class BallMovement {
	
Timer move;
	public BallMovement(){
		
		move = new Timer();
		move.schedule(new TimerTask() {

			@Override
			public void run() {
				
				Pong.ballx += Pong.balldirx;
				Pong.bally += Pong.balldiry;
				
			}
			
			
			
		}, 0, 4);
		
	}
	

}
