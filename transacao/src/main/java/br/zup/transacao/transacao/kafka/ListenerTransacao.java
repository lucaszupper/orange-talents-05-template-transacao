package br.zup.transacao.transacao.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerTransacao {

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void ouvir(EventoTransacao eventoTransacao){
        System.out.println(eventoTransacao);
    }
}
