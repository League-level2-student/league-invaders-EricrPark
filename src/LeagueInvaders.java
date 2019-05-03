import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
	public static final int WIDTH = 500;
	public static final int HEIGHT = 800;
	GamePanel gamePanel;
	public LeagueInvaders() {
		frame = new JFrame();
		gamePanel = new GamePanel();
	}
	public void setup() {
		frame.setSize(WIDTH, HEIGHT);
		frame.add(gamePanel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main (String[] args) {
		LeagueInvaders runner = new LeagueInvaders();
		runner.setup();
	}
}
