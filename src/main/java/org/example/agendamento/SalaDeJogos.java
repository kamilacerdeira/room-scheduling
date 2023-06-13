package org.example.agendamento;

public class SalaDeJogos implements Sala {
    private String id;
    private String nome;

    public SalaDeJogos(String id, String nome) {
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
        return SalaType.SALA_DE_JOGOS;
    }
}
