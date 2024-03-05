package exercicios

import kotlin.math.sqrt

fun AreaIsoceles(): Double {

    println("Digite a base do triângulo:")
    var base = readLine()?.toDouble() ?: 0.0

    println("Digite a altura do triângulo:")
    var altura = readLine()?.toDouble() ?: 0.0

    return (base * altura) / 2
}

fun main() {
    var area = AreaIsoceles()
    println("A área do triângulo isóceles é: $area")
}
