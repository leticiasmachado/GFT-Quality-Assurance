package main.java.one.digitalinnovation.junit;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private String nome;
    
    private LocalDate nascimento;

    public Pessoa() {
    }

    public Pessoa(String nome, LocalDate nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }
    
    public int getIdade(){
        return (int) ChronoUnit.YEARS.between(this.nascimento, LocalDate.now());
    }
}
