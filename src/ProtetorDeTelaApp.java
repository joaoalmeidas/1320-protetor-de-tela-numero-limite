import javax.swing.JFrame;

public class ProtetorDeTelaApp {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Protetor de tela.");	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ProtetorDeTela prot = new ProtetorDeTela();
		frame.add(prot);
		frame.setVisible(true);
		frame.setSize(500, 500);
	}

}
