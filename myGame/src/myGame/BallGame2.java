package myGame;


import java.awt.*;
import javax.swing.*;

public class BallGame2 extends JFrame {
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	
	double x=100;
	double y=100;
	
	double degree=3.14/3;
	
	public void paint(Graphics g) {
		g.drawImage(desk,0,0,null);
		g.drawImage(ball,(int)x,(int)y,null);
		
		x=x+10*Math.cos(degree);
		y=y+10*Math.sin(degree);
		
		if(y>500-40-30||y<40+40) {
			degree=-degree;
		}
		if(x>856-40-30||x<40) {
			degree=3.14-degree;
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
		BallGame2 game = new BallGame2();
		game.launchFrame();
	}
}