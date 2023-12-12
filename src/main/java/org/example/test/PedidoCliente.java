package org.example.test;

public class PedidoCliente {


    private Long id;
    private Cliente cliente;
    private Pedido pedido;

    public void setPedido(Pedido valor) {
        this.pedido = valor;
    }

    public void setCliente(Cliente valor) {
        this.cliente = valor;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public Pedido getPedido() {
        return this.pedido;
    }


}