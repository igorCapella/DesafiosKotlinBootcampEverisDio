/*
Resumo do Desafio 2 de Solucionando Problemas em Kotlin
  . A= 2 * pi * raio -> pi =~ 3.14159;
  . Cálculo da área desejada = (raio)^2 * (pi) * 2. Lembre-se, existem diversas soluções para este cálculo, como a utilização do raio.pow(2);
  . Entrada é um ponto flutuante (Double = dupla precisão)
  . Obs: o raio é variável!! Lembre-se de usar o val por ser um valor único e imodificável na entrada. O que pode ocorrer é a entrada "aleatória do raio";
  - Objetivo: Resolver de forma simplificada.
  */

import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.pow

fun main(args: Array<String>) {
	// Utilizando readLine() para pegar o dado de entrada do desafio.
    val raio = readLine()!!.toDouble()
    val pi = 3.14159
	
	// Calculando a are com o pi e o raio ao quadrado.
    val area = pi * raio.pow(2)
	
	// Convertendo resultado para Bigdecimal com 4 casas após a vírgula.
    val resultado = BigDecimal( area ).setScale(4, RoundingMode.HALF_EVEN)
	
	// Apresentando o resultado no console.
    println("A=$resultado")
    
}