package br.com.valdiney.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    /*
    livros: Lista de livros na biblioteca
    autores: Lista de autores da biblioteca
    emprestimos: Lista de empréstimos da biblioteca
     */


    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public Biblioteca() {
        inicializarDados();
    }

    public Livro buscaLivroPorId(int id) {
        for (Livro livro : livros) {
            if (livro.getId() == id) {
                return livro;
            }
        }
        return null;
    }

    public boolean livroDisponivel(int id){
        Livro livro = buscaLivroPorId(id);
        if (livro!= null){
            return livro.isDisponivel();
        }
        return false;
    }

    private void inicializarDados() {
        var autor1 = new Autor(1, "Jose", LocalDate.of(1990, 10, 10));
        var autor2 = new Autor(2, "Pedro", LocalDate.of(1995, 12, 8));
        var autor3 = new Autor(3, "Marcos", LocalDate.of(1999, 7, 6));
        var autor4 = new Autor(4, "Arthur", LocalDate.of(2000, 9, 3));
        var autor5 = new Autor(5, "Maria", LocalDate.of(1998, 2, 1));

        autores.add(autor1);
        autores.add(autor2);
        autores.add(autor3);
        autores.add(autor4);
        autores.add(autor5);

        var livro1 = new Livro(1, "java", autor1, true, LocalDate.of(2024, 10, 1), LocalDate.now());
        var livro2 = new Livro(2, "JavaScript", autor2, true, LocalDate.of(2022, 11, 10), LocalDate.now());
        var livro3 = new Livro(3, "Clean Code", autor3, true, LocalDate.of(2021, 12, 11), LocalDate.now());
        var livro4 = new Livro(4, "React", autor4, true, LocalDate.of(2020, 7, 15), LocalDate.now());
        var livro5 = new Livro(5, "Node.JS", autor5, true, LocalDate.of(2019, 5, 20), LocalDate.now());

        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);
        livros.add(livro4);
        livros.add(livro5);
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void listarLivros() {
        for (Livro listaDeLivros : livros) {
            String disponibilidade = listaDeLivros.isDisponivel() ? "Disponível" : "Indisponível";
            System.out.printf("Titulo: %-10s - id: %d - (%s)\n", listaDeLivros.getTitulo(), listaDeLivros.getId(), disponibilidade);
        }
    }


}
