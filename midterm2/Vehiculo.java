package midterm2;

public class Vehiculo {

    private String nombre;
    private int ataque;
    private int velocidad;

    public Vehiculo() {
        this("Daytripper", 5, 10);
    }

    public Vehiculo(String n, int a, int v) {
        this.nombre = n;
        this.ataque = a;
        this.velocidad = v;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public int getAtaque() {
        return this.ataque;
    }

    public void setVelocidad(int v) {
        if (v >= 0) {
            this.velocidad = v;
        } else {
            this.velocidad = 0;
        }
    }

    public void setAtaque(int a) {
        if (a >= 0) {
            this.ataque = a;
        } else {
            this.ataque = 0;
        }
    }

    public static void choque(Vehiculo v1, Vehiculo v2) {
        v2.setVelocidad(v2.getVelocidad() - v1.getAtaque());
        if (v2.getVelocidad() == 0) {
            System.out.println("Vehiculo " + v2.getNombre() + " frenado");
        }
    }

    public String toString() {
        return "Nombre: " + this.nombre + " Ataque: " + this.ataque + " Velocidad: " + this.velocidad;
    }

    public String getNombre() {
        return this.nombre;
    }
}
