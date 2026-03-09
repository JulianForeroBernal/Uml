public class Perro extends Animal {
    private String raza;
    public Perro(String nombre, int edad, String raza){
        super(nombre, edad);
        this.raza = raza;
    }
    public void ladrar(){
        System.out.println(nombre + " está ladrando");
    }
    @Override
    public void hacerSonido(){
        System.out.println(nombre + " dice: Guau Guau");
    }
}
