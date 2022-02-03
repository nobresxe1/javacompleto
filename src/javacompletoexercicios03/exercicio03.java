package javacompletoexercicios03;

import java.util.Locale;
import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Escolha o combustível de sua preferencia: ");
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int fuel = sc.nextInt();

        while (fuel != 4) {
            if (fuel == 1) {
                alcool = alcool + 1;
            }
            else if (fuel == 2) {
                gasolina = gasolina + 1;
            }
            else if (fuel == 3) {
                diesel = diesel + 1;
            }

            fuel = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
