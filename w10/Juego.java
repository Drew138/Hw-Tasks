package w10;

public class Juego {
    private Monstruo[] monstruo = new Monstruo[4];

    public Juego() {
        this.monstruo = new Monstruo[] { new Orco("Garnag", 10, "grrr"), new Dragon("Brenton", 20, "mental"),
                new Orco("Rogthun", 5, "purr"), new Dragon("Shenlong", 40, "cuero") };
    }

    public void moverMonstruos() {
        for (int i = 0; i < 4; i++) {
            this.monstruo[i].moverse();
        }
    }
}
