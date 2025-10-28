package br.com.valdiney.models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class RasqunhoEmprestimoRefatorado {
/*
    public boolean perguntaSeQuerEmprestimo() {
        Scanner entrada = new Scanner(System.in);
        boolean respostaValida = false;
        boolean querEmprestimo = false;

        while (!respostaValida) {
            System.out.print("Deseja solicitar o empréstimo de um livro? (S para sim | N para sair):\n");
            String resposta = entrada.next().trim();

            if (resposta.equalsIgnoreCase("S")) {
                querEmprestimo = true;
                respostaValida = true;
            } else if (resposta.equalsIgnoreCase("N")) {
                querEmprestimo = false;
                respostaValida = true;
                despedirse();
            } else {
                System.err.println("Entrada inválida! Digite apenas S ou N.\n");
            }
        }

        return querEmprestimo;
    }

    public void emprestarLivro() {
        Biblioteca biblioteca = new Biblioteca();
        Scanner entrada = new Scanner(System.in);

        boolean contunuarEmprestando = true;

        while (contunuarEmprestando) {
            System.out.println();

            if (perguntaSeQuerEmprestimo()) {

                boolean respostaValida = false;
                int idLivroDesejado = -1;

                while (!respostaValida) {
                    biblioteca.listarLivros();
                    System.out.println("Dos seguintes livros, qual dos disponiveis deseja solicitar empréstimo?\nPor favor digite o ID do Livro desejado");
                    String idResposta = entrada.next();

                    try {
                        idLivroDesejado = Integer.parseInt(idResposta);
                        //respostaValida = true;
                    } catch (NumberFormatException e) {
                        System.err.println("Entrada inválida! Você não digitou um número.");
                        continue;
                    }

                    Livro livroEncontrado = biblioteca.buscaLivroPorId(idLivroDesejado);

                    if (livroEncontrado == null) {
                        System.out.println("Nenhum livro encontrado com esse ID");
                        respostaValida = false;
                    } else if (!livroEncontrado.isDisponivel()) {
                        System.out.println("Livro já emprestado para alguém");
                        respostaValida = false;
                    } else {
                        System.out.printf("Livro [%s - id %d] está disponível%n", livroEncontrado.getTitulo(), livroEncontrado.getId());
                        System.out.println("Qual o seu nome?");
                        nomeCliente = entrada.next();
                        dataEmprestimo = LocalDate.now();
                        livroEncontrado.indisponibilizarLivro(livroEncontrado.getId());
                        System.out.println("Livro alugado com sucesso!");
                    }
                }
            } else {
                break;
            }
            System.out.println("Deseja solicitar outro emprestimo? S/N: ");
            String resposta = entrada.next().trim().toUpperCase();

            if (!resposta.equalsIgnoreCase("S")) {
                contunuarEmprestando = false;
            }
            emprestarLivro();
        }
        entrada.close();
        System.out.println("Sistemas de emprestimo encerrado.");
        despedirse();
    }

    public void emprestarLivro() {
        Biblioteca biblioteca = new Biblioteca();
        Scanner entrada = new Scanner(System.in);

        boolean continuarEmprestando = true;

        while (continuarEmprestando) {
            if (!perguntaSeQuerEmprestimo()) break;

            processarEmprestimo(biblioteca, entrada);

            System.out.println("Deseja solicitar outro empréstimo? (S/N): ");
            String resposta = entrada.next().trim().toUpperCase();
            continuarEmprestando = resposta.equals("S");
        }

        entrada.close();
        System.out.println("Sistema de empréstimo encerrado.");
        despedirse();
    }

    private void processarEmprestimo(Biblioteca biblioteca, Scanner entrada) {
        int idLivroDesejado = solicitarIdLivro(biblioteca, entrada);
        if (idLivroDesejado == -1) return; // se não achou um livro válido, sai

        Livro livro = biblioteca.buscaLivroPorId(idLivroDesejado);

        if (livro == null) {
            System.out.println("Nenhum livro encontrado com esse ID.");
        } else if (!livro.isDisponivel()) {
            System.out.println("Livro já emprestado para alguém.");
        } else {
            concluirEmprestimo(livro, entrada);
        }
    }

    private int solicitarIdLivro(Biblioteca biblioteca, Scanner entrada) {
        while (true) {
            biblioteca.listarLivros();
            System.out.println("Digite o ID do livro desejado:");
            String resposta = entrada.next();

            try {
                return Integer.parseInt(resposta);
            } catch (NumberFormatException e) {
                System.err.println("Entrada inválida! Você não digitou um número.");
            }
        }
    }

    private void concluirEmprestimo(Livro livro, Scanner entrada) {
        System.out.printf("Livro [%s - id %d] está disponível%n", livro.getTitulo(), livro.getId());
        System.out.println("Qual o seu nome?");
        String nomeCliente = entrada.next();

        LocalDate dataEmprestimo = LocalDate.now();
        livro.indisponibilizarLivro(livro.getId());

        System.out.println("Livro alugado com sucesso!");
    }

    private static void despedirse() {
        LocalTime horaAtual = LocalTime.now();
        LocalTime meioDia = LocalTime.of(12, 0, 0);
        if (horaAtual.isBefore(meioDia)) {
            System.out.println("Foi um prazer atender você. Tenha um ótimo dia");
        } else {
            System.out.println("Foi um prazer atender você. Tenha uma ótima tarde");
        }
    }*/
}
