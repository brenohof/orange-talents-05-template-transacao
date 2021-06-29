package br.com.zup.brenohof.servicetransacao.consumer;

import br.com.zup.brenohof.servicetransacao.repository.EventoTransacaoRepository;
import br.com.zup.brenohof.servicetransacao.dto.TransacaoMessage;
import br.com.zup.brenohof.servicetransacao.modelos.Transacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransacaoConsumer {

    @Autowired
    private EventoTransacaoRepository repository;

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void transacoes(TransacaoMessage transacao) {
        System.out.println("Consumido mensagem = " + transacao.getId());
        Transacao eventoTransacao = transacao.toModel();
        repository.save(eventoTransacao);
        System.out.println("Persistido mensagem = " + transacao.getId());
    }
}
