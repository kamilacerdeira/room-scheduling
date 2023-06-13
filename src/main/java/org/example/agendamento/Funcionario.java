package org.example.agendamento;

public class Funcionario {
    private String id;
    private String nome;
    private String cargo;

    public Funcionario( String nome, String cargo) {

        this.nome = nome;
        this.cargo = cargo;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }
}
