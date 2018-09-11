import javax.swing.JFrame;

public class BuildCalc {
	public static void main(String[] args) {
		CalcFrame cframe = new CalcFrame();
		cframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cframe.setSize(300,400);
		cframe.setResizable(false);
		cframe.setVisible(true);
	}

}
