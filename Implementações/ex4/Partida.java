package uff.ic.lleme.tcc00328.exercicios.CamilaFerrari.ex4;

public class Partida {
    private Dado dado;
    private Jogador jogador;

    public Partida(Jogador jogador, Dado dado) {
        this.jogador = jogador;
        this.dado = dado;
    }

    public void jogar() {
        int lancamento = dado.lancar();

        Rodada primeiraRodada = new Rodada();

        int resultado = primeiraRodada.jogar(lancamento);

        if (resultado == Rodada.INDEFINIDO) {
            int ponto = lancamento;
            do {
                Rodada rodada = new Rodada(ponto);
                lancamento = dado.lancar();
                resultado = rodada.jogar(lancamento);

            } while (resultado == Rodada.INDEFINIDO);
        }

        exibeResultado(resultado);
    }

    private void exibeResultado(int resultado) {
        if (resultado == Rodada.VITORIA) {
            exibir(" ganhou!");
        } else if (resultado == Rodada.DERROTA) {
            exibir(" perdeu!");
        } else {
            throw new IllegalArgumentException("Resultado indefinido!");
        }

    }

    private void exibir(String resultado) {
        System.out.println("Jogador " + jogador.getNome() + resultado);
    }
}
