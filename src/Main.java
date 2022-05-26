import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre del Alumno");
        String nonbreAlumno = scanner.nextLine();
        System.out.println("Primer Nota:");
        int nota1 = scanner.nextInt();
        System.out.println("Segunda Nota:");
        int nota2 = scanner.nextInt();
        System.out.println("Tercer Nota:");
        int nota3 = scanner.nextInt();

        float promedioNotas = (nota1 + nota2 + nota3) / 3;
        String estado = "";
        if (promedioNotas >= 1 && promedioNotas < 6){
            estado  = "Desaprobado";
        } else if (promedioNotas >= 6 && promedioNotas < 9) {
            estado = "Aprobado";
        } else if (promedioNotas >= 9 && promedioNotas <= 10) {
            estado = "Promocionado";
        }
        System.out.println(""
                + "Nombre del Alumno: " + nonbreAlumno + "\n"
                + "Promedio: " + promedioNotas + "\n"
                + "Estado: " + estado + "\n");
    }
}