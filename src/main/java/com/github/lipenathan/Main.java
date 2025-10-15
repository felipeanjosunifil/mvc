package com.github.lipenathan;

public class Main {
    public static void main(String[] args) {
        Compra compra1 = new Compra(1000, "Fulano", 11);

        Compra compra2 = new Compra(1500, "Ciclano", 15);

//        ServicoFrete servicoFrete = new ServicoFrete(); //caso o contrutor necessite de parâmetro

        InterfaceFrete servicoFrete = new ServicoFrete();

        ServicoCompra servicoCompra = new ServicoCompra(servicoFrete);


        double valorCompra1 = servicoCompra.calcularPrecoCompraParcelada(compra1);

        System.out.println("A compra do " + compra1.getNomeCliente() + " ficou com um total de: R$" + valorCompra1);

        double valorCompra2 = servicoCompra.calcularPrecoCompraParcelada(compra2);
        System.out.println("A compra do " + compra2.getNomeCliente() + " ficou com um total de: R$" + valorCompra2);
    }
}