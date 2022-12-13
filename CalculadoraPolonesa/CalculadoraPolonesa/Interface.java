package CalculadoraPolonesa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Interface extends Operations {
  public Interface() {
	JFrame frame = new JFrame("Calculadora Polonesa Reversa");  
  frame.setResizable(false);
        frame.setLocation(450, 120);
        frame.setSize(520,640);
        
        JPanel painel = new JPanel();
        painel.setBackground(Color.WHITE);

        // Guarda a expressao que sera utilizada para o calculo
        JLabel labelExpression = new JLabel("Expressão = ");
        JTextField expression = new JTextField(40);
        expression.setEditable(false);

        // Guarda as expressoes calculadas anteriormente
        JLabel labelPreviousExpression = new JLabel(" Memória  =  ");
        JTextField previousExpression = new JTextField(40);
        previousExpression.setEditable(false);

        JButton botao1 = new JButton ("1");
        JButton botao2 = new JButton ("2");
        JButton botao3 = new JButton ("3");
        JButton botao4 = new JButton ("4");
        JButton botao5 = new JButton ("5");
        JButton botao6 = new JButton ("6");
        JButton botao7 = new JButton ("7");
        JButton botao8 = new JButton ("8");
        JButton botao9 = new JButton ("9");
        JButton botao0 = new JButton ("0");
        JButton botaoR = new JButton ("r");
        JButton botaoI = new JButton ("i");
        JButton botaoMais = new JButton ("+");
        JButton botaoApaga = new JButton ("C");
        JButton botaoSpace = new JButton ("_");
        JButton botaoMenos = new JButton ("-");
        JButton botaoMultiplica = new JButton ("*");
        JButton botaoMemoria = new JButton ("<-");
        JButton botaoDivide = new JButton ("/");
        JButton botaoCalcula = new JButton ("=");

        JLabel espacosDeSeparacao[] = new JLabel[11];
        for (int i = 0; i < 11 ;i++)
        {
            espacosDeSeparacao[i] = new JLabel("                                                                                                                                                                                      ");
        }

        class ReadNum implements KeyListener{
            char charPossiveis[] = {'1','2','3','4','5','6','7','8','9','0','+','-','*','/','r','i',' '};

            /** Handle the key-typed event from the text field. */
            public void keyTyped(KeyEvent e)
            {
                boolean permited = false;
                for (char c : charPossiveis) 
                {
                    if (e.getKeyChar() == c)
                    {
                        permited=true;
                        break;
                    }
                }
                if (permited)
                    expression.setText(expression.getText() + e.getKeyChar());
            }

            /** Handle the key-pressed event from the text field. */
            @Override
            public void keyPressed(KeyEvent e) {
            }
            /** Handle the key-released event from the text field. */
            @Override
            public void keyReleased(KeyEvent e) {
            }    
        }
        class ClickNum implements ActionListener{
            public void actionPerformed(ActionEvent e)
            {
                if (e.getActionCommand() == "_")
                    expression.setText(expression.getText() + " ");
                else if (e.getActionCommand() == "C")
                    expression.setText("");
                else if(e.getActionCommand().equals("<-"))
                    expression.setText(previousExpression.getText());
                else
                    expression.setText(expression.getText() + e.getActionCommand());
            }
        }
        class ClickCalcula implements ActionListener{
            public void actionPerformed(ActionEvent e)
            {
                // Defino o termo q vai ficar no historico;
                try{
                    expression.setText(calcular(expression.getText()).toString());
                } catch(Exception exception){
                    System.out.println("ERROR");
                } finally{
                    previousExpression.setText(expression.getText());
                }
            }
        }
        
        // Aplico funçoes para os meus componentes
        expression.addKeyListener(new ReadNum());
        botao0.addActionListener(new ClickNum());
        botao1.addActionListener(new ClickNum());
        botao2.addActionListener(new ClickNum());
        botao3.addActionListener(new ClickNum());
        botao4.addActionListener(new ClickNum());
        botao5.addActionListener(new ClickNum());
        botao6.addActionListener(new ClickNum());
        botao7.addActionListener(new ClickNum());
        botao8.addActionListener(new ClickNum());
        botao9.addActionListener(new ClickNum());
        botaoMais.addActionListener(new ClickNum());
        botaoMenos.addActionListener(new ClickNum());
        botaoMultiplica.addActionListener(new ClickNum());
        botaoDivide.addActionListener(new ClickNum());
        botaoI.addActionListener(new ClickNum());
        botaoR.addActionListener(new ClickNum());
        botaoMemoria.addActionListener(new ClickNum());
        botaoSpace.addActionListener(new ClickNum());
        botaoApaga.addActionListener(new ClickNum());
        botaoCalcula.addActionListener(new ClickCalcula());
        
        painel.setLayout(new FlowLayout());
        for (int i = 0;i < 4;i ++)
        {
            painel.add(espacosDeSeparacao[i]);
        }
        painel.add(expression);
        painel.add(espacosDeSeparacao[5]);
        painel.add(botao1);
        painel.add(botao2);
        painel.add(botao3);
        painel.add(botaoMais);
        painel.add(espacosDeSeparacao[6]);
        painel.add(botao4);
        painel.add(botao5);
        painel.add(botao6);
        painel.add(botaoMenos);
        painel.add(espacosDeSeparacao[7]);
        painel.add(botao7);
        painel.add(botao8);
        painel.add(botao9);
        painel.add(botaoMultiplica);
        painel.add(espacosDeSeparacao[8]);
        painel.add(botao0);
        painel.add(botaoR);
        painel.add(botaoI);
        painel.add(botaoDivide);
        painel.add(espacosDeSeparacao[9]);
        painel.add(botaoApaga);
        painel.add(botaoMemoria);
        painel.add(botaoSpace);
        painel.add(botaoCalcula);
        painel.add(espacosDeSeparacao[10]);

        frame.getContentPane().add(painel);
        frame.setVisible(true);
    }   
}

