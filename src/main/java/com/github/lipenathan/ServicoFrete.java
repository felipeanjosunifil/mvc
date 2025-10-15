package com.github.lipenathan;

public class ServicoFrete implements InterfaceFrete {
    private static double FRETE = 10.00;

    public Double calcularFrete(Compra compra) {
        double freteEfetivo = FRETE;
        if (compra.getQtdItens() > 10) {
            freteEfetivo = freteEfetivo + 10.0;
        }
        return freteEfetivo;
    }
}
