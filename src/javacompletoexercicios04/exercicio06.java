package javacompletoexercicios04;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int multi = 1;


        for (int i = N; i > 0; i--) {
            multi = multi * i;

        }
        System.out.println(multi);
    }
}
