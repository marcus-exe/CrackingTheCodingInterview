//this class is an implementation of a linked list from scratch

data class Node<T>(val data: T, var next: Node<T>? = null)

class LinkedList<T> {
    private var head: Node<T>? = null

    fun append(data: T) {
        val newNode = Node(data)

        if (head == null) {
            head = newNode
        } else {
            var current = head
            while (current?.next != null){
                current = current.next
            }
            current?.next = newNode
        }
    }

    fun printList(){
        var current = head
        while (current != null) {
            print("${current.data} -> ")
            current = current.next
        }
        println("null")
    }

}
fun main() {
    val myList = LinkedList<Int>()
    myList.append(1)
    myList.append(2)
    myList.append(3)

    myList.printList()
}