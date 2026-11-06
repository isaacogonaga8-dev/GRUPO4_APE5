import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistroEstudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String archivo = "estudiantes.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (int i = 1; i <= 3; i++) {
                System.out.println("--- Estudiante " + i + " ---");
                System.out.print("Ingrese el nombre del estudiante: ");
                String nombre = scanner.nextLine();

                System.out.print("Ingrese su calificación: ");
                String calificacion = scanner.nextLine();

                
                bw.write("Nombre: " + nombre);
                bw.newLine();
                bw.write("Calificación: " + calificacion);
                bw.newLine();
            }
            System.out.println("\nDatos de los estudiantes guardados correctamente en " + archivo);
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
