fun main() {
    var soma = 0.0
    var QtdPositivos = 0
    var QtdNegativos = 0
    var QtdTotal = 0

    while (true) {
        print(" Digite um valor ( ou digite 0 para sair): ")
        val valor = readLine()!!.toDouble()
        if (valor == 0.0) {
            break
        }
        soma +=valor
        QtdTotal++
        if (valor > 0) {
            QtdPositivos++
        }else{
            QtdNegativos++
        }
    }
    val media = soma / QtdTotal
    val percentualPositivos = QtdPositivos*100.0 / QtdTotal
    val percentualNegativos = QtdNegativos*100.0 / QtdTotal

    println(" Média aritmética: $media")
    println(" Quantidade de valores positivos: $QtdPositivos")
    println(" Quantidades de valores negativos: $QtdNegativos")
    println(" Percentual de valores positivos: $percentualPositivos%")
    println(" Percentual de valores negativos: $percentualNegativos%")
}