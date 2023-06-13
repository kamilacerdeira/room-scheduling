package org.example.agendamento;

public class Auditorio implements Sala {
    private String id;
    private String nome;

    public Auditorio(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public SalaType getTipo() {
        return SalaType.AUDITORIO;
    }
}
