package com.github.lipenathan.modelo;

import java.util.List;

//L - Princípio de Liskov. Uma classe precisa poder ser substituída por sua classe filha(herança)
public class Jogo {
    private String nome;
    private int numeroJogadores;
    private int idadeMinima;
    private String tipo;
    private List<Jogador> jogadores;

    public Jogo(String nome, int numeroJogadores, int idadeMinima, String tipo) {
        this.nome = nome;
        this.numeroJogadores = numeroJogadores;
        this.idadeMinima = idadeMinima;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroJogadores() {
        return numeroJogadores;
    }

    public void setNumeroJogadores(int numeroJogadores) {
        this.numeroJogadores = numeroJogadores;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public int getIdadeMinima() {
        return idadeMinima;
    }

    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public void adicionarJogador(Jogador jogador) {
        this.jogadores.add(jogador);
    }
}
