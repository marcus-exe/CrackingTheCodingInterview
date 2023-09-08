import com.sun.jdi.Value

// Given 2 strings, write a method to decide if one is a permutation of the other

fun isPermutationBF(string1: String, string2: String){
    if (string1.length != string2.length){
        return println("Não é anagrama")
    }
    val charArray1 = string1.toCharArray()
    val sortedArray1 = charArray1.sorted()

    val charArray2 = string2.toCharArray()
    val sortedArray2 = charArray2.sorted()

    if (sortedArray1 == sortedArray2){
        return println("É anagrama")
    }
    return println("Não é anagrama")
}


fun main(){
    val string1: String = "abcdez"
    val string2: String = "zedcba"
    isPermutationBF(string1, string2)

}