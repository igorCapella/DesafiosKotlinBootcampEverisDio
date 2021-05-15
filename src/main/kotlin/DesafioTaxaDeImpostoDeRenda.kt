/*
Resumo do Desafio 1 de Solucionando Problemas em Kotlin
  .A moeda Loli é representada por R$;
  .Ler um valor flutuante (salário) com duas casas decimais (Float);
  .Imposto de Renda da tabela (Usar controle de fluxo, pode ser o "if" ou "when");
  .Ideia do Imposto de renda:
    1-> 0.0..2000.0 Imposto de Renda será nulo;
    2-> 2000.01..3000.00 Imposto de Renda é aplicado 8% em cima de 1/3 do salário que é 1000.00;
    3-> 3000.01..4500.00 Imposto de Renda é aplicado 8% em 1000.00 (valor "acumulativo") + 18% do restante.
    ...
*/

fun main(args: Array<String>) {
	// Métodos para receber dados do desafio na platadorma.
    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    val r = readLine()!!.toFloat()
	
	// Váriavel que possui o valor do imposto a ser pago.
	// Caso não entre em nenhuma das condições abaixo,
	// 		quer dizer que o valor de entrada é isento de imposto, por isso a inicialização dela com 0.
    var i = 0F
	
	// Variáveis para auxiliar nos cálculos da porcentagens.
    var tx_8 : Float = 0.08F
    var tx_18 : Float = 0.18F
    var tx_28 : Float = 0.28F
    
	// Se entrar neste IF o imposto de renda a ser cobrado é 8%.
    if ( r > 2000 && r <= 3000 ) {
        i = ( r - 2000 ) * tx_8
    }
	// Se entrar nesta condição o imposto a ser cobrado de acordo com as faixas é 8% e 18%.
	else if ( r > 3000 && r <= 4500 ) {
        i = 1000 * tx_8 + (r - 3000) * tx_18
    }
	// Se entrar nesta condição o imposto a ser cobrado de acordo com as faixas é 8%, 18% e 28%.	
	else if ( r > 4500 ){
        i = 1000 * tx_8 + 1500 * tx_18 + (r - 4500) * tx_28
    }
    
	// Condição para informar se o valor de entrada possui imposto isento ou se tem valor.
    if (i == 0F) println("Isento") else println("R$ ${i.format(2)}")
 
}