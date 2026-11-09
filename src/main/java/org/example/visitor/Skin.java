package org.example.visitor;

public class Skin implements ItemSteam{

    private String nome;
    private int preco;

    public Skin(String nome, int preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    @Override
    public void Aceitar(Visitor visitor) {

    }
}
