package br.com.zup.brenohof.servicetransacao.dto;

import br.com.zup.brenohof.servicetransacao.modelos.Cartao;

public class CartaoMessage {
    private String id;
    private String email;

    @Deprecated
    public CartaoMessage() {
    }

    public CartaoMessage(String id, String email) {
        this.id = id;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cartao{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public Cartao toModel() {
        return new Cartao(id, email);
    }
}
