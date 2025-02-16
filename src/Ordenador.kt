class Ordenador(val tipo: TipoOrdenador = TipoOrdenador.BASICO, nombre: String, precio: Double) : Articulo(nombre, precio) {

    override fun promocionNavidad(descuento: Double) {
        if (precio > 500) {
            precio *= 1 - (descuento / 100)
        }
    }
}