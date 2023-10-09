//this class is an implementation of a linked list from scratch

data class Node<T>(val data: T, var next: Node<T>? = null)

class LinkedList<T> {
    //head is the first item from a list
    private var head: Node<T>? = null

    fun append(data: T) {
        val newNode = Node(data)

        if (head == null) {
            head = newNode
        } else {
            var current = head
            while (current?.next != null) {
                current = current.next
            }
            current?.next = newNode
        }
    }

    fun printList() {
        var current = head
        while (current != null) {
            print("${current.data} -> ")
            current = current.next
        }
        println("null")
    }


    // Cap 2 - Problem 1 : Remove Dups
    fun removeDups() {
        var current = head
        while (current != null) {
            if (current.next?.data == current.data) {
                current.next = current.next?.next
            } else {
                current = current.next
            }
        }
    }
    


}

