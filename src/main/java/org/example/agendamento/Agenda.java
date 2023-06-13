package org.example.agendamento;

public class Agenda {
    private String id;
    private String nomeFuncionarioResponsavel;
    private String nomeSalaAgendada;

    public Agenda(String id, String nomeFuncionarioResponsavel, String nomeSalaAgendada) {
        this.id = id;
        this.nomeFuncionarioResponsavel = nomeFuncionarioResponsavel;
        this.nomeSalaAgendada = nomeSalaAgendada;
    }

    public String getId() {
        return id;
    }

    public String getNomeFuncionarioResponsavel() {
        return nomeFuncionarioResponsavel;
    }

    public String getNomeSalaAgendada() {
        return nomeSalaAgendada;
    }
}
