package org.example.agendamento;

import org.example.controllers.AgendamentoController;
import org.example.views.AgendamentoView;

public class Main {
    public static void main(String[] args) {
        AgendamentoController controller = new AgendamentoController();
        AgendamentoView view = new AgendamentoView(controller);

        view.exibirTelaAgendamento();
    }
}