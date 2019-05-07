import javax.swing.JFrame;
import java.awt.Component;

public class BreakoutGame extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public BreakoutGame()
	{
		super("BREAKOUT");
		setSize(WIDTH,HEIGHT);

		Breakout game = new Breakout();

		((Component)game).setFocusable(true);
		getContentPane().add(game);

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		BreakoutGame run = new BreakoutGame();
	}
}