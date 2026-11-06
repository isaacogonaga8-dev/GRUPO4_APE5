import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio8 {
    public static void main(String[] args) {
        String[] materias = {
            "Programación Orientada a Objetos",
            "Estructuras de Datos",
            "Bases de Datos I",
            "Sistemas Operativos",
            "Ingeniería de Software I"
        };

       
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("materias.txt"))) {
            for (String materia : materias) {
                
                writer.write(materia);
                
                writer.newLine();
            }
            System.out.println("El archivo 'materias.txt' ha sido escrito exitosamente con las 5 asignaturas.");
        } catch (IOException e) {
            System.err.println("Error de E/S durante la escritura del archivo: " + e.getMessage());
        }
    }
}
