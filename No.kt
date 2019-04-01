class No(val i: Int, val prox: No?) {

    fun incr(n:No?):No?=
    if(n==null)
        null
    else
        No(n.i + 1, incr(n.prox))

    fun printe(n: No?){
        if(n!=null){
            print(n.i)
            printe(n.prox)
        }
    }

    fun contem(n: No?, v: Int):Boolean =
        if (n != null) {
            if(n.i == v) {
                true
            }
            else {
                contem(n.prox, v)
            }
        }else {
            false
        }

    fun size(n: No?):Int =
        if(n == null)
            0
        else
            size(n.prox)+1

    fun concatenar(n: No?, p: No?): No?=
        if(n == null)
            p
        else if(p == null)
            n
        else{
            if(n.prox == null)
               No(n.i, p)
            else
               No(n.i,concatenar(n.prox, p))
        }

    fun intercalar(n: No?, p: No?): No?=

        if(n != null)
            No(n.i, intercalar(p, n.prox))
        else{
            if(p != null)
                No(p.i, p.prox)
            else
                null
        }

    fun inserir(n: No?, posicao: Int, info: Int): No?=
           if(n == null)
               null
           else {
               if (posicao == 1)
                   No(info, n)
               else
                   No(n.i, inserir(n.prox, posicao - 1, info))
           }

    fun remover(n: No?, posicao: Int): No?=
            if(n==null)
                null
            else{
             if(posicao==1)
                 concatenar(n.prox,null)
             else
                 No(n.i, remover(n.prox, posicao-1))
            }








}

