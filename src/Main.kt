fun main() {
   val listaLibros = mutableListOf<Libro>()
   val libro1 = Libro("El jardín de los secretos", "Laura Gallego", "9788408181234", 320, true)
   val libro2 = Libro("Cien años de soledad", "Gabriel García Márquez", "9780307474728", 417, true)
   val libro3 = Libro("1984", "George Orwell", "9780451524935", 328, true)

   listaLibros.add(libro1)
   listaLibros.add(libro2)
   listaLibros.add(libro3)

   while (true) {
      println("\n--- Menú de Libros ---")
      println("1. Mostrar todos los libros")
      println("2. Tomar un libro")
      println("3. Devolver un libro")
      println("4. Mostrar información de un libro")
      println("5. Salir")
      print("Seleccione una opción: ")

      when (readLine()?.toIntOrNull()) {
         1 -> {
            println("\nLista de libros:")
            listaLibros.forEach { libro ->
               println(libro)
            }
         }
         2 -> {
            print("Ingrese el título del libro que desea tomar: ")
            val titulo = readLine() ?: ""
            val libro = listaLibros.find { it.titulo == titulo }
            if (libro != null) {
               libro.tomarLibro()
            } else {
               println("Libro no encontrado.")
            }
         }
         3 -> {
            print("Ingrese el título del libro que desea devolver: ")
            val titulo = readLine() ?: ""
            val libro = listaLibros.find { it.titulo == titulo }
            if (libro != null) {
               libro.devolverLibro()
            } else {
               println("Libro no encontrado.")
            }
         }
         4 -> {
            print("Ingrese el título del libro que desea ver: ")
            val titulo = readLine() ?: ""
            val libro = listaLibros.find { it.titulo == titulo }
            if (libro != null) {
               libro.mostrarInfoLibro()
            } else {
               println("Libro no encontrado.")
            }
         }
         5 -> {
            println("Saliendo del programa...")
            return
         }
         else -> {
            println("Opción no válida. Intente de nuevo.")
         }
      }
   }
}