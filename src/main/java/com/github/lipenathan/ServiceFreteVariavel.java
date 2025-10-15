package com.github.lipenathan;

public class ServiceFreteVariavel extends ServicoFrete {

    @Override
    public Double calcularFrete(Compra compra) {
        //posso adicionar um nova lógica aqui
        return super.calcularFrete(compra); //porém não posso alterar o comportamento da classe pai
    }

    public Double calcularFreteVariavel(Compra compra) {
        //realiza um regra de negócio específica para frete variável
        return 100.0;
    }
}
