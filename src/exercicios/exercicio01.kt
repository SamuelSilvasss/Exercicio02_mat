package exercicios

fun AreaRetangulo(): Int {
    println("Digite a base do retângulo:")
    var comprimento = readLine()?.toInt() ?: 0

    println("Digite a altura do retângulo:")
    var largura = readLine()?.toInt() ?: 0

    return comprimento * largura
}

fun main() {
    var area = AreaRetangulo()

    println("A área do retângulo é: $area")
}
