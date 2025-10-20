package com.github.lipenathan.servico;

import com.github.lipenathan.modelo.Jogador;

public interface ServicoPontuacaoVariavel extends ServicoPontuacao {
    int adicionarPontos(Jogador jogador, int pontos);
    int removerPontos(Jogador jogador, int pontos);
}
