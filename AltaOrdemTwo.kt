open class Lista <out C>{
    infix fun <B> map(f:(C)->B)= map(this, f)
}
    
    data class No <C>(val v: C, val prox: Lista<C>): Lista <C>()
    
    object vazio: Lista <Nothing>()
    
    val l = No(1,No(2,vazio))
    val f = {x:Int->x+1}
    
    fun <A,B> map(l: Lista<A>, f:(A)->B): Lista<B>=
    	if(l is No<A>)
        	No(f(l.v), map(l.prox, f))
        else
			vazio

	infix fun <A,B> Lista<A>.map2(f:(A)->B):Lista<B>=
    	map(this, f)
        
    fun<A> forEach(l:Lista<A>, f:(A)->Unit):Unit=
    	if(l is No<A>){
            f(l.v)
            forEach(l.prox, f)
        }else{
            
        }

        fun main(){
            println("Vasco meu Pau")
        }
