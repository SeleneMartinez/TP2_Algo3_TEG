package algoteg;

import java.util.ArrayList;

public class Partida {

    private int cantidadTotalJugadores;
    private int cantidadJugadoresActuales;
    private ArrayList<Jugador> jugadores = new ArrayList<>();
    private ArrayList<Tarjeta> tarjetas = new ArrayList<>();
    int ronda;
    Jugador ganador;

    public Partida(int cantidadTotalJugadores) {
        cantidadJugadoresActuales = 0;
        if(cantidadTotalJugadores <= 6)
            this.cantidadTotalJugadores = cantidadTotalJugadores;
        else this.cantidadTotalJugadores = 6;
        this.ronda = 0;

    }

    public void agregarJugador (Jugador unJugador) {
        int idJugador = unJugador.getId();
        if(jugadores.size() < this.cantidadTotalJugadores){
            jugadores.add(unJugador);
            this.cantidadJugadoresActuales++;
        }
    }

    public int getCantidadJugadoresActuales(){return cantidadJugadoresActuales;}

    private void pasarRonda(){this.ronda++;}

    private void iniciarRonda(){
        int i = 0;
        boolean ganoJugador = false;
        while(!ganoJugador & (i< cantidadTotalJugadores)){
            ganoJugador = jugadores.get(i).obtenerSiGano();
            //acciones jugador
        }
        if(ganoJugador){
            this.ganador = jugadores.get(i);
        }
        this.pasarRonda();
    }

    public void jugarPartida(){
        boolean partidaTerminada = false;
        while(!partidaTerminada){
            iniciarRonda();
        }
    }

    public Jugador obtenerGanadorDePartida(){
        return(this.ganador);
    }
}
