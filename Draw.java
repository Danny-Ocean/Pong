package pack1;

import java.awt.*;

import javax.swing.JLabel;

public class Draw extends JLabel {
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, Var.screenwidth, Var.screenheight);
	
		g.setColor(Color.WHITE);

		for(int i = 0; i <=30; i++) {
			g.fillRect(Var.screenwidth/2 -20, i*20, 40, 10);
		}
		
		g.fillRect(Var.x, Var.y, 15, 150);
		g.fillRect(Var.gegnerx, Var.gegnery, 15, 150);
		
		g.drawString("" + Var.playerPoints, Var.screenwidth/2 -95, 75);
		g.drawString("" + Var.gegnerPoints, Var.screenwidth/2 +50, 75);
		
		g.fillRect(Var.ballx, Var.bally, 20, 20 );
		
		
		
		repaint(); //aktualisieren der Zeichenfl�che
	
	}
}
