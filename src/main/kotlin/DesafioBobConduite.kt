/*
Resumo do Desafio 3 de Praticando Programação em Kotlin
	* Dados do Desafio:
       1º Cabo: raio = R1 (Dim1 = 2R1);
       2º Cabo: raio = R2 (Dim2 = 2R2);
       1º Espaço à esquerda = E;
       2º Espaço no meio = M;
       3º Espaço à direita = D;
       Conduite (Cabo Total MAX): 2*R1 + 2*R2 + E + M + D.
   * Lógica do Desafio:
       . O Conduite precisa estar no seu MENOR RAIO, com o objetivo de caber os dois cabos no seu interior no "máximo";
       . Obs.: Devemos manter o tamanho do raio de cada cabo, o que reduzira são os espaços da esquerda, meio e direita;
   * Entrada:
       . Número de casos de testes = T, estará na primeira linha;
       . O número de casos de testes deve assumir a regra (T<=10000);
       . Os números serão inteiros e positivos;
       . Os números caberão em um inteiro normal de 32 bits;
    * Saída: Impressão dos valores possíveis para o R1 e R2
 */

fun main() {
    val qtdEntrada = readLine()!!.toInt()
    
    for (i in 1..qtdEntrada) {
      val raios = readLine()!!.split(" ").map { it.toInt() }
      val resultado = raios[0].plus(raios[1])
      println(resultado)
    }

}