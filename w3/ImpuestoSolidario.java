package w3;

import java.util.Scanner;

public class ImpuestoSolidario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salary = scan.nextDouble();
        String contract = scan.next();
        if ((contract.equals("publico")) && (salary > 10000000)) {
            double tax = salary * 0.15;
            String salaryString = String.format("%.2f", tax);
            System.out.println(salaryString);
        } else {
            System.out.println("No debes aportar");
        }
        scan.close();
    }
}