import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistroProductos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String archivo = "productos.txt";

        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();

            System.out.print("Ingrese la cantidad disponible: ");
            int cantidad = scanner.nextInt();

            
            double valorTotal = precio * cantidad;

            
            bw.write("Producto: " + nombre + " | Precio: " + precio + " | Cantidad: " + cantidad + " | Valor Total: " + valorTotal);
            bw.newLine();

            System.out.println("Producto registrado exitosamente en " + archivo);
        } catch (IOException e) {
            System.out.println("Ocurrió un error al registrar el producto: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
