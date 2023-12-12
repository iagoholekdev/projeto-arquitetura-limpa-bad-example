package org.example;

import java.util.Scanner;

import org.example.test.ClienteDTO;
import org.example.test.PedidoClienteController;



public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Qual é o seu nome? ");
        String nome = myScanner.nextLine();

        ClienteDTO clienteDTO = new ClienteDTO();
        clienteDTO.setId(1L);
        clienteDTO.setNome(nome);


        System.out.println("Qual é o seu pedido? Temos cachorro-quente e x-burguer.");
        String tipoPedido = myScanner.nextLine();

        PedidoClienteController pedidoClienteController = new PedidoClienteController();
        pedidoClienteController.criarPedido(clienteDTO, tipoPedido);

    }

}