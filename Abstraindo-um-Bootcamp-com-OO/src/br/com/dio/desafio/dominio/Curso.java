package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    private Integer cargaHoraria;

    public Curso() {
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" + "titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + '}';
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO*cargaHoraria;
    }
    
    
}
