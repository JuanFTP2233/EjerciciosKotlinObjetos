class libro {
        var titulo = ""
        var autor = ""
        var SBN = ""
        var numeroPaginas = 0
        var disponible = true


        constructor()
        constructor(tituloAutor: String, autor: String, SBN: String, numeroPaginas: Int, disponible: Boolean) {
            this.titulo = tituloAutor
            this.autor = autor
            this.SBN = SBN
            this.numeroPaginas = numeroPaginas
            this.disponible = disponible
        }

        override fun toString(): String {
            return "Main(tituloAutor='$titulo', autor='$autor', SBN=$SBN, numeroPaginas=$numeroPaginas, disponible='$disponible')"
        }

    fun tomarLibro(){

    }

    fun devolverLibro(){

    }

    fun mostarInfoLibro(){

    }

    }