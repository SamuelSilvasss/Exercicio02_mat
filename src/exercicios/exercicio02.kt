package exercicios

import kotlin.math.sqrt

fun AreaTriangulo(): Double {
    println("Digite o tamanho do lado do triângulo:")
    var lado = readLine()?.toDouble() ?: 0.0

    return (lado * lado * sqrt(3.0) / 4)
}

fun main() {
    var area = AreaTriangulo()
    println("A área do triângulo equilátero é: $area")
}
