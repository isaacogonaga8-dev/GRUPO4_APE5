import java.io.File;
import java.io.IOException;

public class Ejercicio10 {
    public static void main(String[] args) {
        
        File archivoTemporal = new File("datos/temporal.txt");

        
        File directorio = archivoTemporal.getParentFile();
        if (directorio != null && !directorio.exists()) {
            directorio.mkdirs();
        }

        try {
            
            if (!archivoTemporal.exists()) {
                boolean creado = archivoTemporal.createNewFile();
                if (creado) {
                    System.out.println("Archivo temporal creado exitosamente en: " + archivoTemporal.getPath());
                }
            } else {
                System.out.println("El archivo temporal ya se encontraba disponible.");
            }

            
            boolean confirmarBorrado = true; 
           
            if (confirmarBorrado) {
                boolean eliminado = archivoTemporal.delete();
                System.out.println("Resultado booleano de la operación de eliminación (delete): " + eliminado);
            } else {
                System.out.println("Operación de borrado cancelada.");
            }

        } catch (IOException e) {
            System.err.println("Error de E/S al gestionar el ciclo de vida del archivo: " + e.getMessage());
        }
    }
}
