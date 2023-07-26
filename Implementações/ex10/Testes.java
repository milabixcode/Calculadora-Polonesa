package uff.ic.lleme.tcc00328.exercicios.CamilaFerrari.ex10;

import uff.ic.lleme.tcc00328.exercicios.CamilaFerrari.ex10.determinante.CalculadorDeterminante;
import uff.ic.lleme.tcc00328.exercicios.CamilaFerrari.ex10.determinante.DeterminanteMultiThread;
import uff.ic.lleme.tcc00328.exercicios.CamilaFerrari.ex10.determinante.DeterminanteSingleThread;

public class Testes {
    TestCase[] cases;

    public Testes() {
        cases = new TestCase[] {
                new TestCase("matriz 1x1", """
                        1
                        2
                        """, 2),
                new TestCase("matriz 2x2", """
                        2
                        2 1
                        3 2
                        """, 1),
                new TestCase("matriz 3x3", """
                        3
                        1 2 3
                        4 5 6
                        7 8 9
                        """, 0),
                new TestCase("matriz 3x3 com M[3, 3] = 10", """
                        3
                        1 2 3
                        4 5 6
                        7 8 10
                        """, -3),
                new TestCase("matriz 5x5", """
                        5
                        1 2 3 -3 1
                        0 4 0 0 0
                        0 1 0 1 1
                        0 -6 6 1 3
                        0 2 0 -1 1
                        """, -48)
        };
    }

    public void rodar() {
        System.out.println("\nSINGLE THREAD:");
        rodarCom(new DeterminanteSingleThread());
        System.out.println("\nMULTI THREAD:");
        rodarCom(new DeterminanteMultiThread());
    }

    public void rodarCom(CalculadorDeterminante calculador) {
        for (TestCase testCase : cases) {
            int esperado = testCase.determinanteEsperado;
            int obtido = testCase.determinanteObtido(calculador);

            if (obtido == esperado) {
                System.out.printf("[PASSOU] %s\n", testCase.nome);
            } else {
                System.out.printf("[NAO PASSOU] %s. Esperado=%d Obtido=%d\n", testCase.nome, esperado, obtido);
            }
        }
    }
}

class TestCase {
    String nome;
    Matriz matriz;
    int determinanteEsperado;

    TestCase(String nome, String input, int determinanteEsperado) {
        this.nome = nome;
        this.matriz = new LeitorMatriz().ler(input);
        this.determinanteEsperado = determinanteEsperado;
    }

    int determinanteObtido(CalculadorDeterminante calculador) {
        return calculador.calcular(matriz);
    }
}