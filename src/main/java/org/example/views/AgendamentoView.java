package org.example.views;

import org.example.agendamento.SalaType;
import org.example.controllers.AgendamentoController;

import java.util.Scanner;

public class AgendamentoView {
    private AgendamentoController controller;

    public AgendamentoView(AgendamentoController controller) {
        this.controller = controller;
    }

    public void exibirTelaAgendamento() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Agendamento de Sala ===");
        System.out.println("Digite o tipo de sala (1 - Sala de jogos, 2 - Sala de reunião, 3 - Auditório):");
        int tipoSala = scanner.nextInt();

        System.out.println("Digite o nome da sala:");
        String nomeSala = scanner.next();

        System.out.println("Digite a data do agendamento:");
        String data = scanner.next();

        System.out.println("Digite o horário do agendamento:");
        String horario = scanner.next();

        System.out.println("Digite o nome do funcionário:");
        String nomeFuncionario = scanner.next();

        System.out.println("Digite o cargo do funcionário:");
        String cargoFuncionario = scanner.next();

        controller.realizarAgendamento(SalaType.values()[tipoSala - 1], nomeSala, data, horario, nomeFuncionario, cargoFuncionario);
    }

    public void exibirMensagemSucesso() {
        System.out.println("Agendamento realizado com sucesso!");
    }
}
