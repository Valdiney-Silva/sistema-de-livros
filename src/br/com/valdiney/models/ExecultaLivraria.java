package br.com.valdiney.models;

import java.time.LocalDate;
import java.time.LocalTime;

public class ExecultaLivraria {
    public static void main(String[] args) {

        var biblioteca = new Biblioteca();

        Emprestimo emprestimo1 = new Emprestimo();
        emprestimo1.emprestarLivro();
        //emprestimo1.perguntaSeQuerEmprestimo();

        //biblioteca.listarLivros();


    }
}
