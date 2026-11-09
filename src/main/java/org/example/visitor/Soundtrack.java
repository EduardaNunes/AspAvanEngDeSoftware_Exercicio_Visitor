package org.example.visitor;

public class Soundtrack implements ItemSteam{

    private int preco;

    public Soundtrack(int preco){
        this.preco = preco;
    }

    public int getPreco() {
        return preco;
    }

    @Override
    public float aceitar(Visitor visitor) {
        return visitor.calcularImpostoParaSoundtrack(this);
    }
}
