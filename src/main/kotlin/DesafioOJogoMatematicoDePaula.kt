/* 
Resumo do Desafio 1 de Praticando Programação em Kotlin
	* Lógica do Desafio:
        . Paula inventou um pequeno passatempo: 3 CARACTERES (Exemplo de estrutura desejada: NúmeroLetraNúmero);
        . Condições: 1º. Letra maiúscula subtrai o primeiro dígito do segundo (Estrutura: N1AN2 = N1 - N2);
                     2º. Letra minúscula somar o primeiro com o segundo (Estrutura: N1aN2 = N1 + N2);
                     3º. Dígitos iguais deve-se desconsiderar a letra e multiplicar o primeiro com o segundo (Estrutura: N1aN1 | N1AN1 | N2aN2 | N2AN2 = N1 * N2);
        . Objetivo: Encontrar uma solução, em programação, que tenha como resultado a respectiva lógica de entrada;
    * ENTRADA:
        . Primeira linha: número inteiro que respeita a lógica de Paula;
        . Condição da sequência: 1º. Primeira posição um CARACTERE de 0..9;
                                 2º. Segunda posição uma LETRA (maiúsucla ou minúscula) de 1..26;
                                 3º. Teceira posição um CARACTERE de 0..9.
    * SAÍDA:
        . Para CADA CASO DE TESTE (lista/Array/Mutable) DEVE-SE ter um número inteiro como o primerio elemento;
 */
 
fun main(args: Array<String>) {
    // Recebendo dado de entrada que informa quantidade de casos de teste.
    val N = readLine()!!.toInt()
	// Iterando com a quantidade de casos de teste.
    for (i in 1..N) {
      var dado = readLine().toString()
      var n1 = dado.substring(startIndex=0, endIndex=1).toInt()
      var letra = dado.substring(startIndex=1, endIndex=2)
      var n2 = dado.substring(startIndex=2, endIndex=3).toInt()
      var resultado = 0
      
      if (n1 == n2) {
        resultado = n2.times(n1)
      } else if ( letra.toLowerCase() == letra ) {
        resultado = n2.plus(n1)
      } else {
        resultado = n2.minus(n1)
      }
      println(resultado)
    }
}