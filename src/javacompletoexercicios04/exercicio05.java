package javacompletoexercicios04;

import java.security.Principal;
import java.util.Scanner;

// fazer um programa que le 3 numeros inteiros,
// e mostra na tela o maior deles.
public class exercicio05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three number: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("Higher: " + a);
        } else if (a < b && b > c) {
            System.out.println("Higher: " + b);
        } else {
            System.out.println("Higher: " + c);

        }


        sc.close();
    }
}
