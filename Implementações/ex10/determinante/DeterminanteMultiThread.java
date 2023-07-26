package uff.ic.lleme.tcc00328.exercicios.CamilaFerrari.ex10.determinante;

import uff.ic.lleme.tcc00328.exercicios.CamilaFerrari.ex10.Matriz;

public class DeterminanteMultiThread implements CalculadorDeterminante {
    DeterminanteSingleThread singleThread;

    public DeterminanteMultiThread() {
        singleThread = new DeterminanteSingleThread();
    }

    @Override
    public int calcular(Matriz matriz) {
        if (matriz.size() <= 2) {
            return singleThread.calcular(matriz);
        }

        return laplace(matriz);
    }

    public int laplace(Matriz matriz) {
        int determinante = 0;

        TermoLaplace[] termos = new TermoLaplace[matriz.size()];

        for (int j = 0; j < matriz.size(); j++) {
            TermoLaplace termo = new TermoLaplace(matriz, 0, j);
            termo.start();
            termos[j] = termo;
        }

        try {
            for (int i = 0; i < matriz.size(); i++) {
                termos[i].join();
                determinante += termos[i].resultado;
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return determinante;
    }

}

class TermoLaplace extends Thread {
    Matriz matriz;
    int i;
    int j;
    int resultado = 0;

    public TermoLaplace(Matriz matriz, int i, int j) {
        this.matriz = matriz;
        this.i = i;
        this.j = j;
    }

    public void run() {
        resultado = matriz.get(i, j) * cofator(matriz, i, j);
    }

    public int cofator(Matriz matriz, int i, int j) {
        Matriz sub = matriz.submatriz(i, j);
        DeterminanteMultiThread calculador = new DeterminanteMultiThread();
        return ((int) Math.pow(-1, (i + 1) + (j + 1))) * calculador.calcular(sub);
    }
}