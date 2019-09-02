import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MainWindow extends JFrame {
	public MainWindow() {
		setTitle ("Змейка");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(320,345);
		setLocation(400,400);
		setVisible(true);
		add(new GameField());
	}
	
	public static void Main(String[] args) {
		MainWindow mw = new MainWindow();
	}
}
