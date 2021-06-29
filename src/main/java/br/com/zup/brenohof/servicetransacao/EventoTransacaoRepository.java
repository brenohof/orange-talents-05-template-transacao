package br.com.zup.brenohof.servicetransacao;

import br.com.zup.brenohof.servicetransacao.modelos.EventoTransacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoTransacaoRepository extends JpaRepository<EventoTransacao, String> {
}
