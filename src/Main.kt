fun main() {
    val articulo1: Articulo = Articulo("Artículo1", 25.0)
    val articulo2: Articulo = Articulo("Artículo2", 45.0)
    val ordenador1: Ordenador = Ordenador(TipoOrdenador.GAMING, "Ordenador gaming", 1299.99)
    val ordenador2: Ordenador = Ordenador(TipoOrdenador.BASICO, "Ordenador básico", 399.99)

    val articulos: MutableList<Articulo> = mutableListOf()
    articulos.add(articulo1)
    articulos.add(articulo2)
    articulos.add(ordenador1)
    articulos.add(ordenador2)

    for (articulo in articulos) {
        val precioOriginal = articulo.precio
        articulo.promocionNavidad(25.0)
        println("$articulo (Precio original: $precioOriginal€)")
    }

}