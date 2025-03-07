class Libro {
    var titulo = ""
    var autor = ""
    var SBN = ""
    var numeroPaginas = 0
    var disponible = true

    constructor()
    constructor(titulo: String, autor: String, SBN: String, numeroPaginas: Int, disponible: Boolean) {
        this.titulo = titulo
        this.autor = autor
        this.SBN = SBN
        this.numeroPaginas = numeroPaginas
        this.disponible = disponible
    }

    override fun toString(): String {
        return "Libro(titulo='$titulo', autor='$autor', SBN='$SBN', numeroPaginas=$numeroPaginas, disponible=$disponible)"
    }

    fun tomarLibro() {
        if (disponible) {
            disponible = false
            println("El libro '$titulo' ha sido retirado.")
        } else {
            println("El libro '$titulo' no está disponible.")
        }
    }

    fun devolverLibro() {
        if (!disponible) {
            disponible = true
            println("El libro '$titulo' ha sido devuelto.")
        } else {
            println("El libro '$titulo' ya está disponible.")
        }
    }

    fun mostrarInfoLibro() {
        println(this)
    }
}