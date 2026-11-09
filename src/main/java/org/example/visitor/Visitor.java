package org.example.visitor;

public interface Visitor {
    float calcularImpostoParaJogo(Jogo jogo);
    float calcularImpostoParaSkin(Skin skin);
    float calcularImpostoParaSoundtrack(Soundtrack Soundtrack);
}
