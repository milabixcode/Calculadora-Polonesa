package CalculadoraPolonesa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class Interface extends Operations {
    public Interface() {
		JFrame frame = new JFrame("Calculatesdora Polonesa Reversa");
        frame.setSize(720,640);

        JPanel painel = new JPanel();
        painel.setBackground(new Color(46, 49, 50));

        //Memoriza a expressão que será utilizada nos cálculos
        JLabel labelExpression = new JLabel("Expressão = ");
        JTextField expression = new JTextField(40);
        expression.setEditable(false);

        //Memoriza as expressões que ja foram Calculatesdas
        JLabel labelPreviousExpression = new JLabel("Memória = ");
        JTextField previousExpression = new JTextField(40);
        previousExpression.setEditable(false);

        Botton botton1 = new Botton ("1", PINK);
        Botton botton2 = new Botton ("2", PINK);
        Botton botton3 = new Botton ("3", PINK);
        Botton botton4 = new Botton ("4"), PINK;
        Botton botton5 = new Botton ("5", PINK);
        Botton botton6 = new Botton ("6", PINK);
        Botton botton7 = new Botton ("7", PINK);
        Botton botton8 = new Botton ("8", PINK);
        Botton botton9 = new Botton ("9", PINK);
        Botton botton0 = new Botton ("0", PINK);
        
        Botton bottonI = new Botton ("i", PURPLE);
        Botton bottonPoint = new Botton (".", PINK);

        Botton bottonSpace = new Botton ("       _       ", PINK);
        Botton bottonErase = new Botton ("       C       ", PINK);
        
        Botton bottonSum = new Botton ("+", PINK);
        Botton bottonSubtract = new Botton ("-", PINK);
        Botton bottonMultiply = new Botton ("*", PINK);
        Botton bottonDivide = new Botton ("/", PINK);

        Botton bottonCalculates = new Botton ("Calcular");
        
        JLabel inicialSpace[] = new JLabel[4];
        for (int i = 0; i < 4; i++)
        {
            inicialSpace[i] = new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                ");

        }
        JLabel spacesSeparations[] = new JLabel[7];
        for (int i = 0; i < 7;i ++)
        {
            spacesSeparations[i] = new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                ");
        }

        class ReadNum implements KeyListener
        {
            char possibleChar[] = {'1','2','3','4','5','6','7','8','9','0','+','-','*','/','i','.',' ','(',')'};

            /** Handle the key-typed event from the text field. */
            public void keyTyped(KeyEvent e)
            {
                boolean permited = false;
                for (char c : possibleChar) 
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

            public void keyPressed(KeyEvent e) {
            }
        
            public void keyReleased(KeyEvent e) {
            }    
        }
        class ClickNum implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                if (e.getActionCommand() == "       _       ")
                    expression.setText(expression.getText() + " ");
                else if (e.getActionCommand() == "       C       ")
                    expression.setText("");
                else
                    expression.setText(expression.getText() + e.getActionCommand());
            }
        }
        class ClickCalculates implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                try{
                    previousExpression.setText(previousExpression.getText() + expression.getText());
                    expression.setText(evaluate(expression.getText()));
                } catch(Exception exception){
                    System.out.println("Invalid Expression, Try again.");
                } finally{
                    previousExpression.setText(previousExpression.getText() + " = " + expression.getText() + " ... ");
                }
            }
        }
        
        //Funções dos componentes
        expression.addKeyListener(new ReadNum());
        botton0.addActionListener(new ClickNum());
        botton1.addActionListener(new ClickNum());
        botton2.addActionListener(new ClickNum());
        botton3.addActionListener(new ClickNum());
        botton4.addActionListener(new ClickNum());
        botton5.addActionListener(new ClickNum());
        botton6.addActionListener(new ClickNum());
        botton7.addActionListener(new ClickNum());
        botton8.addActionListener(new ClickNum());
        botton9.addActionListener(new ClickNum());
        bottonMais.addActionListener(new ClickNum());
        bottonMenos.addActionListener(new ClickNum());
        bottonMultiply.addActionListener(new ClickNum());
        bottonDivide.addActionListener(new ClickNum());
        bottonI.addActionListener(new ClickNum());
        bottonPonto.addActionListener(new ClickNum());
        bottonSpace.addActionListener(new ClickNum());
        bottonErase.addActionListener(new ClickNum());
        bottonCalculates.addActionListener(new ClickCalculates());
        
        painel.setLayout(new FlowLayout());
        for (int i = 0;i <4 ;i ++)
        {
            painel.add(inicialSpace[i]);
        }
        painel.add(labelExpression);
        painel.add(expression);
        painel.add(spacesSeparations[0]);
        painel.add(labelPreviousExpression);
        painel.add(previousExpression);
        painel.add(spacesSeparations[1]);
        painel.add(bottonSpace);
        painel.add(bottonErase);
        painel.add(spacesSeparations[2]);
        painel.add(botton1);
        painel.add(botton2);
        painel.add(botton3);
        painel.add(bottonMais);
        painel.add(spacesSeparations[3]);
        painel.add(botton4);
        painel.add(botton5);
        painel.add(botton6);
        painel.add(bottonMenos);
        painel.add(spacesSeparations[4]);
        painel.add(botton7);
        painel.add(botton8);
        painel.add(botton9);
        painel.add(bottonMultiply);
        painel.add(spacesSeparations[5]);
        painel.add(bottonI);
        painel.add(botton0);
        painel.add(bottonPonto);
        painel.add(bottonDivide);
        painel.add(spacesSeparations[6]);
        painel.add(bottonCalculates);
        
        frame.getContentPane().add(painel);
        frame.setVisible(true);
    }   
}