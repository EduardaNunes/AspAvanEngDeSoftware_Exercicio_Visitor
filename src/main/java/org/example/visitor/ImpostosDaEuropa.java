package org.example.visitor;

public class ImpostosDaEuropa implements Visitor{

    private final float taxa = 0.2f;

    public float calcularImpostos(ItemSteam itemSteam) {
        return itemSteam.aceitar(this);
    }

    public float calcularImpostoParaJogo(Jogo jogo){
        return jogo.getPreco() + (jogo.getPreco() * this.taxa);
    };

    public float calcularImpostoParaSkin(Skin skin){
        return skin.getPreco() + (skin.getPreco() * this.taxa);
    };

    public float calcularImpostoParaSoundtrack(Soundtrack soundtrack){
        return soundtrack.getPreco() + (soundtrack.getPreco() * this.taxa);
    };
}
