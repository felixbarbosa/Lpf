//Conjuntos são coleções onde a ordem e a repetição são desprezadas.

fun main(args: Array<String>) {
    //Conjuntos (Não Mutaveis):
    val conjunto = setOf(2,1,3,4,5,5,6)//Criando um conjunto Não-Mutavel

    println(conjunto.size)// Tamanho do conjunto(Não conta os numeros repetidos)

    println(conjunto.contains(2))// Para saber se o numero 2 esta contido no conjunto

    println(conjunto)// Irá imprimir o conjunto sem os numeros repetidos [1, 2, 3, 4, 5, 6]


    //Conjuntos (Mutáveis):
    val mconjunto = mutableSetOf(2,6,3,3,1,9,2,1)//Criando um conjunto Mutável

    println(mconjunto.size)// Tamanho do conjunto(Não conta os numeros repetidos)

    println(mconjunto.contains(2))// Para saber se o numero 2 esta contido no conjunto

    mconjunto.add(8)//Adiciona o numero 8

    mconjunto.remove(3)// Remove o numero 3 do conjunto

    println(mconjunto)

}