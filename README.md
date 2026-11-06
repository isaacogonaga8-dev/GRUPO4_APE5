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


Ejercicio 4. Registro de estudiantes y calificaciones Enunciado: Desarrollar un programa en Java que permita registrar los datos de 3 estudiantes y guardar la información en un archivo llamado estudiantes.txt.
El programa debe:
Solicitar el nombre del estudiante.
Solicitar su calificación.
Guarde ambos datos en el archivo.
Cada estudiante debe ocupar dos líneas.
Utilizar Scanner, BufferedWriter y FileWriter.
Cerrar correctamente el archivo.

Ejercicio 5. Registro de productos con modo AppendNivel intermedio 2
Enunciado: Desarrollar un programa que permita registrar productos en un archivo llamado productos.txt.
El programa debe:
Solicitar el nombre del producto.
Solicitar su precio.
Solicitar la cantidad disponible.
Calcula el valor total del producto (precio * cantidad).
Guarde los resultados en el archivo.
Permitir registrar nuevos productos sin borrar los registros anteriores.
Utilizar BufferedWriter y modo append.

Ejercicio 6. Sistema de registro de ventas Nivel intermedio 3
Enunciado: Desarrollar un programa en Java que permita registrar las ventas de una tienda y guardar la información en un archivo llamado ventas.txt.
El programa debe:
Solicitar el nombre del producto.
Solicitar el precio y la cantidad vendida.
Calcular el subtotal de cada venta.
Si el subtotal es mayor o igual a $100, se aplicará un descuento del 10%.
Mostrar el total a pagar.
Permitir registrar varios productos hasta que el usuario escriba fin.
Guarde cada venta en el archivo sin eliminar los registros anteriores.
Al finalizar, guardar el total acumulado de las ventas realizadas.


Ejercicio 7: Exploración y Gestión de Metadatos con File
Basándote en los conceptos de rutas y abstracción de la sesión, escribe un programa en Java que utilice la clase File (perteneciente al paquete java.io) para interactuar con la ruta "datos/prueba.txt". Tu solución debe cumplir estrictamente con lo siguiente:
1. Comprobación previa: Utiliza el método adecuado (exists()) para verificar si la ruta apunta a un recurso disponible en el disco.
2. Creación controlada: Si el recurso no existe, intenta crearlo mediante el método correspondiente (createNewFile()). Como esta operación puede producir un error de E/S, debes gestionarlo obligatoriamente manejando la excepción IOException (mediante un bloque try-catch).
3. Extracción de información: Tanto si el archivo ya existía como si se acaba de crear, utiliza los métodos de consulta para mostrar por consola el último nombre de la ruta (getName()) y la ruta completa o relativa con la que se construyó el objeto (getPath()).

Ejercicio 8: Escritura Estructurada por Líneas con BufferedWriter
Tomando como referencia el flujo de datos desde la memoria RAM hasta el archivo en disco, desarrolla un programa en Java que cree un fichero de texto llamado "materias.txt". El programa debe realizar las siguientes acciones:
1. Configurar un flujo de salida utilizando un objeto BufferedWriter enlazado con un FileWriter.
2. Escribir un listado de cinco asignaturas de tu elección en el archivo.
3. Emplear el método portable newLine() para asegurar que cada asignatura quede guardada estrictamente en una línea independiente.
4. Liberar los recursos de forma correcta invocando el método de cierre (close()) y controlar cualquier error potencial de escritura mediante una excepción de tipo IOException.
5. Verificación: Comprueba físicamente en la carpeta de tu proyecto que el archivo se generó correctamente y que mantiene una única asignatura por línea.

Ejercicio 9: Control del Modo de Apertura (Append vs Sobrescribir)
A partir del archivo "materias.txt" generado en el ejercicio anterior, escribe un nuevo programa en Java que demuestre el comportamiento del segundo parámetro en el constructor de FileWriter:
1. Diseña el código de manera que abra el fichero existente configurando el FileWriter en modo de adición (append = true).
2. Añade dos nuevas asignaturas al final del archivo utilizando nuevamente newLine() para no romper el formato de líneas.
3. Asegúrate de cerrar el flujo con .close().
4. Comprobación: Verifica que el contenido previo no se haya sobrescribido y que ahora el archivo conserve las cinco asignaturas originales junto con las dos nuevas incorporadas al final.

Ejercicio 10: Ciclo de Vida Completo y Borrado Seguro
Diseña un script completo en Java que emule el recorrido guiado de gestión de ficheros visto en clase:
1. Construye un objeto File que represente la ruta "datos/temporal.txt".
2. Consulta el estado del archivo mediante exists() y, si no se encuentra disponible, créalo de forma segura controlando la excepción IOException.
3. Implementa una fase de validación en la que declares una variable de control booleana (por ejemplo, boolean confirmarBorrado = true;) para simular la solicitud de confirmación por parte del usuario antes de eliminar datos importantes.
4. Utiliza el método delete() exclusivamente si dicha confirmación es verdadera, imprimiendo por consola un mensaje que refleje el resultado booleano de la operación de eliminación.
