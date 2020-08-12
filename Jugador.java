public class Jugador {
    private String nombre;
    private int salud;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getSalud() {
        return this.salud;
    }

    public void reducirSalud(int salud) {
        this.salud -= salud;
    }
}