package br.com.emmanuelneri.relatorios.vo;

import br.com.emmanuelneri.relatorios.model.enuns.Marca;

import java.io.Serializable;

public class ModeloVo implements Serializable {

    private Long id;

    private String nome;

    private Marca marca;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

}
