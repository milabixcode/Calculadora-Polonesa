package uff.ic.lleme.tcc00328.exercicios.CamilaFerrari.ex5;

public class Array implements Sequencia {
    private int[] numbers;
    private int tam;

    public Array() {
        numbers = new int[10];
        tam = 0;
    }

    public void add(int n) {
        if (tam >= numbers.length) {
            int[] newnumbers = new int[numbers.length * 2];
            for (int i = 0; i < numbers.length; i++) {
                newnumbers[i] = numbers[i];
            }
            numbers = newnumbers;
        }
        numbers[tam] = n;
        tam++;
    }

    public void remove(int n) {
        for (int i = 0; i < tam; i++) {
            if (numbers[i] == n) {
                for (int j = i; j < tam - 1; j++) {
                    numbers[j] = numbers[j + 1];
                }
                tam--;
                return;
            }
        }
    }

    public boolean includes(int n) {
        for (int i = 0; i < tam; i++) {
            if (numbers[i] == n) {
                return true;
            }
        }
        return false;
    }

    public void sort() {
        for (int i = 0; i < tam; i++) {
            for (int j = i; j < tam - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int aux = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = aux;
                }
            }
        }
    }

    public int tam() {
        return tam;
    }
}
