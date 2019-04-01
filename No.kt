class No(val i: Int, val prox:No?) {

    val n1 = No(1, No(2, null))

    fun incr(prim:No?):No? =
    if(prim == null)
        null
    else
        No(prim.i+1, incr(prim.prox))

    fun printe(prim: No?){
        if(prim != null){
            print(prim.i)
            printe(prim.prox)
        }
    }
}



