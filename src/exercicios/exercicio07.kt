package exercicios
import kotlin.math.sqrt

fun AreaTrapezio(): Double {

    println("Digite a base maior do trapézio:")
    var baseM = readLine()?.toDouble() ?: 0.0

    println("Digite a base menor do trapézio:")
    var basem = readLine()?.toDouble() ?: 0.0

    println("Digite a altura do trapézio:")
    var altura = readLine()?.toDouble() ?: 0.0


    return (baseM + basem) * altura / 2
}

fun main() {
    var area = AreaTrapezio()
    println("A área do Trapézio é: $area")
}