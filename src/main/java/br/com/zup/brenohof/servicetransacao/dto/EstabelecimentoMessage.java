package br.com.zup.brenohof.servicetransacao.dto;

import br.com.zup.brenohof.servicetransacao.modelos.Estabelecimento;

public class EstabelecimentoMessage {
    private String nome;
    private String cidade;
    private String endereco;

    @Deprecated
    public EstabelecimentoMessage() {
    }

    public EstabelecimentoMessage(String nome, String cidade, String endereco) {
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Estabelecimento{" +
                "nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public Estabelecimento toModel() {
        return new Estabelecimento(nome, cidade, endereco);
    }
}
