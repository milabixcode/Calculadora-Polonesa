package lista1.Exercicio21;

public class Pessoa {
    
    private String nome;
    private String cpf;
    private int dinheiro;
    private Emprestimo emprestimo;

    public Pessoa(String nomeDaPessoa, String cpfDaPessoa, int dinheiroDaPessoa)
    {
        nome = nomeDaPessoa;
        cpf = cpfDaPessoa;
        dinheiro = dinheiroDaPessoa;
    }

    public String GetNome()
    {
        return this.nome;
    }
    public String GetCpf()
    {
        return this.cpf;
    }
    public int GetDinheiro()
    {
        return this.dinheiro;
    }
    public Emprestimo GetEmprestimo()
    {
        return this.emprestimo;
    }
    public void SetEmprestimo(Emprestimo emprestimoDaPessoa)
    {
        emprestimo = emprestimoDaPessoa;
    }
}