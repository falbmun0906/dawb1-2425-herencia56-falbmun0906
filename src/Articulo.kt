open class Articulo(var nombre: String, var precio: Double) {

    private var id = 0

    companion object {
        var totalArticulos: Int = 1
    }

    init {
        id = generarId()
    }

    fun generarId(): Int {
        return totalArticulos++
    }

    open fun promocionNavidad(descuento: Double) {
        precio *= 1 - (descuento / 100)
    }

    override fun toString(): String {
        return "${nombre} - ${"%.2f".format(precio)}€ (ID: ${id})"
    }

}