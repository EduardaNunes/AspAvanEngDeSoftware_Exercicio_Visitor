package org.example.visitor;

public class Skin implements ItemSteam{

    private int preco;

    public Skin(int preco){
        this.preco = preco;
    }

    public int getPreco() {
        return preco;
    }

    @Override
    public float aceitar(Visitor visitor) {
        return visitor.calcularImpostoParaSkin(this);
    }
}
