import java.util.Scanner

// Realizar uma soma Simples.
fun main(args: Array<String>) {
	// Preenchendo input  com a função que busca dados de entrada da tarefa.
    val input = Scanner(System.`in`)
	
	// Dados Entrada 1.
    val a = input.nextInt()
	
	// Dados de Entrada 2.
    val b = input.nextInt()

	// Realizando a soma e apresentando o resultado no console.
    println("SOMA = " + (a + b))
}