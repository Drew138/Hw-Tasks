package midterm2;

class PrincipalVehiculo {
    public static Vehiculo[] vehiculos = new Vehiculo[3];

    public static void mostrarVehiculos() {
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println(vehiculos[i].toString());
        }
    }

    public static void main(String[] args) {
        vehiculos[0] = new Vehiculo();
        vehiculos[1] = new Vehiculo("Honeycoupe1", 1, 20);
        vehiculos[2] = new Vehiculo("Quacker1", 2, 10);
        mostrarVehiculos();
        Vehiculo.choque(vehiculos[1], vehiculos[2]);
        Vehiculo.choque(vehiculos[0], vehiculos[2]);
        mostrarVehiculos();
    }
}