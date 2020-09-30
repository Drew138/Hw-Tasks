package w5;

import java.util.Scanner;

public class ControlAmbiente {

    public static void main(String[] args) {
        SensorActuador sensor = new SensorActuador(5, 1, 10);
        int num;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            num = scan.nextInt();
            if (i < 2) {
                sensor.disminuirTemp(num);
            } else {
                sensor.aumentarTemp(num);
            }
        }
        System.out.println(sensor.getTemperatura());
        scan.close();
    }
}