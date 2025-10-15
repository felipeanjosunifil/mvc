package com.github.lipenathan;

public class ServicoCompra implements InterfaceCompra {

    private InterfaceFrete servicoFrete;

    public ServicoCompra(InterfaceFrete servicoFrete) {
        this.servicoFrete = servicoFrete;
    }

    public double calcularPrecoCompraParcelada(Compra compra) {
        double juros = compra.getValor() * 0.01;
        return servicoFrete.calcularFrete(compra) + compra.getValor() + juros;
    }

    public double calcularPrecoCompraPix(Compra compra) {
        return servicoFrete.calcularFrete(compra) + compra.getValor();
    }

    public double calcularPrecoCompraBoleto(Compra compra) {
        double juros = compra.getValor() * 0.01;
        return servicoFrete.calcularFrete(compra) + compra.getValor() + juros;
    }

    @Override
    public Compra reaizarPedido(String nomeCliente, int qtdItens, double valor) {
        return new Compra(100, nomeCliente, qtdItens);
    }

    @Override
    public void realizarPagamento(Compra compra, String metodoPagamento) {
        //realiza alguma lógica para pagar compra
        compra.setTipoPagamento(metodoPagamento);
    }

    @Override
    public double calcualarPrecoTotal(Compra compra) {
        return servicoFrete.calcularFrete(compra) + compra.getValor();
    }
}
