package dev.fujioka.java.avancado.web.matricula;

import dev.fujioka.java.avancado.web.model.Professor;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class CursoConsumer {

    @JmsListener(destination = "professor_queue")
    public void receiveMessage(Professor professor) {
        System.out.println("Mensagem da fila:" + professor.getNome());
    }
}
