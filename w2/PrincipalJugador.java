package w2;

import java.util.Scanner;

public class PrincipalJugador {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        Jugador player = new Jugador();
        int salud = myScan.nextInt();
        player.setSalud(salud);
        String nombre = myScan.next();
        player.setNombre(nombre);
        int redSalud = myScan.nextInt();
        player.reducirSalud(redSalud);
        int redSalud2 = myScan.nextInt();
        player.reducirSalud(redSalud2);
        System.out.println(player.getNombre() + "" + player.getSalud());
        myScan.close();
    }
}
