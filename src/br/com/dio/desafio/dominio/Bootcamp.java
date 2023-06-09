package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final static LocalDate dataInicial = LocalDate.now();
    private final static LocalDate dataFinal = dataInicial.plusDays(45);
    private static Set<Dev> devsIncritos = new HashSet<>();
    private static Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome(){
        return nome;
    }
    
    public void SetNome(String nome){
        this.nome = nome;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public LocalDate getDataInicial(){
        return dataInicial;
    }

    public LocalDate getDataFinal(){
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos(){
        return devsIncritos;
    }

    public void setDevsInscritos(Set<Dev> devsIncritos){
        this.devsIncritos = devsIncritos;
    }

    public Set<Conteudo> getConteudos(){
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos){
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (this == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, Bootcamp.dataFinal) && Objects.equals(devsIncritos, Bootcamp.devsIncritos) && Objects.equals(conteudos, Bootcamp.conteudos);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsIncritos, conteudos);
    }
}
