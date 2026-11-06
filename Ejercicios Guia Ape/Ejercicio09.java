import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args) {
        String[] nuevasMaterias = {
            "Redes de Computadoras",
            "Arquitectura de Software"
        };

        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("materias.txt", true))) {
            for (String materia : nuevasMaterias) {
                writer.newLine(); 
                writer.write(materia);
            }
            System.out.println("Se han añadido dos nuevas asignaturas conservando el contenido previo.");
        } catch (IOException e) {
            System.err.println("Error de E/S al modificar el archivo: " + e.getMessage());
        }
    }
}
