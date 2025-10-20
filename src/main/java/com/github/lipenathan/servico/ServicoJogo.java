package com.github.lipenathan.servico;


import com.github.lipenathan.modelo.Jogador;
import com.github.lipenathan.modelo.Jogo;

public class ServicoJogo {

    private ServicoPontuacaoSimples servicoPontuacao;

    public ServicoJogo(ServicoPontuacaoSimples servicoPontuacao) {
        this.servicoPontuacao = servicoPontuacao;
    }

    public String descricaoDoJogo(Jogo jogo) {
        return "O " + jogo.getNome() + " é um jogo " + jogo.getTipo() + " para ser jogado por(ou até) " +
                jogo.getNumeroJogadores() + " jogadores a partir de " + jogo.getIdade() + " anos de idade";
    }

    public Boolean verificarDisponibilidadeJogadores(Jogo jogo) {
        return jogo.getJogadores().size() < jogo.getNumeroJogadores();
    }

    public void adicionarPontuacao(Jogo jogo, int posicaoJogador) {
        servicoPontuacao.adicionarPonto(jogo.getJogadores().get(posicaoJogador));
    }

    public void removerPontuacao(Jogo jogo, int posicaoJogador) {
        servicoPontuacao.removerPonto(jogo.getJogadores().get(posicaoJogador));
    }

    public String verificarVencedor(Jogo jogo) {
        String textoVencedor;
        try {
            Jogador vencedor;
            vencedor = servicoPontuacao.verificarVencedor(jogo);
            textoVencedor = "O jogador vencedor foi o " + vencedor.getNome();
        } catch (Exception ex) {
            textoVencedor = "Erro ao verificar vencedor: " + ex.getMessage();
        }
        return textoVencedor;
    }

    public String rankingPartida(Jogo jogo) {
        StringBuilder ranking = new StringBuilder();

        if (jogo.getJogadores().isEmpty()) {
            ranking = new StringBuilder("Nenhum jogador encontrado");
        } else {
            for (Jogador jogador : jogo.getJogadores()) {
                ranking.append("\n").append(servicoPontuacao.pontuacaoDoJogador(jogador));
            }
        }

        return ranking.toString();
    }
}
