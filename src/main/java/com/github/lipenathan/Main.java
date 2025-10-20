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

        //L - Princípio de Liskov. Uma classe precisa poder ser substituída por sua classe filha(herança)
//        Jogo jogo = new Jogo("Banco imobiliário", 8, 12, "Tabuleiro");
        Jogo jogo = new JogoDaVelha();

        ServicoJogo servicoJogo = new ServicoJogo(new ServicoPontuacaoImpl());

        String descricao = servicoJogo.descricaoJogo(jogo);

        System.out.println(descricao);

        List<Jogador> jogadores = new ArrayList<>();

        Jogador jogador1 = new Jogador("Alberto");
        Jogador jogador2 = new Jogador("Ana");
        Jogador jogador3 = new Jogador("Pedro");

        jogadores.add(jogador1);
        jogadores.add(jogador2);
        jogadores.add(jogador3);

        jogo.setJogadores(jogadores);

        boolean aceitaJogadores = servicoJogo.verificarDisponibilidadeJogadores(jogo);

        System.out.println(aceitaJogadores);

        servicoJogo.adicionarPonto(jogo, 0);
        servicoJogo.adicionarPonto(jogo, 0);
        servicoJogo.adicionarPonto(jogo, 0);

        servicoJogo.adicionarPonto(jogo, 1);
        servicoJogo.adicionarPonto(jogo, 1);

//        servicoJogo.adicionarPonto(jogo, 2);
//        servicoJogo.adicionarPonto(jogo, 2);
//        servicoJogo.adicionarPonto(jogo, 2);
//        servicoJogo.adicionarPonto(jogo, 2);

        String ranking = servicoJogo.ranking(jogo);

        System.out.println(ranking);
    }
}