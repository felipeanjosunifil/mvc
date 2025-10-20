package com.github.lipenathan.servico;

import com.github.lipenathan.modelo.Jogador;

//I - Princípio de segregaçao de interface
public interface ServicoPontuacaoVariavel extends ServicoPontuacao {
    Jogador adicionarPontos(Jogador jogador, int pontos);
    Jogador removerPontos(Jogador jogador, int pontos);
}
