package lista1.Exercicio20;
import java.util.Scanner;

public class Main {    
public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de contatos: ");
        int quantidadeDeContatos = teclado.nextInt();
        Agenda agenda = new Agenda(quantidadeDeContatos);
        for (int i=0;i<quantidadeDeContatos;i++)
        {
            System.out.print("Informe o nome do novo contato: ");
            String nome = teclado.next();
            System.out.print("Informe o telefone do novo contato: ");
            int telefone = teclado.nextInt();
            Contato contato = new Contato(nome, telefone);
            agenda.SetContato(contato);
        }

        agenda.ResetIndice();
        for (int i=0;i<quantidadeDeContatos;i++)
        {
            Contato contato = agenda.proximoContato();
            System.out.println("Nome do Contato " + (i+1) + ": " + contato.GetNome());
            System.out.println("Telefone do Contato " + (i+1) + ": " + contato.GetTelefone());
        }

        teclado.close();
    }
}

