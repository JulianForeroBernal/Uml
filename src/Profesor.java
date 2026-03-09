public class Profesor {
    private String nombre;
    private Estudiante estudiante;

    public Profesor(String nombre, Estudiante estudiante){
        this.nombre = nombre;
        this.estudiante = estudiante;
    }
    public void esenar(){
        System.out.println(this.nombre + " le enseña a: " + this.estudiante.getNombre());
    }
}


