package com.github.lipenathan.servico;

import com.github.lipenathan.modelo.Jogador;
import com.github.lipenathan.modelo.Jogo;

import java.util.List;

//S - Responsábilidade única. Cada serviço tem uma responsabilidade
public class ServicoPontuacaoImpl implements ServicoPontuacaoSimples {

    public String pontuacaoJogador(Jogador jogador) {
        return "Nome: " + jogador.getNome() + "\nPontuacao: " + jogador.getPontuacao();
    }

    public Jogador verificarVencedor(Jogo jogo) throws Exception {
            if (jogo.getJogadores().isEmpty()) {
                throw new Exception("O jogo não possui jogadores");
            } else {
                List<Jogador> jogadores = jogo.getJogadores();
                Jogador vencedor = jogadores.get(0);
                for (Jogador j : jogadores) {
                    if (j.getPontuacao() > vencedor.getPontuacao()) {
                        vencedor = j;
                    }
                }

                return vencedor;
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
