package br.com.zup.brenohof.servicetransacao.repository;

import br.com.zup.brenohof.servicetransacao.modelos.Cartao;
import br.com.zup.brenohof.servicetransacao.modelos.Transacao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoTransacaoRepository extends JpaRepository<Transacao, String> {
    Page<Transacao> findByCartao(Cartao cartao, Pageable pageable);
}
