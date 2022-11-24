package lista1.Exercicio21;
import java.util.Random;

public class Emprestimo {
    private Livro[] livros;
    private int tempoEmSemanas;
    private int indice;
    private int cont;
    private double total;

    public Emprestimo(int quantidadeDeLivros, int tempoDeDuracaoDoEmprestimo)
    {
        livros = new Livro[quantidadeDeLivros];
        tempoEmSemanas = tempoDeDuracaoDoEmprestimo;
        indice=0;
        cont=0;
        total=0;
    }

    public void SetLivro(Livro livro)
    {
        livros[indice++] = livro;
    }
    public void ResetIndice()
    {
        this.indice=0;
    }
    public void ResetCont()
    {
        this.cont=0;
    }

    public Livro[] AddContato(String nome, int id, int quantidadeDeLivros)
    {
        Random rand = new Random();
        Livro novoLivro = new Livro(nome, id, rand.nextInt(100));
        Livro[] livroAux = new Livro[++quantidadeDeLivros];
        livroAux = livros;
        livroAux[--quantidadeDeLivros] = novoLivro;
        return livroAux;
    }

    public Livro[] RemoveContato(int id, int quantidadeDeContatos)
    {
        Livro[] LivroAux = new Livro[--quantidadeDeContatos];
        while (livros[indice] != null)
        {
            if (livros[indice++].GetId() != id)
            {
                LivroAux[cont++] = livros[indice];
            }
        }
        return LivroAux;
    }

    public void custoDeCadaEmprestimo()
    {
        total += livros[indice++].GetCusto()*tempoEmSemanas;
    }
    public double GetcustoTotal()
    {
        return total;
    }
}
