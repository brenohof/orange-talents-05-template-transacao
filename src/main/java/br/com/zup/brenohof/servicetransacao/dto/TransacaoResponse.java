package br.com.zup.brenohof.servicetransacao.dto;

import br.com.zup.brenohof.servicetransacao.modelos.Transacao;
import org.springframework.data.domain.Page;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransacaoResponse {
    private BigDecimal valor;
    private LocalDateTime efetivadaEm;
    private String estabelecimento;
    private String cidade;

    public TransacaoResponse(Transacao transacao) {
        this.valor = transacao.getValor();
        this.efetivadaEm = transacao.getEfetivadaEm();
        this.estabelecimento = transacao.getEstabelecimentoNome();
        this.cidade = transacao.getEstabelecimentoCidade();
    }

    public static Page<TransacaoResponse> from(Page<Transacao> transacaos) {
        return transacaos.map(TransacaoResponse::new);
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    public String getEstabelecimento() {
        return estabelecimento;
    }

    public String getCidade() {
        return cidade;
    }
}
