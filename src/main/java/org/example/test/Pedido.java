package org.example;

public class Pedido {

        private PedidoEnum tipoPedido;
        private double valor;

        public void setValor(Double valor) {
                this.valor = valor;
        }

        public double getValor() {
                return this.valor;
        }


        public void setTipoPedido(PedidoEnum tipoPedido) {
                this.tipoPedido = tipoPedido;
        }

        public PedidoEnum getTipoPedido() {
                return this.tipoPedido;
        }


}
