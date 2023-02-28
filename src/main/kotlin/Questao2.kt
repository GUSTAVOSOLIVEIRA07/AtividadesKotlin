fun main(Args: Array<String>) {
    val alturas = arrayListOf<Double>()
    var maior = Double.MIN_VALUE
    var menor = Double.MAX_VALUE

    for (i in 1 .. 5) {
        val altura = readLine()?.toDouble()
        altura?.let {
            if (altura > maior) {
                maior = altura
            }
            if (altura < menor) {
                menor = altura
            }
            alturas.add(it)
        } ?: run { alturas.add(1.8) }
    }
    println(" A maior altura é ${alturas.max()}")
    println(" A menor altura é ${alturas.min()}")
}