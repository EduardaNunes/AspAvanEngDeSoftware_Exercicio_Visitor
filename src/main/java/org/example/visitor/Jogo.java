package org.example.visitor;

public class Jogo implements ItemSteam{

    private int preco;

    public Jogo(int preco){
        this.preco = preco;
    }

    public int getPreco() {
        return preco;
    }

    @Override
    public float aceitar(Visitor visitor) {
        return visitor.calcularImpostoParaJogo(this);
    }
}
