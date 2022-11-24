package lista2.Exercicio1;

public class Arvore {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa( "Ana", 20);
        Pessoa p2 = new Pessoa("Pedro", 50);
        Pessoa p3 = new Pessoa("Maria", 38);
        Pessoa p4 = new Pessoa("Claudio", 30);

        p1.setPai(p2);
        p1.setMae(p3);
        p4.setPai(p1);
        p3.setIdade(39);
        System.out.println(p1);
        System.out.println(p4.pai.getNome());
        //System.out.println(p3.mae.getNome());
        //System.out.println(p3.mae.getIdade());
    }    
}
