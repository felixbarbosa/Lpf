class NoQuestoes<T>(val i: T, val prox: NoQuestoes<T>?)

fun <T> imprimir(n: NoQuestoes<T>?):Unit=
        if(n==null)
            print("nulo")
        else{
            print(n.i)
            print("->")
            imprimir(n.prox)
        }

fun <T> inserir(n: NoQuestoes<T>?, posicao: Int, info: T): NoQuestoes<T>?=
    if(n == null)
        null
    else {
        if(posicao == 1)
            NoQuestoes(info, n)
        else
            NoQuestoes(n.i, inserir(n.prox, posicao - 1, info))
    }

fun <T> remover(n: NoQuestoes<T>?, posicao: Int): NoQuestoes<T>?=
    if(n==null)
        null
    else{
        if(posicao==1)
            concatenar(n.prox,null)
        else
            NoQuestoes(n.i, remover(n.prox, posicao-1))
    }



fun <T> contem(valor: T, n: NoQuestoes<T>?): Boolean=
    if (n != null) {
        if(n.i == valor) {
            true
        }
        else {
            contem(valor, n.prox)
        }
    }else {
        false
    }

fun <T> concatenar(n: NoQuestoes<T>?, p: NoQuestoes<T>?): NoQuestoes<T>? =
    if(n == null)
        p
    else if(p == null)
        n
    else{
        if(n.prox == null)
            NoQuestoes(n.i, p)
        else
            NoQuestoes(n.i, concatenar(n.prox, p))
    }


//Informe o tamanho da lista
fun <T> size(n: NoQuestoes<T>?):Int =
    if(n==null)
        0
    else
        size(n.prox)+1

//Informe o ultimo elemento da lista
fun <T> ultimoElemento(n: NoQuestoes<T>?): T?=
    if(n != null){
        if(n.prox == null)
            n.i
        else
            ultimoElemento(n.prox)
    }else
        null

//Informe o penultimo elemento da lista
fun <T> penultimoElemento(n: NoQuestoes<T>?): T?=
    if(n != null){
        if(n.prox?.prox == null)
            n.i
        else
            penultimoElemento(n.prox)
    }else
        null


//Mostre o elemento que esta na determinada posição de uma lista
fun <T> elementoPosicao(n: NoQuestoes<T>?, posicao: Int): T?=
    if(n!=null){
        if(posicao == 1)
            n.i
        else
            elementoPosicao(n.prox, posicao-1)
    }else
        null


//Inverta uma lista
fun <T> inverterLista(n: NoQuestoes<T>?): NoQuestoes<T>?=
    if(n != null)
        concatenar(inverterLista(n.prox),NoQuestoes(n.i, null))
    else
        null


//Informe se a lista é um palidromo
fun <T> ehPalidromo(n: NoQuestoes<T>?): Boolean=
    if(n!=null) {
        if (n.equals(inverterLista(n)))
            true
        else
            false
    }else
        true


//Informe quantas vezes o elemento se repete na lista
fun <T> num_Ocorrencias(valor: Int, n: NoQuestoes<T>?): Int =
        if(n==null)
            0
        else{
            if(n.i==valor)
                num_Ocorrencias(valor, n.prox)+1
            else
               num_Ocorrencias(valor, n.prox)
        }


//Informe os elementos maiores que o elemento passado como parametro
fun maior_Que(valor: Int, n: NoQuestoes<Int>?): NoQuestoes<Int>?=
        if(n==null)
            null
    else{
            if(n.i>valor)
                NoQuestoes(n.i,maior_Que(valor,n.prox))
            else
                maior_Que(valor, n.prox)
        }


//Remova os elementos repetidos de uma lista
fun <T> remover_Repetidos(n: NoQuestoes<T>?):NoQuestoes<T>?=
    if(n==null)
        null
        else{
            if(contem(n.i,remover_Repetidos(n.prox))==false)
                NoQuestoes(n.i,remover_Repetidos(n.prox))
        else
                remover_Repetidos(n.prox)

        }


//Receba duas lista que nao tenham elementos repetidos e faça a uniao entre elas, sem repetições de elementos
fun <T> uniao(n: NoQuestoes<T>?, p: NoQuestoes<T>?): NoQuestoes<T>?=
    if(n==null)
        p
    else if(p==null)
        n
    else{
        remover_Repetidos(concatenar(n,p))
    }


//Receba duas listas que nao tenham elementos repetidos e faça a intersecção entre elas(elementos em comum)
fun <T> interseccao(n: NoQuestoes<T>?, p: NoQuestoes<T>?): NoQuestoes<T>?=
        if(p==null || n==null)
            null
        else{
            if(contem(n.i,p)==true)
                NoQuestoes(n.i,interseccao(n.prox,p))
            else
                interseccao(n.prox,p)
        }


//Receba dois numeros naturais n e m, e retorne uma lista com n elementos, onde o primeiro é m, o segundo é m+1, etc...
fun sequencia(n: Int, m: Int): NoQuestoes<Int>?=
        if(n==0)
            null
        else{
            NoQuestoes(m,sequencia(n-1,m+1))
        }


//Receba uma lista ordenada e um numero qualquer, insira o numero na lista e manhtenha a lista ordenada.
fun insere_Ordenado(n: NoQuestoes<Int>?, valor: Int): NoQuestoes<Int>?=
        if(n==null)
            NoQuestoes(valor,null)
        else{
            if(n.i>=valor)
                NoQuestoes(valor,n)
            else
                NoQuestoes(n.i,insere_Ordenado(n.prox,valor))
        }


//Receba uma lista e ordene-a.
fun ordenar(n: NoQuestoes<Int>?): NoQuestoes<Int>?=
        if(n==null)
            null
        else
            insere_Ordenado(ordenar(n.prox),n.i)


//Receba uma lista e um número natural n, retorne um par onde o primeiro elemento é
//uma lista com os n primeiros números da lista original e o segundo elemento é uma lista
//com o resto dos elementos da lista original.
fun <T> dividir_Lista(n: NoQuestoes<T>?, valor: Int): NoQuestoes<T>?=
        if(n==null)
            null
        else{
            if(valor==0) {
                null
            }else
                NoQuestoes(n.i,dividir_Lista(n.prox,valor-1))
        }


fun rodar_Esquerda(n: NoQuestoes<Int>?, valor: Int): NoQuestoes<Int>?=
        if(n==null)
            null
        else{
            if(valor==0)
                n
            else
                concatenar(rodar_Esquerda(n.prox,valor-1),null)
        }

/*fun minunuscula_Para_Maiuscula(c: String): Unit=
        if(c.get(0)<= 122.toChar() && c.get(0)>= 97.toChar()) {
            print(c.get(0) - 32)

        }else{
           print(c)
            }*/



fun main(args: Array<String>){
    val lista = NoQuestoes(1, NoQuestoes( 3, NoQuestoes(4, NoQuestoes(5,null))))
    val lista2 = NoQuestoes(9,NoQuestoes(5,NoQuestoes(15,NoQuestoes(9,null))))


    //minunuscula_Para_Maiuscula("aBC")
}
