import java.applet.*;
import java.awt.*;

public class Main extends Applet implements Runnable{
	Thread th;
	boolean xf= true;
	boolean yf= true;
	int x = 0;
	int y = 100;
	int s = 50;
	public void init(){ //b3mlha override w a3rf feha object mn el thread
		th = new Thread(this);
		th.start();
		
		}
		
	public void paint(Graphics g){
		
		g.setColor(Color.red);
		g.fillOval(x,y,s,s);
		
		if(x >=-s) {
			if (xf==true)
				x++;
			else x--;
			
			}
		
		if(x >= getWidth()-s){
			x--; 
			xf = false;}
			
		if(x <0) {
			xf = true;
			x++;
			}
			
		if(y >=-s) {
			if (yf==true)
				y++;
			else y--;
			
			}
		
		if(y >= getHeight()-s){
			y--; 
			yf = false;}
			
		if(y <0) {
			yf = true;
			y++;
			}
	}
	public void run (){ //b3ml override l fun el run
			while(true){
				repaint(); //b3ml recall ll paint
				try{
				Thread.sleep(5); //you’ll need to catch an exception here
				}
				catch(InterruptedException ie){
					ie.printStackTrace();
				}
			}
	}
}