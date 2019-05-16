fun main(args: Array<String>) {
    //Listas (Não Mutaveis): Não podem ser modificadas
    val lis = listOf(1,2,3,4,5)//Criando uma lista

    println(lis.size)// Tamanho da lista

    println(lis.get(3))// Elemento da posicao 3
    println(lis[3])// Elemento da posicao 3

    //lis[3] = 2 : ERRO
    //lis.set(3,2) : ERRO

    //Listas (Mutaveis): Podem ser modificadas
    val mlist = mutableListOf(1,2,3,4)

    mlist[2] = 0 // [1,2,0,4]
    mlist.add(9) // [1,2,0,4,9]
    mlist.remove(2) // [1,0,4,9] Remove o numero 2
    mlist.removeAt(2) // [1,0,9] Remove o elemnto da posicao 2
    println(mlist)


}