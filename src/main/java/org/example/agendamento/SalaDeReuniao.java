package org.example.agendamento;

public class SalaDeReuniao implements Sala {
    private String id;
    private String nome;

    public SalaDeReuniao(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public SalaType getTipo() {
        return SalaType.SALA_DE_REUNIAO;
    }
}
