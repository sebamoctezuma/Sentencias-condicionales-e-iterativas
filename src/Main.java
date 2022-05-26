import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        //Nombre producto
        System.out.println("Ingrese Nombre del Producto: ");
        String nombreProducto = scanner.nextLine();

        //Precio producto
        System.out.println("Ingrese Precio de Producto: ");
        float precioProducto = scanner.nextFloat();
        DecimalFormat df = new DecimalFormat ("0.00");

        do{
            System.out.println("\nSeleccione un método de pago: >\n"
                    + "1. Contado (15% de descuento)\n"
                    + "2. Débito (Mismo precio)\n"
                    + "3. Tarjeta (10% de recargo)\n");

            int metodoPago = scanner.nextInt();
            switch (metodoPago){
                case 1:{
                    float contado = precioProducto - ((precioProducto * 15) / 100);
                    System.out.println("*"
                    + " Precio de contado (15% Desc) "
                    + "*\n\n"
                    + "Nombre del producto: " + nombreProducto + "\n"
                    + "Precio final: $" + contado
                    );
                    flag = false;
                    break;
                }
                case 2:{
                    System.out.println("*"
                            + " Precio con débito "
                            + "*\n\n"
                            + " Nombre del producto: " + nombreProducto + "\n"
                            + " Precio final: $" + precioProducto
                    );
                    flag = false;
                    break;
                }

                case 3:{
                    float tarjeta = precioProducto + ((precioProducto * 10) / 100);
                    System.out.println("*"
                            + " Precio con tarjeta (10% Rec) "
                            + "*\n\n"
                            + " Nombre del producto: " + nombreProducto + "\n"
                            + " Precio final: $" + tarjeta
                    );
                    flag = false;
                    break;

                }

                default:{
                    System.out.println("La opción seleccionada no es válida.\n Ingrese nuevamente.");
                    break;
                }
            }
        }while(flag!=false);
            }
        }



