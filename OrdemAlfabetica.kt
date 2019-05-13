data class NoAlfabetico(val i: String, val prox: NoAlfabetico?)


fun imprimindo(n: NoAlfabetico?):Unit=
    if(n==null)
        print("")
    else{
        println(n.i)
        imprimindo(n.prox)
    }


fun recebeNomes(vararg n: String): NoAlfabetico? { //Receba indeterminada quantidade de nomes
    fun aux(pos: Int): NoAlfabetico?=
        if(pos == n.size)//Quando pos for igual a quantidade de nomes passados como parametro
            null
        else
            ordenar_Nomes(NoAlfabetico(n[pos], aux(pos + 1)))//Chame a ordenar, para ja adicionar em ordem

    return aux(0)//Chama a funcao aux, inicializando com o 0
}



fun ordenar_Nomes(n: NoAlfabetico?): NoAlfabetico?=
    if(n==null)
        null
    else
        insere_Ordenado_Nomes(ordenar_Nomes(n.prox),n.i)//Chame a funcao parar inserir os valores ordenado



fun insere_Ordenado_Nomes(n: NoAlfabetico?, nome: String): NoAlfabetico?=
    if(n==null)
        NoAlfabetico(nome,null)
    else{
        if(aux_Nomes(n.i,nome,0)) { //Se o nome vem primeiro que o n.i
            NoAlfabetico(nome, n) //Coloque o nome na frente
        }else
            NoAlfabetico(n.i,insere_Ordenado_Nomes(n.prox,nome))
    }

fun aux_Nomes(nome1: String, nome2: String, pos: Int): Boolean=
    if(nome1.get(pos) > nome2.get(pos))//Se o caracter de nome1 for maior que o do nome2
        true
    else if(nome1.get(pos) < nome2.get(pos))
        false
    else if((pos > nome1.length) && (pos <= nome2.length))// Se nome2 for maior que nome1
        true
    else if((pos <= nome1.length) && (pos > nome2.length))// Se nome1 for maior que nome2
        false
    else
        aux_Nomes(nome1,nome2,pos+1)



fun main(args: Array<String>) {
    imprimindo(recebeNomes("Victor", "Stella"))
}