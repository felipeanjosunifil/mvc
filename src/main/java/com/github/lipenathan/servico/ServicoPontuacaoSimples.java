package com.github.lipenathan.servico;

import com.github.lipenathan.modelo.Jogador;

//I - Princípio de segregaçao de interface
public interface ServicoPontuacaoSimples extends ServicoPontuacao {
    Jogador adicionarPonto(Jogador jogador);
    Jogador removerPonto(Jogador jogador);
}
