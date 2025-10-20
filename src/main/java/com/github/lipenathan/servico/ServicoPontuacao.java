package com.github.lipenathan.servico;

import com.github.lipenathan.modelo.Jogador;
import com.github.lipenathan.modelo.Jogo;

public interface ServicoPontuacao {
    String pontuacaoJogador(Jogador jogador);
    Jogador verificarVencedor(Jogo jogo) throws Exception;
}
