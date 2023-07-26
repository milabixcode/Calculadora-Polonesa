package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9;

import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.fachada.Calculadora;

public class Main {
    public static void main(String[] args) {
        
        
        String exp = "2 _a * _b + _b * tg";
        
        Calculadora calc = new Calculadora(exp);

        //calc.setExpressao(exp);
        calc.iniciaVariavel("_a", 10);
        calc.iniciaVariavel("_b", 7);
        calc.listarVariaveis();
        calc.calculaExpressao();
        
    }
}


