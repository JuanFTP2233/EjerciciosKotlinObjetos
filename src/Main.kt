
fun main(){
 val listaLibros = mutableListOf<libro>()
    val libro1 = libro("El jardín de los secretos", "Laura Gallego", "9788408181234", 320 , true )
    val libro2 = libro("Cien años de soledad", "Gabriel García Márquez", "9780307474728", 417, true)
    val libro3 = libro("1984", "George Orwell", "9780451524935", 328, true)

    listaLibros.add(libro1)
    listaLibros.add(libro2)
    listaLibros.add(libro3)

    println(listaLibros)
    listaLibros.forEach{ lib ->
        println(lib)

    }
}