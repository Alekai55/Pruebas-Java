import java.util.Scanner;


public class Pruebas{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       while (true) {
           System.out.println("--Bienvenido al Experimento Cálculo de Divisas--");
           System.out.println("Introduce una cantidad");
           double numero = sc.nextDouble();

           System.out.println("1.Convertir a Dólares");
           System.out.println("2.Convertir a Libras esterlinas");
           System.out.println("3.Convertir a Yenes");

           int opcion = sc.nextInt();
           if (opcion == 1) {
               double conversion = (numero * 1.15);
               //con el %.2f lo que haces es limitar el número de decimales y así java lee la variable que pongas después
               //de la coma para cambiarle a ese formato
               System.out.printf("Son %.2f $", conversion);
               continue;
           }
           if (opcion == 2) {
               double conversion = (numero * 0.88);
               System.out.printf("Son %.2f £", conversion);
               continue;
           }
           if (opcion == 3) {
               double conversion = (numero * 177);
               System.out.printf("Son %.2f ¥", conversion);
               continue;
           }
           else {
               System.out.println("Saliendo del programa");
               break;
           }
       }
    }
}
