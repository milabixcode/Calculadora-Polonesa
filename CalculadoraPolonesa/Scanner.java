package CalculadoraPolonesa;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;

public class Scanner extends JPanel {
	private final Color CINZA_ESCURO = new Color(68, 69, 68);
	private final Color CINZA_CLARO = new Color(97, 100, 99);
	private final Color LARANJA = new Color(242, 163, 60);

	public Scanner() {		
		GridBagLayout layout = new GridBagLayout();
		setLayout(layout);
		setBackground(Color.BLACK);
		
		GridBagConstraints c = new GridBagConstraints();
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;
		
		c.gridwidth = 2;
		addBotton("AC", CINZA_ESCURO, c, 0, 0);
		c.gridwidth = 1;
		addBotton("i", CINZA_ESCURO, c, 0, 2);
		addBotton("/", LARANJA, c, 0, 3);
		
		addBotton("7", CINZA_CLARO, c, 1, 0);
		addBotton("8", CINZA_CLARO, c, 1, 1);
		addBotton("9", CINZA_CLARO, c, 1, 2);
		addBotton("*", LARANJA, c, 1, 3);
		
		addBotton("4", CINZA_CLARO, c, 2, 0);
		addBotton("5", CINZA_CLARO, c, 2, 1);
		addBotton("6", CINZA_CLARO, c, 2, 2);
		addBotton("-", LARANJA, c, 2, 3);
		
		addBotton("1", CINZA_CLARO, c, 3, 0);
		addBotton("2", CINZA_CLARO, c, 3, 1);
		addBotton("3", CINZA_CLARO, c, 3, 2);
		addBotton("+", LARANJA, c, 3, 3);
		
		c.gridwidth = 2;
		addBotton("0", CINZA_CLARO, c, 4, 0);
		c.gridwidth = 1;
		addBotton(",", CINZA_CLARO, c, 4, 2);
		addBotton("=", LARANJA, c, 4, 3);		
	}

	private void addBotton(String texto, Color cor, GridBagConstraints c, int x, int y) {
		Botton botton = new Botton(texto, cor);
		c.gridx = y;
		c.gridy = x;
		add(botton, c);
	}
}