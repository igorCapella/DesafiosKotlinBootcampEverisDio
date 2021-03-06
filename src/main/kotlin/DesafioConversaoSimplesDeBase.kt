/*
Resumo do Desafio 2 de Praticando Programação em Kotlin
	* Lógica do Desafio:
        . Objetivo: Escrever um simples programa de conversão de base (Lembrar do Hexadecimal e Decimal - Tem artigo na DIO);
        . A entrada será um valor hexadecimal ou decimal;
        . Condições: 1º. Se a entrada for um número hexadecimal, converta-a para Decimal;
                     2º. Se a entrada for um número decimal, converta-a para Hexadecimal;
        . Característica de cada entrada: 1º. Se o valor de entrada for um número Hexadecimal: o valor inicia com 0x;
                                          2º. Se o valor de entrada for um número Hexadecima: o valor TAMBÉM poderá ter na segunda casa a letra x;
        * ENTRADA:
                 . A entrada contem VÁRIOS casos teste;
                 . Primeiras linhas possuem: número não-negativo, decimal ou Hexadecimal;
                 . Condição para valores decimais: decimal <= 2^31;
                 . Condição para a última linha: 1º. Ser um número negativo;
                                                 2º. Encerrar o programa;
        * SAÍDA:
                . Cada linha de entrada contém uma linha de saída;
                . O número de entrada sendo um valor Hexadecimal deve ser precedido, na saída, com 0x (Exemplo: Entrada 4 e saída 0x4.
 */

fun main() {
    val hexadecimal = """0[a-zA-Z].*""".toRegex()
    val decimal = """[a-zA-Z].*""".toRegex()
    val totalList = mutableListOf<String>()
    var value = true

    while(value) {
       
        val read = readLine()!!.toString()
  
        if (!read.contains(hexadecimal) && read.toInt() > 0 && read.toInt() < Integer.MAX_VALUE) {
          val n = read.toInt()
          val decimal = Integer.toHexString(n).toUpperCase()
          val decimalC = "0x$decimal"
          totalList.add(decimalC)
        }

        if(read == "-1"){
          value = false
        }

        if (read.contains(hexadecimal) && read.contains(decimal)) {
          val remove = read.removeRange(0,2)
          val result:Int = remove.toInt(16)
            totalList.add(result.toString())
        }
    }
    for (i in totalList) {
      println(i)
    }
}