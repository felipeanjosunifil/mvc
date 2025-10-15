package com.github.lipenathan;

public interface InterfaceCompra {
    Compra reaizarPedido(String nomeCliente, int qtdItens, double valor);
    void realizarPagamento(Compra compra, String metodoPagamento);
    double calcualarPrecoTotal(Compra compra);
}
