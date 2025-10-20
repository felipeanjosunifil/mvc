package com.github.lipenathan.servico;

import com.github.lipenathan.modelo.Jogador;
import com.github.lipenathan.modelo.Jogo;

//S - Responsábilidade única. Cada serviço tem uma responsabilidade
public class ServicoJogo {

    //Dependencia de uma interface e não classe concreta
    private ServicoPontuacaoSimples servicoPontuacao;

    //D - Injeção de Dependência
    public ServicoJogo(ServicoPontuacaoSimples servicoPontuacao) {
        this.servicoPontuacao = servicoPontuacao;
    }

    //O - Princípio Aberto Fechado. Estes métodos aumentam o comportamento da classe mas não alteram seu comportamento
    public String descricaoJogo(Jogo jogo) {
     return "O jogo " + jogo.getNome() + " é um jogo " + jogo.getTipo() + " para ser jogado por(ou até) " + jogo.getNumeroJogadores()
             + " a partir de " + jogo.getIdadeMinima() + " anos de idade";
    }

    public boolean verificarDisponibilidadeJogadores(Jogo jogo) {
        return jogo.getJogadores().size() < jogo.getNumeroJogadores();
    }

    public void adicionarPonto(Jogo jogo, int posicao) {
        servicoPontuacao.adicionarPonto(jogo.getJogadores().get(posicao));
    }

    public String ranking(Jogo jogo) {

        StringBuilder ranking = new StringBuilder();

        if (jogo.getJogadores().isEmpty()) {
            ranking = new StringBuilder("Nenhum jogador encontrado");
        } else {
            for (Jogador jogador : jogo.getJogadores()) {
                ranking.append("\n").append(servicoPontuacao.pontuacaoJogador(jogador));
            }
        }

        return ranking.toString();
    }
}
