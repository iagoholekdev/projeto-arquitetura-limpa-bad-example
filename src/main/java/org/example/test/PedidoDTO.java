package org.example;

public class PedidoDTO {

    private PedidoEnum tipoPedido;
    private double valor;

    public void setTipoPedido(PedidoEnum pedidoEnum) {
        this.tipoPedido = pedidoEnum;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


}