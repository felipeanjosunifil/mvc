package com.github.lipenathan.modelo;

import java.util.List;

public class Jogo {
    private String nome;
    private int numeroJogadores;
    private int idade;
    private String tipo;
    private List<Jogador> jogadores;

    public Jogo(String nome, int numeroJogadores, int idade, String tipo) {
        this.nome = nome;
        this.numeroJogadores = numeroJogadores;
        this.idade = idade;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public void adionarJogador(Jogador jogador){
        this.jogadores.add(jogador);
    }
}
