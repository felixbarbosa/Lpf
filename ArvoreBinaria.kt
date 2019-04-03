class ArvoreBinaria(val raiz: Int, val esquerda: ArvoreBinaria?, val direita: ArvoreBinaria?){

    fun tamanho(arvore: ArvoreBinaria?):Int=
        if(arvore != null){
            if(arvore.esquerda == null && arvore.direita == null)
                1
            else
                tamanho(arvore.esquerda)+tamanho(arvore.direita)+1
        }else
            0


    fun maiorValor(arvore: ArvoreBinaria?): Int?=
        if(arvore != null){
            if(arvore.direita == null)
                arvore.raiz
            else
                maiorValor(arvore.direita)
        }else
            null


}
