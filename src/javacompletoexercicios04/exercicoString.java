package javacompletoexercicios04;

public class exercicoString {

    public static void main(String[] args) {


        String texto = "asdf  ASDF DhDh Asddf aifjDD";
        String text = "manga banana abacaxi melancia";


        String[] vect = text.split(" ");
        System.out.println(vect);



        String t1 = texto.toLowerCase();
        String t2 = texto.toUpperCase();
        String t3 = texto.trim();
        String t4 = texto.substring(3);
        String t5 = texto.substring(2, 8);
        String t6 = texto.replace('s', 'q');
        int t7 = texto.indexOf("as");
        int t8 = texto.lastIndexOf("As");


        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        System.out.println(t6);
        System.out.println(t7);
        System.out.println(t8);

    }


}
