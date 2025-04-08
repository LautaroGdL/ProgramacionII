package Tp2;
import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] temperaturas = new double[4][7];
        double sumaMensual = 0;
        double maxTemp = Double.MIN_VALUE;
        double minTemp = Double.MAX_VALUE;
        int semanaMax = 0, diaMax = 0, semanaMin = 0, diaMin = 0;

        // Cargar temperaturas
        for (int semana = 0; semana < 4; semana++) {
            System.out.println("Semana " + (semana + 1) + ":");
            for (int dia = 0; dia < 7; dia++) {
                System.out.print("  Día " + (dia + 1) + ": ");
                temperaturas[semana][dia] = sc.nextDouble();
                sumaMensual += temperaturas[semana][dia];

                if (temperaturas[semana][dia] > maxTemp) {
                    maxTemp = temperaturas[semana][dia];
                    semanaMax = semana;
                    diaMax = dia;
                }
                if (temperaturas[semana][dia] < minTemp) {
                    minTemp = temperaturas[semana][dia];
                    semanaMin = semana;
                    diaMin = dia;
                }
            }
        }

        // Promedio semanal
        System.out.println("\nPromedios semanales:");
        for (int semana = 0; semana < 4; semana++) {
            double sumaSemana = 0;
            for (int dia = 0; dia < 7; dia++) {
                sumaSemana += temperaturas[semana][dia];
            }
            System.out.printf("Semana %d: %.2f\n", semana + 1, sumaSemana / 7);
        }

        // Promedio mensual
        System.out.printf("\nTemperatura media mensual: %.2f\n", sumaMensual / 28);
        System.out.printf("Día más caluroso: Semana %d, Día %d con %.2f°C\n", semanaMax + 1, diaMax + 1, maxTemp);
        System.out.printf("Día más frío: Semana %d, Día %d con %.2f°C\n", semanaMin + 1, diaMin + 1, minTemp);

        sc.close();
    }

}
