/*
Resumo do Desafio 3 de Solucionando Problemas em Kotlin
  . Número Primo é aque dividido por 1 e por ele mesmo (Ex: 11);
  . Fazer um programa que aceite DIVERSOS VALORES (entrada "readLine()") e diga se cada um deles é PRIMO ou NÃO (use controle de fluco- if, when, while);
  . Ocorrência de conta, em um segundo;
  . Entrada: números (X) de casos de teste 1 <= Número Int <= 200;
  . Seguindo as linhas (N) 1 < N < 231 e as duas condições, é um PRIMO ou NÃO.
  . Saída: Use Prime para representar os números primos existentes e Not Prime para os números não primos;
*/

import kotlin.math.sqrt

fun main(args: Array<String>) {
    val qtdCasosTeste: Int
    var numero: Long

    //Pega a quantidade de casos de Teste
    qtdCasosTeste = readLine()!!.toInt()

    //Utilizando qtdCasosTeste para iterar sobre os casos de testes
    for (i in 1..qtdCasosTeste) {

        numero = readLine()!!.toLong()
        if (verificaPrimo(numero) == true)
            println("Prime")
        else
            println("Not Prime")

    }
}

//Função criada para verificar se o número é ou não primo.
fun verificaPrimo(numero: Long): Boolean {

    if (numero < 2L)
        return false
    else if (numero == 2L)
        return true
    else if (numero % 2 == 0L)
        return false
    val raizNum = sqrt(numero.toFloat())

    for (i in 3..raizNum.toInt() step 2) {
        if (numero % i == 0L) {
            return false
        }
    }

    return true
}