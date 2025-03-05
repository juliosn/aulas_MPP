package model;

// Modelo (Model) - Representa os dados e a lógica de negócio
public class Produto {
    // Encapsulamento: os atributos são privados e acessados via métodos públicos
    private String nome;
    private double preco;

    // Construtor (Abstração: fornece uma interface para criar um produto)
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Métodos Getters e Setters (Encapsulamento)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
