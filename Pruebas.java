import java.util.Scanner;

public class Pruebas {
    public static void main(String[] args) {
        System.out.println("----Bienvenido al experimento del Cálculo 2----");
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número");
        int a = sc.nextInt();
        System.out.println("Introduce el segundo número");
        int b = sc.nextInt();

        //La fórmula para decir si algo es par es %2==0, y para saber si es impar es %2!=0
        if (a % 2 == 0 && b % 2 == 0) {
            System.out.println("Son pares");
        }
        if (a > (2 * b) && a < 8){
            System.out.println("El número " + a + " es más grande que el doble de " + b + " y menor que 8");
        }
        else {
            System.out.println(" No coinciden");
        }
        if (a == b || (a - b) < 0)
        {
            System.out.println(a + " es igual que " + b + " o la resta de ambos es menor que 0");
        }
        else{
            System.out.println(" No coinciden");
        }
    }
}
