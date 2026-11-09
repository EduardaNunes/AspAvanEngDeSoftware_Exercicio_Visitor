package visitor;

import org.example.visitor.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ImpostosDoBrasilTest {

    @Test
    void deveAplicarImpostoEmJogo() {
        Jogo jogo = new Jogo(100);

        ImpostosDoBrasil visitor = new ImpostosDoBrasil();
        assertEquals(140, visitor.calcularImpostos(jogo));
    }

    @Test
    void deveAplicarImpostoEmSkin() {
        Skin skin = new Skin(100);

        ImpostosDoBrasil visitor = new ImpostosDoBrasil();
        assertEquals(140, visitor.calcularImpostos(skin));
    }

    @Test
    void deveAplicarImpostoEmSoundtrack() {
        Soundtrack soundtrack = new Soundtrack(100);

        ImpostosDoBrasil visitor = new ImpostosDoBrasil();
        assertEquals(140, visitor.calcularImpostos(soundtrack));
    }
}
