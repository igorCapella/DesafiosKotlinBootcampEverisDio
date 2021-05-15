fun main(args: Array<String>) {
	// Função readLine() utilizada para ler dados de entrada da plataforma do desafio.
    for (i in 1..readLine()!!.toInt()) {
		// Saída de acordo com a lógica proposta no enunciado do desafio.
        println("$i ${ i *  i } ${ i * i * i }") 

    }
}