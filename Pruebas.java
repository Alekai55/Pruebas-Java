import java.util.Scanner;

public class Pruebas{
    public static void main(String[] args) {
        Scanner pedirnumero = new Scanner(System.in);
        System.out.println("--------Bienvenido al Experimento del Cálculo-------");
        System.out.println("------introduce el primer número------");
        int a = pedirnumero.nextInt();

        System.out.println("----introduce el segundo número----");
        int b = pedirnumero.nextInt();

        System.out.println("--introduce el tercer número--");
        int c = pedirnumero.nextInt();

       int suma = a+b;

       if (suma == c) {
           System.out.println("Los dosh primeros números son iguales al tercero");
       }
       else if (suma != c){
           System.out.println("Los dosh primeros números son distintos al tercero");
       }
    }
}