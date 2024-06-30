package uff.quali_testes;

public class Pilha {
    public class No {
        public ComplexNumber item;
        public No anterior;
    }

    public No topo;

    public boolean vazio() {
        return (topo == null);
    }

    public ComplexNumber numTopo() {
        if (vazio()) {
            return null;
        }
        return topo.item;
    }

    public ComplexNumber pop() {
        ComplexNumber popped = null;
        if (!vazio()) {
            popped = topo.item;
            topo = topo.anterior;
        }
        return popped;
    }

    public void push(ComplexNumber valor) {
        No novo = new No();
        novo.item = valor;
        novo.anterior = topo;
        topo = novo;
    }
}
