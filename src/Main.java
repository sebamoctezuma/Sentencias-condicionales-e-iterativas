import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numeroUno = scanner.nextInt();
        System.out.println("Ingrese un segundo numero: ");
        int numeroDos = scanner.nextInt();
        if (numeroUno < numeroDos) {
            System.out.println("El numero " + numeroDos + " es mayor entre los ingresados");

        } else if (numeroUno > numeroDos) {
            System.out.println("El numero " + numeroUno + " es mayor entre los ingresados");

        } else {
            System.out.println("Ambos numeros son iguales");
        }
    }
}