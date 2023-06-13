package org.example.controllers;

import org.example.agendamento.*;

public class AgendamentoController {
    public void realizarAgendamento(SalaType tipoSala, String idSala, String nomeSala, String idFuncionario, String nomeFuncionario, String cargoFuncionario) {
        Sala sala = criarSala(tipoSala, idSala, nomeSala);
        Funcionario funcionario = new Funcionario(idFuncionario, nomeFuncionario, cargoFuncionario);
        Agenda agenda = new Agenda("1", funcionario.getNome(), sala.getNome());

        // Lógica de agendamento aqui

        exibirMensagemSucesso();
    }

    private Sala criarSala(SalaType tipoSala, String idSala, String nomeSala) {
        switch (tipoSala) {
            case SALA_DE_JOGOS:
                return new SalaDeJogos(idSala, nomeSala);
            case SALA_DE_REUNIAO:
                return new SalaDeReuniao(idSala, nomeSala);
            case AUDITORIO:
                return new Auditorio(idSala, nomeSala);
            default:
                throw new IllegalArgumentException("Tipo de sala inválido.");
        }
    }

    private void exibirMensagemSucesso() {
        System.out.println("Agendamento realizado com sucesso!");
    }
}
