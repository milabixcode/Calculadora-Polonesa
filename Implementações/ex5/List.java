package uff.ic.lleme.tcc00328.exercicios.CamilaFerrari.ex5;

public class List implements Sequencia {

    private No raiz;
    private int tam;

    private class No {
        int valor;
        No prox;
    }

    public void add(int n) {
        No novo = new No();
        novo.valor = n;

        if (raiz == null) {
            raiz = novo;
        } else {
            No noAtual = raiz;
            while (noAtual.prox != null) {
                noAtual = noAtual.prox;
            }
            noAtual.prox = novo;
        }

        tam++;
    }

    public void remove(int n) {
        if (raiz == null) {
            return;
        }

        if (raiz.valor == n) {
            raiz = raiz.prox;
            tam--;
            return;
        }

        No noAtual = raiz;
        while (noAtual.prox != null && noAtual.prox.valor != n) {
            noAtual = noAtual.prox;
        }

        if (noAtual.prox != null) {
            noAtual.prox = noAtual.prox.prox;
            tam--;
        }
    }

    public boolean includes(int n) {
        No noAtual = raiz;
        while (noAtual != null) {
            if (noAtual.valor == n) {
                return true;
            }
            noAtual = noAtual.prox;
        }
        return false;
    }

    public void sort() {
        No noAtual = raiz;
        No proxNo = null;
        int aux;
        while (noAtual != null) {
            proxNo = noAtual.prox;
            while (proxNo != null) {
                if (noAtual.valor > proxNo.valor) {
                    aux = noAtual.valor;
                    noAtual.valor = proxNo.valor;
                    proxNo.valor = aux;
                }
                proxNo = proxNo.prox;
            }
            noAtual = noAtual.prox;
        }
    }

    public int tam() {
        return tam;
    }
}
