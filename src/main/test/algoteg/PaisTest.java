package algoteg;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaisTest {
    Jugador unJugador = new Jugador(1, "azul");
    Jugador otroJugador = new Jugador(2, "rojo");
    Pais paisAtacante = new Pais("Argentina", unJugador);
    Pais paisDefensor = new Pais("Uruguay", otroJugador);
    Pais unPais = new Pais("Brasil",unJugador);
    Batalla batalla = new Batalla();

    @Test
    public void colocaUnEjercitoEnPais(){
        unPais.agregarEjercito(1);

        assertEquals(1, unPais.getEjercitoActual());
    }

    @Test
    public void quedanDosEjercitosAlColocaTresEjercitosyQuitarUno(){
        unPais.agregarEjercito(3);
        unPais.reducirEjercito(1);

        assertEquals(2, unPais.getEjercitoActual());
    }

    //Consultar por mock
    /*@Test
    public void ganaDefensor(){
        paisDefensor.setJugador(unJugador);
        paisAtacante.setJugador(otroJugador);
        paisAtacante.agregarEjercito(2);
        paisDefensor.agregarEjercito(1);

        Dado dadoAtacantemock = mock(Dado.class);
        when(dadoAtacantemock.getValor()).thenReturn(1);

        Dado dadoDefensormock = mock(Dado.class);
        when(dadoDefensormock.getValor()).thenReturn(6);

        Pais victorioso = batalla.obtenerVictoriosoDeGuerra(paisAtacante, paisDefensor, 1);

        assertEquals("Uruguay", victorioso.getNombre());
    }
    */



}