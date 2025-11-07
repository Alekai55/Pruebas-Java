import java.util.Scanner;

public class Pruebas{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----Bienvenido al Experimento de Palabras----");
        System.out.println("--introduce una palabra--");
        String palabra = sc.nextLine();

        int longitud = palabra.length();
        System.out.println("tu palabra tiene "+longitud+" letras");

        if (palabra.length()<4){
            System.out.println(palabra.toUpperCase());
        }
        else  {
            System.out.println(palabra.toLowerCase());
        }
    }
}