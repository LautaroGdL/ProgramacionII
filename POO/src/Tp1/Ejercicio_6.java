package Tp1;
import java.util.Scanner;

public class Ejercicio_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una calificación (1-10): ");
        int calificacion = scanner.nextInt();

        String resultado;
        if (calificacion >= 1 && calificacion <= 3) {
            resultado = "Insuficiente";
        } else if (calificacion <= 5) {
            resultado = "Regular";
        } else if (calificacion <= 7) {
            resultado = "Bueno";
        } else if (calificacion <= 9) {
            resultado = "Muy Bueno";
        } else if (calificacion == 10) {
            resultado = "Excelente";
        } else {
            resultado = "Calificación inválida";
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }

}
