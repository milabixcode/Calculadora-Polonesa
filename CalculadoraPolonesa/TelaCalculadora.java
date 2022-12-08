package CalculadoraPolonesa;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

public class TelaCalculadora extends JFrame {
    public TelaCalculadora() {
		organizarLayout();		
		setResizable(false);
		setSize(232, 322);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}	
	private void organizarLayout() {
		setLayout(new BorderLayout());		
		Display display = new Display();
		display.setPreferredSize(new Dimension(232, 60));
		add(display, BorderLayout.NORTH);		
		add(new Teclado(), BorderLayout.CENTER);
	}    
}
