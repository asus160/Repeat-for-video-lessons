import java.awt.Color;
import java.awt.Image;
import java.util.Timer;
import javax.swing.JPanel;

public class GameField extends JPanel {
	private final int SIZE = 320;
	private final int DOT_SIZE = 16;
	private final int ALL_DOTS = 400;
	private Image dot;
	private Image apple;
	private int appleX;
	private int appleY;
	private int[] x = new int[ALL_DOTS-1];
	private int[] y = new int[ALL_DOTS-1];
	private int dots;
	private Timer timer;
	
	private boolean left=false;
	private boolean right=false;
	private boolean up=false;
	private boolean down=false;
	private boolean InGame=true;
	
	
	
	
	
	public GameField() {
		setBackground(Color.black);
	}
}
