import javax.swing.JFrame;


public class RanNumGen {

	public static void main(String[] args) {
		
		//creates and displays main program frame
		
		JFrame title = new JFrame("Random Number Generator:");
		title.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		NumberPanel panel1 = new NumberPanel();
		title.getContentPane().add(panel1);
		
		
		title.pack();
		title.setVisible(true);

	}

}
