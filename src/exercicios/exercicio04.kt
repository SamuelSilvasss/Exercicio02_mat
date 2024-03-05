package exercicios

import kotlin.math.sqrt

fun AreaEscaleno(): Double {

    println("Digite a base do triângulo:")
    var base = readLine()?.toDouble() ?: 0.0

    println("Digite a altura do triângulo:")
    var altura = readLine()?.toDouble() ?: 0.0

    return (base * altura) / 2
}

fun main() {
    var area = AreaEscaleno()
    println("A área do triângulo escaleno é: $area")
}
