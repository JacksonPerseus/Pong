package LinusMichel.PongB2;

import java.util.Timer;
import java.util.TimerTask;

public class BallKollision {
Timer kollision;
	
	public BallKollision() {
		
		kollision = new Timer();
		kollision.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				
				if(Pong.bally +50 >= 600) {
					Pong.balldiry = -1;
				}
				
				if(Pong.bally <= 0) {
					Pong.balldiry =1;
				}
				
				if(Pong.ballx +20 >= 800) {
					Pong.ballx = 800 /2 -10;
					Pong.bally = 600 /2 -10;
					
					Pong.balldirx = -1;
					Pong.playerPoints +=1;
				}
				
				if(Pong.ballx <= 0) {
					Pong.ballx = 800 /2 -10;
					Pong.bally = 600 /2 -10;
					
					Pong.balldirx = 1;
					Pong.gegnerPoints += 1;
				}
				
				if(Pong.ballx < Pong.x +25 && Pong.ballx > Pong.x && Pong.bally -20 < Pong.y +150 && Pong.bally> Pong.y) {
					
					Pong.balldirx =1;
					
				}
				
				
				if(Pong.ballx < Pong.gegnerx  && Pong.ballx > Pong.gegnerx -20 && Pong.bally -20 < Pong.gegnery +150 && Pong.bally> Pong.gegnery) {
					
					Pong.balldirx = -1;
					
				}
			}
			
		}, 0, 4);
		
	}
}
