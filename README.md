Ejercicios APE 

Ejercicio 1. Crear un fichero en JavaEnunciado: Desarrollar un programa en Java que permita crear un archivo de texto llamado curso.txt.   
Indicaciones:Importar las clases necesarias para trabajar con archivos.
Crear un objeto de tipo File. 
Utilizar el método createNewFile() para crear el archivo.
Comprobar si el archivo se creó correctamente o si ya existe.   
Mostrar el nombre del archivo utilizando getName().   
Utilizar try-catch para controlar posibles errores.   
Clases y métodos sugeridos: File, IOException, createNewFile(), getName()   

Ejercicio 2. Escribir información en un ficheroEnunciado: Desarrollar un programa en Java que permita ingresar un mensaje por teclado y almacenarlo en un archivo de texto existente llamado estudiantes.txt.  
Indicaciones:Importar las clases necesarias.  
Crear un objeto Scanner para ingresar información por teclado.   
Solicitar al usuario que escriba un mensaje.  
Utilizar FileWriter para abrir el archivo estudiantes.txt.  
Utilizar el parámetro true para conservar la información anterior y agregar el nuevo mensaje al final.   
Utilizar el método write() para guardar el mensaje.  
Cerrar el archivo utilizando close().   
Mostrar un mensaje indicando que la información se guardó correctamente.   
Controlar posibles errores mediante try-catch.  
Clases y métodos sugeridos: Scanner, FileWriter, IOException, write(), close()   
Nota: El archivo estudiantes.txt debe existir previamente.   

Ejercicio 3. Eliminar un fichero en Java   Enunciado: Desarrollar un programa en Java que permita eliminar el archivo de texto estudiantes.txt.   Indicaciones:Importar la clase necesaria para trabajar con archivos.   
Crear un objeto de tipo File indicando el nombre del archivo que se desea eliminar.   
Utilizar el método delete() para intentar eliminar el archivo.   
Comprobar si la eliminación se realizó correctamente.   
Si el archivo se eliminó, mostrar un mensaje de confirmación.  
Si no se pudo eliminar, mostrar un mensaje indicando el problema.  
Clases y métodos sugeridos: File, delete(), if-else, System.out.println()   
