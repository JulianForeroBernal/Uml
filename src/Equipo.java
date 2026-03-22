import java.util.ArrayList;

public class Equipo {
    private ArrayList<Jugador> jugadores;
    public Equipo(){
        jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador j){
        jugadores.add(j);
    }
}
