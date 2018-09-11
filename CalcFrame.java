import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class CalcFrame extends JFrame{
	private final JTextField box;
	private final JButton[] buttons;
	private static final String[] symbols = {"7","8","9","/","4","5","6","*","1","2","3","-","0",".","=","+"};
	
	
	public CalcFrame() {
		super("Calculator");
		
		JPanel TFPanel = new JPanel();	
		box = new JTextField(25);
		box.setPreferredSize(new Dimension(300,40));
		TFPanel.add(box);
		
		
		JPanel GridPanel = new JPanel();
		GridLayout gridLayout = new GridLayout(4,4,10,10);
		GridPanel.setLayout(gridLayout);
		buttons = new JButton[symbols.length];
		
		for (int i=0; i < symbols.length; i++) {
			buttons[i] = new JButton(symbols[i]);
			GridPanel.add(buttons[i]);
		}
		
		add(TFPanel, BorderLayout.NORTH);
		add(GridPanel, BorderLayout.CENTER);
	}

}
