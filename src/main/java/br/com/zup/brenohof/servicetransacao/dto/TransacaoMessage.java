package br.com.zup.brenohof.servicetransacao.dto;

import br.com.zup.brenohof.servicetransacao.modelos.Cartao;
import br.com.zup.brenohof.servicetransacao.modelos.Estabelecimento;
import br.com.zup.brenohof.servicetransacao.modelos.Transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransacaoMessage {
    private String id;
    private BigDecimal valor;
    private EstabelecimentoMessage estabelecimento;
    private CartaoMessage cartao;
    private LocalDateTime efetivadaEm;

    @Deprecated
    public TransacaoMessage() {
    }

    public TransacaoMessage(String id, BigDecimal valor, EstabelecimentoMessage estabelecimento, CartaoMessage cartao, LocalDateTime efetivadaEm) {
        this.id = id;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadaEm = efetivadaEm;
    }

    public Transacao toModel() {
        Cartao cartao = this.cartao.toModel();
        Estabelecimento estabelecimento = this.estabelecimento.toModel();
        return new Transacao(id, valor, estabelecimento , cartao, efetivadaEm);
    }

    @Override
    public String toString() {
        return "Transacao{" +
                "id='" + id + '\'' +
                ", valor=" + valor +
                ", estabelecimento=" + estabelecimento +
                ", cartao=" + cartao +
                ", efetivadaEm=" + efetivadaEm +
                '}';
    }

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    public EstabelecimentoMessage getEstabelecimento() {
        return estabelecimento;
    }

    public CartaoMessage getCartao() {
        return cartao;
    }
}
