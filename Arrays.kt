
fun soma(vararg n: Int): Int { //O vararg serve para pegar um numero indefinido de parametros
    var soma = 0
    for (v in n)//Percorre o array por completo
        soma += v

    return soma
}

fun soma2(vararg n: Int): Int {
    fun aux(pos: Int): Int =
            if(pos == n.size)
                0
            else
                n[pos] + aux(pos + 1)

    return aux(0)//Chama a função aux, passando 0 como parametro

}

fun soma3(vararg n: Int): Int =
        n.reduce({x: Int, y: Int -> x+y})




fun main(args: Array<String>) {
    val a = Array<Int>(10){x->x}//Criar um array
    val list = listOf(1,2,3)//Criando uma lista
    //println(list.size)
    //println((list + list).map({x -> x*2}))//Multiplica todos os elementos da lista por 2
    //println(a.size)//Tamanho do array
    //println(a[3])//Mostrar o valor da posição 3
    //a[3] = 3//Modificar a informação do valor da posição 3
    //println(a[3])
    //println(soma3(1,2,3))
    a.forEach({v -> print(v)})//Percorre e imprime todos os elementos do array
    println()
    a.map({x -> x + 1}).filter({x -> x < 11}).forEach({v -> print(v)})//Map: adiciona +1 em todos os elementos do array
                                                                      //Filter: Só passa elementos menores que 11
                                                                      //forEach: Vai imprimir o novo array
}