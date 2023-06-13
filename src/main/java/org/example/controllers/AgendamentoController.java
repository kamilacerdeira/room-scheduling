package org.example.controllers;

import org.example.agendamento.*;

public class AgendamentoController {
    public void realizarAgendamento(SalaType tipoSala, String nomeSala, String data, String horario, String nomeFuncionario, String cargoFuncionario) {
        if (tipoSala == null || nomeSala.isEmpty() || data.isEmpty() || horario.isEmpty() || nomeFuncionario.isEmpty() || cargoFuncionario.isEmpty()) {
            System.out.println("Todos os campos devem ser preenchidos para realizar o agendamento.");
            return;
        }

        Sala sala = criarSala(tipoSala, nomeSala);
        Funcionario funcionario = new Funcionario(nomeFuncionario, cargoFuncionario);
        Agenda agenda = new Agenda(funcionario.getNome(), sala.getNome(), data, horario);

        exibirMensagemSucesso();
        exibirResumoAgendamento(agenda);
    }

    private Sala criarSala(SalaType tipoSala, String nomeSala) {
        switch (tipoSala) {
            case SALA_DE_JOGOS:
                return new SalaDeJogos(nomeSala);
            case SALA_DE_REUNIAO:
                return new SalaDeReuniao(nomeSala);
            case AUDITORIO:
                return new Auditorio(nomeSala);
            default:
                throw new IllegalArgumentException("Tipo de sala inválido.");
        }
    }

    private void exibirResumoAgendamento(Agenda agenda) {
        System.out.println("Resumo do Agendamento:");
        System.out.println("Funcionário responsável: " + agenda.getNomeFuncionarioResponsavel());
        System.out.println("Sala agendada: " + agenda.getNomeSalaAgendada());
        System.out.println("Data: " + agenda.getData());
        System.out.println("Horário: " + agenda.getHorario());
        System.out.println();
    }

    private void exibirMensagemSucesso() {
        System.out.println("Agendamento realizado com sucesso!");
    }
}
