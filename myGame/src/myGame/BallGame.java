package myGame;


import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	
	double x=100;
	double y=100;
	boolean right = true;
	
	public void paint(Graphics g) {
		g.drawImage(desk,0,0,null);
		g.drawImage(ball,(int)x,(int)y,null);
		
		if(right) {
			x+=10;
		}else {
			x-=10;
		}
		
		if(x>856-40-30) {
			right = false;
		}
		if(x<40) {
			right = true;
		}
	}
	
	
	void launchFrame() {
		setSize(300,300);
		setLocation(500,500);
		setVisible(true);
		
		while(true) {
			repaint();
			try {
				Thread.sleep(40);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		BallGame game = new BallGame();
		game.launchFrame();
	}
}