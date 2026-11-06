import java.io.File;
import java.io.IOException;

public class Ejercicio7 {
    public static void main(String[] args) {
        File archivo = new File("datos/prueba.txt");

        
        File directorio = archivo.getParentFile();
        if (directorio != null && !directorio.exists()) {
            directorio.mkdirs();
        }

        try {
            
            if (archivo.exists()) {
                System.out.println("El archivo ya existe en el disco.");
            } else {
                
                boolean creado = archivo.createNewFile();
                if (creado) {
                    System.out.println("El archivo se ha creado correctamente.");
                } else {
                    System.out.println("No se pudo crear el archivo.");
                }
            }

            
            System.out.println("--- Metadatos del Archivo ---");
            System.out.println("Nombre del archivo (getName): " + archivo.getName());
            System.out.println("Ruta del archivo (getPath): " + archivo.getPath());

        } catch (IOException e) {
            System.err.println("Error de E/S al intentar crear el archivo: " + e.getMessage());
        }
    }
}
