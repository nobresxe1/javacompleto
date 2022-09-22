package exerciciopoo.descontosalario;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Employee emp = new Employee();

        System.out.print("Name: ");
        emp.name = sc.next();
        System.out.print("Gross salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();


        System.out.println("Employee: " + emp);
        System.out.println();
        System.out.println("Which percentage to increase salary? ");
        double percetage = sc.nextDouble();
        emp.increaseSalary(percetage);


        System.out.println( );
        System.out.println("Update data: " + emp);
        sc.close();
    }
}
