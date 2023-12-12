package org.example;

public enum PedidoEnum {
    CACHORRO_QUENTE("Cachorro quente"),
    XBURGUER("X-burguer");

    private final String descricao;

    PedidoEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }


}
