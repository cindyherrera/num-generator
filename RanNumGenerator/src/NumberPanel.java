import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class NumberPanel extends JPanel {

	private int count;
	private JButton push;
	private JLabel label;
	
	
	//Constructor: sets up the GUI
	
	public NumberPanel() {
	
		count = 1;
		
		push = new JButton("push me to generate number:");
		label = new JLabel();
		push.addActionListener(new ButtonListener());
		add(push);
		add(label);
		
		setBackground(Color.yellow);
		setPreferredSize(new Dimension(350, 50));
		
		
	}
	private class ButtonListener implements ActionListener {
		
		
		public void actionPerformed(ActionEvent event) {
			Random rand = new Random();
			
			count = rand.nextInt(99);
			label.setText("new # generated: " + count);
		}
	}
}
