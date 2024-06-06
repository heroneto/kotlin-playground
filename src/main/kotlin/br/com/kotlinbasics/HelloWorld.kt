package br.com.kotlinbasics

class Carro(val modelo: String, val ano: String ){

}

fun String.hello(){
    println("Hello $this")
}

fun parOuImpar(numero: Int){
    if(numero % 2 == 0){
        println("Par")
    } else {
        println("Impar")
    }
}


fun print0a10(){
    for(numero in 0 .. 10){
        println(numero)
    }
}

fun printa10a0(){
    for(numero in 10 downTo 0){
        println(numero)
    }
}


fun main() {
    val carro = Carro("Teste1", "teste2")
    println(carro.ano)

    "Heron".hello()

    parOuImpar(1)
    parOuImpar(2)

    print0a10()
    printa10a0()
}


