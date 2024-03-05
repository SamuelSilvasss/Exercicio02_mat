package funcoes

inline fun <T> executarComlog(nomeFuncao: String, funcao: () -> T): T {
    println("Entrando no método $nomeFuncao...")
    try {
        return funcao()
    } finally {
        println("Método $nomeFuncao finalizado...")
    }
}

fun somar2(a: Int, b: Int): Int {
    return a + b
}

fun main(args: Array<String>) {

    val resultado = executarComlog("somar") {
        somar2(4,5)
    }

    println(resultado)
}