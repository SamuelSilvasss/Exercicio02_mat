package exercicios

import kotlin.math.sqrt

fun AreaCincuferencia(): Double {

    println("Digite o raio do cincuferência:")
    var raio = readLine()?.toDouble() ?: 0.0

    return (Math.PI * raio * raio)
}

fun main() {
    var area = AreaCincuferencia()
    println("A área da cincuferência é: $area")
}
