package br.com.zup.brenohof.servicetransacao.repository;

import br.com.zup.brenohof.servicetransacao.modelos.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartaoRepository extends JpaRepository<Cartao, String> {
}
