package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.expressions;

import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.Contexto;
import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.visitor.VisitableObject;

/**
 *
 * @author giova
 */
public interface Expression extends VisitableObject{ //implementada por todas as expressões do sistema.
    public double interpret(Contexto contexto); //retorna o resultado da interpretação da expressão
}

