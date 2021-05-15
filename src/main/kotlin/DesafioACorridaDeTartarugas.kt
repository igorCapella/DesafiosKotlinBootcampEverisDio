/* 
Resumo do Desafio 4 de Solucionando Problemas em Kotlin
  . Observar os níveis das tartarugas na tabela apresentada;
  . N1 v < 10cm/h;
  . N2 10cm/h < v < 20cm/h;
  . N3 v >= 20cm/h;
  . Objetivo: Identificar qual tartaruga é a mais veloz.
  - Entrada:. Múltiplos casos de teste;
            . Cada entrada tem duas linhas;
            . linha1) Número de tartarugas -> 1 <= L <= 500 (OBS: L: Int);
            . Linha2) Velocidade de cada tartaruga -> 1 <= Vi <= 50.
  - Saída: . 1 teste tem L tartarugas e v velocidade indicada como a maior;
*/

import java.io.EOFException

fun main(args: Array<String>) {
    
    while (true) {
    
        try {
			// Recebendo o valor de entrada e convertendo para inteiro.
            val l = readLine()!!.toInt()
			// Recebendo o próximo valor de entrada e o quebrando com delimitador " " (espaço em branco).
            val v = readLine()!!.split(" ")
			// Iniviando um array do tipo inteiro.
            var velocidades = IntArray(0)
			
			// Realizando iteração no array v para printar os resultados de acordo com a velocidade.
            v.onEach{ it: String -> velocidades+= it!!.toInt() }
            when (velocidades.max()) {
              in 0..9 -> println("1")
              in 10..19 -> println("2")
              else -> println("3")
            }
    
        } catch (f : NumberFormatException ) {
            break
        } catch (n : NegativeArraySizeException ) {
            break
        } catch (e : NullPointerException ) {
            break
        }
    }
}