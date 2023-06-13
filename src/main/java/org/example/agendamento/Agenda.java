package org.example.agendamento;

public class Agenda {
    private String id;
    private String nomeFuncionarioResponsavel;
    private String nomeSalaAgendada;
    private String data;
    private String horario;

    public Agenda(String nomeFuncionarioResponsavel, String nomeSalaAgendada, String data, String horario) {
        this.nomeFuncionarioResponsavel = nomeFuncionarioResponsavel;
        this.nomeSalaAgendada = nomeSalaAgendada;
        this.data = data;
        this.horario = horario;
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

    public String getData() {
        return data;
    }

    public String getHorario() {
        return horario;
    }
}
