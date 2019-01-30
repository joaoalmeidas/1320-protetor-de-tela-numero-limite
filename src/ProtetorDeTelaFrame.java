import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ProtetorDeTelaFrame extends JFrame{

	private final JPanel panelLinhas;
	private ProtetorDeTela prot;
	
	private final JTextField fieldLinhas;
	
	public ProtetorDeTelaFrame() {
		
		panelLinhas = new JPanel(new FlowLayout());
		prot = new ProtetorDeTela();
		
		fieldLinhas = new JTextField(5);
		
		
		panelLinhas.add(fieldLinhas);
		
		add(panelLinhas, BorderLayout.NORTH);
		add(prot, BorderLayout.CENTER);
		
	}
	
	
	
}
