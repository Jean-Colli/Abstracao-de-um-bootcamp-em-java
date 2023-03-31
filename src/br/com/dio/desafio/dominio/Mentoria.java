package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo{
    private LocalDate data1 = LocalDate.now();

    // private String data = LocalDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String data = data1.format(formatter);

    @Override 
    public double caucularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria(){

    }
    
    public String getData(){
        return data;
    }


    @Override
    public String toString(){
        return "\nMentoria { " +
                "Título = '" + getTitulo() + '\'' + 
                ", Descrição = '" + getDescricao() + '\'' + 
                ", data = " + data + " " + 
                '}';
    }

}
