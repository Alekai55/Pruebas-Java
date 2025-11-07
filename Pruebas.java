import java.util.Scanner;


public class Pruebas{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

       while (opcion !=4){
           System.out.println("--Bienvenido al Experimento Cálculo de Divisas--");
           System.out.println("Introduce una cantidad");
           double numero = sc.nextDouble();

           System.out.println("1.Convertir a Dólares");
           System.out.println("2.Convertir a Libras esterlinas");
           System.out.println("3.Convertir a Yenes");
           System.out.println("4.Salir del programa");

           opcion = sc.nextInt();

           if (opcion == 1) {
               double conversion = (numero * 1.15);
               //con el %.2f lo que haces es limitar el número de decimales y así java lee la variable que pongas después
               //de la coma para cambiarle a ese formato
               System.out.printf("Son %.2f $ ", conversion);
           }
           if (opcion == 2) {
               double conversion = (numero * 0.88);
               System.out.printf("Son %.2f £ ", conversion);
           }
           if (opcion == 3) {
               double conversion = (numero * 177);
               System.out.printf("Son %.2f ¥ ", conversion);
           }
           else {
               System.out.println("Saliendo del programa");
           }
       } sc.close();
    }
}
