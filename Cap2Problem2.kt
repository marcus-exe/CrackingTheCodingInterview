//Return Kth to Lat
fun main(){
    val list = listOf<Int>(1, 2, 3, 4, 5, 6)
    println("The last number is ${returnLast(list)}")
}
// find last using normal kotlin
fun returnLast(list: List<Int>): Int{
    return list.last()
}

// 