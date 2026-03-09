public class Casa {
    private Habitacion habitacion;

    public Casa(){
        habitacion = new Habitacion("Sala");
    }

    public Habitacion getHabitacion(){
        return habitacion;
    }
}
