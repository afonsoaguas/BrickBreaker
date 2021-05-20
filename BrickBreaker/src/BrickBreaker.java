import javax.swing.JFrame;

public class BrickBreaker {

	public static void main(String[] args) {
		JFrame frame = new JFrame("BrickBreaker");
		
		Panel panel = new Panel();
		
		frame.getContentPane().add(panel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		frame.setSize(490, 600);
		
		frame.setResizable(false);

	}

}
