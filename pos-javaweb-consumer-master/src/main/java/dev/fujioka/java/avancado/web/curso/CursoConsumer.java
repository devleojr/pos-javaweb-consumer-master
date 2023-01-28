package dev.fujioka.java.avancado.web.matricula;

import dev.fujioka.java.avancado.web.model.Curso;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class CursoConsumer {

    @JmsListener(destination = "curso_queue")
    public void receiveMessage(Curso curso) {
        System.out.println("Mensagem da fila:" + curso.getDescricao());
    }
}
