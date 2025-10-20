package com.github.lipenathan;

import com.github.lipenathan.modelo.Jogador;
import com.github.lipenathan.modelo.Jogo;
import com.github.lipenathan.modelo.JogoDaVelha;
import com.github.lipenathan.servico.ServicoJogo;
import com.github.lipenathan.servico.ServicoPontuacaoImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Fulano");
        Jogador jogador2 = new Jogador("Ciclano");

        List<Jogador> jogadores = new ArrayList<>();

        jogadores.add(jogador1);
        jogadores.add(jogador2);

        Jogo jogoDaVelha = new JogoDaVelha();

        jogoDaVelha.setJogadores(jogadores);

        ServicoJogo servicoJogo = new ServicoJogo(new ServicoPontuacaoImpl());

        String descricao = servicoJogo.descricaoDoJogo(jogoDaVelha);

        System.out.println(descricao);

        servicoJogo.adicionarPontuacao(jogoDaVelha, 0);
        servicoJogo.adicionarPontuacao(jogoDaVelha, 0);
        servicoJogo.adicionarPontuacao(jogoDaVelha, 0);

        String ranking = servicoJogo.rankingPartida(jogoDaVelha);

        System.out.println(ranking);
    }
}