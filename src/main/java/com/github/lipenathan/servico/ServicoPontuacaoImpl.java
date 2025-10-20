package com.github.lipenathan.servico;

import com.github.lipenathan.modelo.Jogador;
import com.github.lipenathan.modelo.Jogo;

public class ServicoPontuacaoImpl implements ServicoPontuacao, ServicoPontuacaoSimples {

    public String pontuacaoDoJogador(Jogador jogador) {
        return "Jogador: " + jogador.getNome() + "\nPontuação:" +  jogador.getPontuacao();
    }

    public Jogador verificarVencedor(Jogo jogo) throws Exception {
        if (jogo.getJogadores().isEmpty()) {
            throw new Exception("Jogo não contém jogadores");
        } else {
            Jogador jogador = jogo.getJogadores().get(0);

            for(Jogador jogadorComp : jogo.getJogadores()){
                if (jogadorComp.getPontuacao() > jogador.getPontuacao()){
                    jogador = jogadorComp;
                }
            }
            return jogador;
        }
    }

    @Override
    public Jogador adicionarPonto(Jogador jogador) {
        jogador.setPontuacao(jogador.getPontuacao() + 1);
        return jogador;
    }

    @Override
    public Jogador removerPonto(Jogador jogador) {
        jogador.setPontuacao(jogador.getPontuacao() - 1);
        return jogador;
    }
}
