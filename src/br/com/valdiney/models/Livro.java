package br.com.valdiney.models;

import java.time.LocalDate;

public class Livro {
    /*
    id: Identificador único do livro
    titulo: Título do livro
    autor: Autor do livro (objeto do tipo Autor)
    disponivel: Indica se o livro está disponível para empréstimo
    dataCadastro: Data que o livro foi cadastrado
    dataAtualização: Data que o livro foi atualizado
     */

    private final int id;
    private String titulo;
    private final Autor autor;
    private boolean disponivel;
    private final LocalDate dataCadastro;
    private LocalDate dataAtualizacao;

    public Livro(int id,String titulo, Autor autor, boolean disponivel, LocalDate dataCadastro, LocalDate dataAtualizacao) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
        this.dataCadastro = dataCadastro;
        this.dataAtualizacao = dataAtualizacao;
    }

    public int getId() {
        return id;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void disponibilizarLivro(int id){
        if (this.id == id && !this.disponivel){
            this.disponivel = true;
        }
    }

    public void indisponibilizarLivro(int id){
        if (this.id == id && this.disponivel){
            this.disponivel = false;
        }
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public LocalDate getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(LocalDate dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }
}
