/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex8;

/**
 *
 * @author giova
 */
public interface Expression extends VisitableObject{ //implementada por todas as expressões do sistema.
    int interpret(Contexto contexto); //retorna o resultado da interpretação da expressão
}

