package visitor;

import org.example.visitor.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ImpostosDaEuropaTest {

    @Test
    void deveAplicarImpostoEmJogo() {
        Jogo jogo = new Jogo(100);

        ImpostosDaEuropa visitor = new ImpostosDaEuropa();
        assertEquals(120, visitor.calcularImpostos(jogo));
    }

    @Test
    void deveAplicarImpostoEmSkin() {
        Skin skin = new Skin(100);

        ImpostosDaEuropa visitor = new ImpostosDaEuropa();
        assertEquals(120, visitor.calcularImpostos(skin));
    }

    @Test
    void deveAplicarImpostoEmSoundtrack() {
        Soundtrack soundtrack = new Soundtrack(100);

        ImpostosDaEuropa visitor = new ImpostosDaEuropa();
        assertEquals(120, visitor.calcularImpostos(soundtrack));
    }

}
