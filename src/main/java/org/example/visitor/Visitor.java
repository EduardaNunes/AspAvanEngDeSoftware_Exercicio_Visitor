package org.example.visitor;

public interface Visitor {
    void CalcularImpostoParaJogo(Jogo jogo);
    void CalcularImpostoParaSkin(Skin skin);
    void CalcularImpostoParaSoundtrack(Soundtrack Soundtrack);
}
