import kotlin.browser.*

fun clicou(){
    window.alert("Nao Clique")
}



fun main() {
    println("Ola Mundo")
    window.alert("ola a todos")
    val div = document.getElementById("texto")
    if(div != null)
        div.innerHTML += "Este texto esta no programa kotlin"
}