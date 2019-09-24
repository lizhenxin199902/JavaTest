package lzx.game;


import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
	
	@Override
	
	public void paint(Graphics g) {
	super.paint(g);
	g.drawLine(100, 100, 300, 300);
	g.drawRect(100, 100, 300, 300);
	g.drawOval(100, 100, 200, 300);
	g.fillRect(100, 100, 30, 30);
	}
	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;

	
	/**
	 * 初始化窗口
	 */
	public void LaunchFrame() {
		this.setTitle("lzx作品");
		this.setVisible(true);
		this.setSize(500,500);
		this.setLocation(300,300);
		
//		this.addWindowListener(new WindowAdapter() {
//			
//			public void windowClosing(WindowEvent e) {
//				System.exit(0);
//			}
//		});
	}
	
	public static void main(String[] args) {
		GameFrame f = new GameFrame();
		f.LaunchFrame();
	}
}
