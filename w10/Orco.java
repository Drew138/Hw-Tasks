package w10;

public class Orco extends Monstruo {
    private String grunyido;

    public Orco(String nombre, int sangre, String grunyido) {
        super(nombre, sangre);
        this.grunyido = grunyido;
    }

    public String getGrunyido() {
        return this.grunyido;
    }

    public void setGrunyido(String grunyido) {
        this.grunyido = grunyido;
    }

    public void imprimirNombre() {
        System.out.println(this.getNombre());
    }

    @Override
    public void moverse() {
        System.out.println("Soy un orco, estoy corriendo " + this.getNombre());
    }
}
