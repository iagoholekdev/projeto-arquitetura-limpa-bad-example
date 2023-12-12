package org.example;

import java.text.DecimalFormat;

public class CriarPedidoUseCase {

    public static double generateRandomValue() {
        double randomValue = 5.0 + (15.0 - 5.0) * Math.random();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedRandomValue = decimalFormat.format(randomValue);
        return Double.parseDouble(formattedRandomValue);
    }

    public PedidoDTO criarPedido(ClienteDTO clienteDTO, String tipoPedido) {
        PedidoDTO pedidoDTO = new PedidoDTO();
        pedidoDTO.setValor(generateRandomValue());

        if (ResourceString.getXBurguerConst().equalsIgnoreCase(tipoPedido)) {
            pedidoDTO.setTipoPedido(PedidoEnum.XBURGUER);
        } else if (ValidaTipoDoPedido.isCachorroQuente(tipoPedido)) {
            pedidoDTO.setTipoPedido(PedidoEnum.CACHORRO_QUENTE);
        } else {
            System.out.println("Pedido inválido. Tente novamente.");
        }

        return pedidoDTO;
    }
}