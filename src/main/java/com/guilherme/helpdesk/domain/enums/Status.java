package com.guilherme.helpdesk.domain.enums;

public enum Status {
    ADMIN(0, "ABERTO"), CLIENTE(1, "ANDAMENTO"), TECNICO(2, "ENCERRADO");

    private Integer codigo;
    private String descricao;

    Status(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Status toEnum(Integer cod){
        if (cod == null) {
            return null;
        }
        for(Status x : Status.values()) {
            if(cod.equals(x.getCodigo())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Status invalido");
    }
}
