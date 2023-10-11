//this class is an implementation of a linked list from scratch

data class Node<T>(var data: T, var next: Node<T>? = null)

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

    // Cap 2 - Problem 1 : Using Set
    fun removeDuplicates() {
        val uniqueValues = HashSet<T>()
        var current = head
        var previous: Node<T>? = null

        while (current != null) {
            if (uniqueValues.contains(current.data)) {
                // Remove the current node (duplicate)
                previous?.next = current.next
            } else {
                uniqueValues.add(current.data)
                previous = current
            }
            current = current.next
        }
    }

    // Cap 2 - Problem 2 : Return Kth to Last
    fun returnKthToLast(kth: Int): T? {
        if (head == null || kth < 1) return null
        var slow = head
        var fast = head
        repeat(kth){
            fast = fast?.next
            if (fast == null) return null //if kth > length
        }
        while (fast?.next != null) {
            slow = slow?.next
            fast = fast?.next
        }
        return slow?.data
    }

    // Cap 2 - Problem 3: Delete Middle Node
    fun removeNode(data: T) {
        var current = head
        var prev: Node<T>? = null

        // Traverse the list to find the node with the specified value
        while (current != null && current.data != data) {
            prev = current
            current = current.next
        }

        // If the node with the specified value is found, remove it
        if (current != null) {
            // If the node to be removed is the head node
            if (prev == null) {
                head = current.next
            } else {
                prev.next = current.next
            }
        }
    }


}

