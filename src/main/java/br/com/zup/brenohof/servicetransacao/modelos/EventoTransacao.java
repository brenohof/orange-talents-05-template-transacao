package br.com.zup.brenohof.servicetransacao.modelos;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transacoes")
public class EventoTransacao {
    @Id @NotNull
    private String id;
    private @NotNull BigDecimal valor;
    @OneToOne(cascade = CascadeType.ALL)
    private @NotNull Estabelecimento estabelecimento;
    @OneToOne(cascade = CascadeType.ALL)
    private @NotNull Cartao cartao;
    private @NotNull LocalDateTime efetivadaEm;

    @Deprecated
    public EventoTransacao() {
    }

    public EventoTransacao(String id, BigDecimal valor, Estabelecimento estabelecimento, Cartao cartao, LocalDateTime efetivadaEm) {
        this.id = id;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadaEm = efetivadaEm;
    }
}
