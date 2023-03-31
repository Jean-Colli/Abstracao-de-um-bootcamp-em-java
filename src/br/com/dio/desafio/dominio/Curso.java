package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    
    private int cargaHoraria;

    @Override 
    public double caucularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso(){

    }

    public int getCargaHoraria(){
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString(){
        return "\nCurso { " +
                "Título = '" + getTitulo() + '\'' + 
                ", Descrição = '" + getDescricao() + '\'' + 
                ", Carga Horária = " + cargaHoraria + " Horas " + 
                '}';
    }



}
