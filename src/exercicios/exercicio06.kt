package exercicios

import kotlin.math.sqrt

fun AreaLosango(): Double {

    println("Digite a diagonal maior do Losango:")
    var diagonalM = readLine()?.toDouble() ?: 0.0

    println("Digite a diagonal menor do Losango:")
    var diagonalm = readLine()?.toDouble() ?: 0.0

    return (diagonalM * diagonalm) / 2
}

fun main() {
    var area = AreaLosango()
    println("A área do Losango é: $area")
}