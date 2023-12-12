package org.example;

import java.text.DecimalFormat;

public class PedidoClienteController {


    public void criarPedido(String tipoPedido) {

        PedidoDTO pedidoDTO = new PedidoDTO();
        pedidoDTO.setValor(generateRandomValue());

        Cliente cliente = new Cliente();
        cliente.setId(1L);
        cliente.setNome(cliente.getNome());

        Pedido pedido = new Pedido();
        if (ResourceString.getXBurguerConst().equalsIgnoreCase(tipoPedido)) {
            pedidoDTO.setTipoPedido(PedidoEnum.XBURGUER);
        } else if (ValidaTipoDoPedido.isCachorroQuente(tipoPedido)) {
            pedidoDTO.setTipoPedido(PedidoEnum.CACHORRO_QUENTE);
        } else {
            System.out.println("Pedido inválido. Tente novamente.");
        }
        pedido.setValor(CriarPedidoUseCase.generateRandomValue());

        PedidoCliente pedidoCliente = new PedidoCliente();
        pedidoCliente.setPedido(pedido);
        pedidoCliente.setCliente(cliente);



        System.out.println("Pedido criado!");
        System.out.println("Imprimindo comprovante...");


        System.out.println("\nDados do pedido");
        System.out.println("*******************");
        System.out.println("Nome do cliente: " + pedidoCliente.getCliente().getNome());
        System.out.println("Valor do pedido: " + pedidoCliente.getPedido().getValor());
        System.out.println("Lanche escolhido: " + pedidoCliente.getPedido().getTipoPedido().getDescricao());
        System.out.println("*******************");

    }
    public static double generateRandomValue() {
        double randomValue = 5.0 + (15.0 - 5.0) * Math.random();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedRandomValue = decimalFormat.format(randomValue);
        return Double.parseDouble(formattedRandomValue);
    }

}