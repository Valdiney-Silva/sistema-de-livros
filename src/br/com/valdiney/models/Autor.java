package br.com.valdiney.models;

import java.time.LocalDate;

public class Autor {
    /*
    id: Identificador único do autor
    nome: Nome do autor
    dataNascimento: Nascimento do autor
     */
    private int id;
    private String nome;
    private final LocalDate dataNascimento;

    public Autor(int id, String nome, LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}
