package CalculadoraPolonesa;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Botton extends JButton{
   public Botton(String texto, Color cor) {
		setText(texto);
		setFont(new Font("courier", Font.PLAIN, 25));
		setOpaque(true);
		setForeground(Color.WHITE);
		setBackground(cor);
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setFocusable(false);
	}
}
   