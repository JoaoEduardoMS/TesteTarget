fun main() {

    val numero = 4

    var a = 0
    var b = 1

    if (numero == a || numero == b) {
        println("O número $numero pertence à sequência de Fibonacci.")
        return
    }

    while (b < numero) {
        val proximoNumero = a + b
        a = b
        b = proximoNumero
    }

    if (b == numero) {
        println("O número $numero pertence à sequência de Fibonacci.")
    } else {
        println("O número $numero não pertence à sequência de Fibonacci.")
    }
}