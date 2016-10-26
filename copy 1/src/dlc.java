import javax.swing.JFrame;


public class dlc {
	public static void main(String[] args) {
		Reader r = new Reader("calc");
	r.setVisible(true);
	r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	r.setSize(200, 250);
	r.setResizable(false);
	r.setLocationRelativeTo(null);
	}
}
