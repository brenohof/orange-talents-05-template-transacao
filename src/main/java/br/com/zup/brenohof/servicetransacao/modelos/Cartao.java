package br.com.zup.brenohof.servicetransacao.modelos;

import br.com.zup.brenohof.servicetransacao.dto.CartaoMessage;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "cartoes")
public class Cartao {
    @Id @NotNull
    private String id;
    @NotNull
    private String email;

    @Deprecated
    public Cartao() {
    }

    public Cartao(String id, String email) {
        this.id = id;
        this.email = email;
    }
}
