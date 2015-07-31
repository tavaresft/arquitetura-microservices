package br.com.emmanuelneri.relatorios.shiro;


import java.util.Objects;

public final class ModuloVO {

    public static final String MODULO_CADASTRO = "Relatórios";

    private final String nome;
    private final String chave;
    private final String url;

    public ModuloVO(String nome, String chave, String url) {
        this.nome = nome;
        this.chave = chave;
        this.url = url;
    }

    public String getNome() {
        return nome;
    }

    public String getChave() {
        return chave;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ModuloVO moduloVO = (ModuloVO) o;
        return Objects.equals(nome, moduloVO.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
