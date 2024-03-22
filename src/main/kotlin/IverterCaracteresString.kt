fun main() {
val str = "Olá, mundo!"

var strInvertida = ""

for (i in str.length - 1 downTo 0) {
    strInvertida += str[i]
}

println(strInvertida)
}