import java.util.Scanner;

public class Trabajo {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        double salary = scan.nextDouble();
        switch(day) {
            case 1:
            salary = salary * 1.455;
            break;
            case 2:
            case 3:
            //ignorar
            break;
            case 4:
            salary = salary * 1.1;
            break;
            case 5:
            salary = salary * 1.295;
            break;
            case 6:
            case 7:
            salary = salary * 1.75;
            break;
        }
        String salaryString = String.format("%.2f", salary);
        System.out.println(salaryString);
        scan.close();
    }
}