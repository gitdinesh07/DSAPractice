package DS;

/*
 * we are going to implement or try to mimic LinkedList Java collection api
 * below are the methods or function we are going to implement/mimc
 * 1) add(E e) - This method Appends the specified element to the end of this list.
 * 2) add(int index, E element) - This method Inserts the specified element at the specified position in this list.
 * 3) addFirst(E e) - This method Inserts the specified element at the beginning of this list.
 * 4) addLast(E e) - This method Appends the specified element to the end of this list.
 * 5) clear() - This method removes all of the elements from this list.
 * 6) contains(Object o) - This method returns true if this list contains the specified element.
 * 7) get(int index) - This method returns the element at the specified position in this list.
 * 8) getLast() - This method returns the last element in this list.
 * 9) indexOf(Object o) - This method returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
 * 10) remove(int index)- This method removes the element at the specified position in this list.
 * 11) remove(Object o) - This method removes the first occurrence of the specified element from this list if it is present.
 * 12) size() - This method returns the number of elements in this list.
 * 12) findMiddle() - this method find the middle element
 * -----other methods-----
 * 13) ReverseList() - reverse element of linked list
 * 13) HashMap() - design a hash map
 * 
 */

public class LinkedList {
    static class Node
    {
        Node next;
        int value;

        public Node(int value)
        {
            this.value = value;
            this.next = null;
        }
        public Node(int value, Node node)
        {
            this.value = value;
            this.next = node;
        }
    }

    Node head;
    public LinkedList()
    {
        
    }

    
}