package exerciciopoo.calculeretangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Rectangle rect = new Rectangle();

        System.out.println("Enter rectangle width and height: ");

        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();

        System.out.printf("Area: %.2f%n", rect.area());
        System.out.printf("Perimeter: %.2f%n", rect.perimeter());
        System.out.printf("Diagonal: %.2f%n", rect.diagonal());

    }
}
