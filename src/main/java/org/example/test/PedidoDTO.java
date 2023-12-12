package org.example.test;

public class PedidoDTO {

    private PedidoEnum tipoPedido;
    private double valor;

    public void setTipoPedido(PedidoEnum pedidoEnum) {
        this.tipoPedido = pedidoEnum;
    }

    public PedidoEnum getTipoPedido() {
       return this.tipoPedido;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


}