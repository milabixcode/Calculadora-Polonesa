/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex8;

/**
 *
 * @author julia
 */
public class Main {
    public static void main(String[] args) {
        
        ExpressionGenerator builder = new StringHandler();
        builder.sucessor = new ArrayHandler();
        
        String str = "2 _a * _b + _b *";
        Expression exp = builder.handleRequest(str);
        
        // Cria um contexto e atribui valores às variáveis
        Contexto contexto = new Contexto();
        contexto.atribuirValor("_a", 10);
        contexto.atribuirValor("_b", 7);
        
        //Colhendo e listando todas as variáveis existentes na estrutura
        VariableLister varLister = new VariableLister();
        exp.accept(varLister);
        varLister.listar();

        // Avalia as expressões com o contexto fornecido
        int result = exp.interpret(contexto);

        // Imprime os resultados
        System.out.println("Resultado: " + result); 
    }
}


