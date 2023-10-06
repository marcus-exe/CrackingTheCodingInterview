
fun main(){
    val lista = listOf(1, 1, 1, 2, 2, 3)
    println("With dups: $lista")
    println("Without dups: ${removeDups(lista)}")
}

//remove dups using normal kotlin
fun removeDups(list: List<Int>) : List<Int>{
    val noDups = list.toSet().toList()
    return noDups
}

//

