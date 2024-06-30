package uff.quali_testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PilhaTest {
    @Test
    void numTopo() {
        Pilha p = new Pilha();
        Assertions.assertNull(p.numTopo());

        ComplexNumber num = new ComplexNumber();
        num.setReal(2);
        num.setImaginaria(1);
        p.push(num);
        Assertions.assertEquals(p.numTopo(), num);
    }
}
