package w2;

public class MascotaSimple {
    private int edad = 8;
    private String nombre;

    public MascotaSimple() {
        this.nombre = "Kitty";
    }

    public MascotaSimple(String nombre) {
        this.nombre = nombre;
    }

    public MascotaSimple(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getNombre() {
        return this.nombre;
    }

}