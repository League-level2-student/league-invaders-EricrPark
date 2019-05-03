import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
    final int MENU = 0;
    final int GAME = 1;
    final int END = 2;
    int currentState = MENU;
    Font titleFont;
    Font smallFont;
	public GamePanel() {
		// TODO Auto-generated constructor stub
		titleFont = new Font("Calibri", Font.PLAIN, 48);
		smallFont = new Font("Calibri", Font.PLAIN, 16);
	}
	@Override
	public void paintComponent(Graphics g){
		if(currentState == MENU){
		    drawMenuState(g);
		}else if(currentState == GAME){
		    drawGameState(g);
		}else if(currentState == END){
		    drawEndState(g);
		}
	}
	public void updateMenuState() {  
		
	}
	public void updateGameState() {  
		
	}
	public void updateEndState()  {  
		
	}
	public void drawMenuState(Graphics g) {  
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.YELLOW);
		g.drawString("LEAGUE INVADERS", 30, 200);
		g.drawString("LEAGUE INVADERS", 25, 200);
		g.setFont(smallFont);
		g.drawString("Press ENTER to Start", 100, 400);
	}
	public void drawGameState(Graphics g) {  
		
	}
	public void drawEndState(Graphics g)  {  
		
	}
}
