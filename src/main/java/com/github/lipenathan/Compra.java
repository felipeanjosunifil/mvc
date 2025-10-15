package com.github.lipenathan;

public class Compra {
    private double valor;
    private String nomeCliente;
    private int qtdItens;
    private String tipoPagamento;

    public Compra(double valor, String nomeCliente, int qtdItens) {
        this.valor = valor;
        this.nomeCliente = nomeCliente;
        this.qtdItens = qtdItens;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getQtdItens() {
        return qtdItens;
    }

    public void setQtdItens(int qtdItens) {
        this.qtdItens = qtdItens;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
