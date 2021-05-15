// Desagio de listar nímeros ímpares do 1 até o valor de entrada.
fun main(args: Array<String>) {
    // Função readLine() lê os valores de entrada no desafio.
    for (i in   1.rangeTo(readLine()!!.toInt()).step( 2 )) println(i)
}