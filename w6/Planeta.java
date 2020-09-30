package w6;

public class Planeta {
    private String nombre;
    private double masa;
    public static int contador = 0;

    Planeta() {
        this("Tierra", 5.972);
    }

    Planeta(String n, double m) {
        this.nombre = n;
        this.masa = m;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getMasa() {
        return this.masa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public static Planeta planetaMedio(Planeta p) {
        Planeta planeta = new Planeta(p.getNombre(), p.getMasa() / 2);
        return planeta;
    }
}