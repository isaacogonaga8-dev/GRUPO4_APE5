import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SistemaVentas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String archivo = "ventas.txt";
        double totalAcumulado = 0.0;

       
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
            System.out.println("=== Registro de Ventas (Escriba 'fin' en el nombre para terminar) ===");

            while (true) {
                System.out.print("\nIngrese el nombre del producto: ");
                String nombreProducto = scanner.nextLine();

                if (nombreProducto.equalsIgnoreCase("fin")) {
                    break;
                }

                System.out.print("Ingrese el precio: ");
                double precio = Double.parseDouble(scanner.nextLine());

                System.out.print("Ingrese la cantidad vendida: ");
                int cantidad = Integer.parseInt(scanner.nextLine());

                
                double subtotal = precio * cantidad;
                double totalPagar = subtotal;

                // Aplicar descuento del 10% si el subtotal es mayor o igual a $100
                if (subtotal >= 100) {
                    double descuento = subtotal * 0.10;
                    totalPagar = subtotal - descuento;
                    System.out.println("¡Se aplicó un 10% de descuento!");
                }

                
                System.out.printf("Total a pagar por este producto: $%.2f\n", totalPagar);

                
                totalAcumulado += totalPagar;

                
                bw.write("Producto: " + nombreProducto + " | Subtotal: " + subtotal + " | Total Pagado: " + totalPagar);
                bw.newLine();
            }

           
            bw.write("--- TOTAL ACUMULADO DE VENTAS: $" + totalAcumulado + " ---");
            bw.newLine();

            System.out.println("\nRegistro finalizado. Total acumulado guardado en " + archivo);
        } catch (IOException e) {
            System.out.println("Ocurrió un error al procesar el archivo: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
