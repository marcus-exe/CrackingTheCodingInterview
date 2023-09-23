//One Away Problem

//Thinking Process
/*
*  1) Use something like linux dif in Kotlin
*   Tried and didn´t work quite well, mostly because it counts the structure more o like a set,
*   so it doesn´t take repeated new elements in consideration
*
*  2) Use a simHash, but I don´t know if they keep things this similar in accountability
*   Just saw an exemple code of how to implement a SimHash in Kotlin and notice it probably was not
*   the best choice
*
*  3) I´m going to create a set for the new letters and use length for repeated ones
*   It solved the biggest majority of problems in a good time, but not all of them
*
*  4) Probably going to need a Map of the letters, this way a can count length and letter more
*   accurately
*
*
* */


fun oneAwayDiffBroken(string1: String, string2: String){

    //verifying using size
    val differenceSize : Int
    if (string1.length > string2.length){
        differenceSize = string1.length - string2.length
    } else {
        differenceSize = string2.length - string1.length
    }

    //verifying using set
    val setString1 = string1.toHashSet()
    val setString2 = string2.toHashSet()
    val differenceSet = setString1 - setString2

    return if (differenceSize > 1 && differenceSet.isNotEmpty()){
        println("Not One Away")
    } else if (differenceSet.size > 1 && differenceSize > 0) {
        println("Not One Away")
    } else {
        println("One Away")
    }

}


fun main(){
    val string1 = "baseef"
    val string2 = "baasee"
    oneAwayDiffBroken(string1, string2)
}
