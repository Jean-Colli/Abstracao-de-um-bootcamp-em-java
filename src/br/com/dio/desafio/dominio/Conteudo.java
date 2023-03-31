package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    
    protected static final double XP_PADRAO = 10d;

    private String Titulo;
    private String Descricao;

    public abstract double caucularXp();

    public String getTitulo(){
        return Titulo;
    }
    
    public void setTitulo(String Titulo){
        this.Titulo = Titulo;
    }

    public String getDescricao(){
        return Descricao;
    }

    public void setDescricao(String Descricao){
        this.Descricao = Descricao;
    }
}
