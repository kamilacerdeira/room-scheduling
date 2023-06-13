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

        // Lógica de agendamento aqui

        exibirMensagemSucesso();
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

    private void exibirMensagemSucesso() {
        System.out.println("Agendamento realizado com sucesso!");
    }
}
