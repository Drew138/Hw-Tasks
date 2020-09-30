package w3;

public class Discoteca {
    public boolean accesoDiscoteca(int edad, int dinero, String nombre) {
        boolean hasAccess;
        boolean name = nombre.equals("jimmy");
        boolean age = edad >= 18;
        boolean money = dinero >= 100;
        if ((!name) && (age) && (money)) {
            hasAccess = true;
        } else {
            hasAccess = false;
        }
        return hasAccess;
    }
}