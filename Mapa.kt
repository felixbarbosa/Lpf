//Mapas associam elementos de um conjunto de chaves a elementos do conjunto de valores
//Mapas permitem recuperar os valores associados a uma chave
fun main(args: Array<String>) {
    //Mapas (Não Mutaveis):
    val mapa = mapOf("a" to "Sport", "b" to "Campeão", "c" to "1987")//Criando um mapa Não-Mutável

    println(mapa)// Imprime as chaves e os valores associados a cada chave

    println(mapa["a"])// Imprime o valor da chave "a", no caso v1

    println(mapa.keys)// [a, b, c]


    //Mapas (Mutaveis):
    val mmap = mutableMapOf("a" to "Sport", "b" to "Campeão", "c" to "1987")

    println(mapa)// Imprime as chaves e os valores associados a cada chave

    println(mapa["a"])// Imprime o valor da chave "a", no caso v1

    mmap["c"] = "Serie B 2019" //Muda a informação da chave "c"
    mmap.remove("a") //Remove a chave "a"
    println(mmap)
    println(mmap.keys)

}