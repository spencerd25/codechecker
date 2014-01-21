package code.view;

import java.applet.*;
import javax.swing.*;
import java.awt.*;

public class Component extends Applet implements Runnable{
	private static final long serialVersionUID = 1L;
	
	static int pixelSize = 2;

	public static int moveFromBorder = 0;
	public static double sX = moveFromBorder, sY = moveFromBorder;
	public static double dir = 0;
	
	public static Dimension size = new Dimension(700, 550);
	public static Dimension pixel = new Dimension(size.width / pixelSize, size.height / pixelSize);

	public static Point mse = new Point(0, 0);
	
	public static String name = "Codetester";
	
	public  boolean isRunning = false;
	public boolean isMoving = false;
	public boolean isJumping = false;
	public boolean isMouseLeft = false;
	public boolean isMouseRight = false;
	
	private Image screen;

	public Component() {
		setPreferredSize(size);
	}
	
	public void start() {

		isRunning = true;
		new Thread(this).start();
	}
	
	public void stop() {
		isRunning = false;
	}
	
	public static void main(String args[]) {
		Component component = new Component();
		
		JFrame frame = new JFrame();
		frame.add(component);
		frame.pack();
		frame.setTitle(name);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		component.start();
		}
	
	
	public void run() 
	{
		screen = createVolatileImage(pixel.width, pixel.height);
		
		while(isRunning) {
			tick();
			render();
			
			
			try {
				Thread.sleep(5);
			} catch(Exception e) { }
		}
	}
	
	public void tick() {
		
	}
	
	public void render() {
		Graphics g = screen.getGraphics();
		//Drawing things
		g.setColor(new Color(0 ,0, 0));
		g.fillRect(size.width, size.height, pixel.width, pixel.height);

		g = getGraphics();
		
		g.drawImage(screen, 0, 0, size.width, size.height, 0, 0, pixel.width, pixel.height, null);
		g.dispose();
	}
	
	
}