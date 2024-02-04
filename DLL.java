public class DLL<E> {
  class Node<E> {
      // Node Fields
      private E element;
      private Node<E> prev;
      private Node<E> next;

      public Node<E>() {
          element = null;
          prev = null;
          next = null;
      } // Node<E>() Constructor

      public Node<E>(E element) {
          this.element = element;
          prev = null;
          next = null;
      } // Node<E>(E element) constructor

      public Node<E>(E element, Node<E> prev, Node<E> next){
          this.element = element;
          this.prev = prev;
          this.next = next;
      } // Node<E>(E element, Node<E> prev, Node<E> next) constructor

      public void setElement(E element) {
          this.element = element;
      } // setElement()

      public void setNext(Node<E> next) {
          this.next = next;
      } // setNext()

      public void setPrev(Node<E> prev) {
          this.prev = prev;
      } // setPrev()

      public E getElement() {
          return element;
      } // getElement()

      public Node<E> getNext() {
          return next;
      } // getNext()

      public Node<E> getPrev() {
          return prev;
      } // getPrev()
  } // Node Class

// DDL fields
private DDL.Node<E> head;
private DDL.Node<E> tail;
private int counter;

// DDL Constructors
public DDL<E>(){
    // initializes all references fields to null and counter to zero
    head = null;
    tail = null;
    counter = 0;
} // DDL<E>()

// public methods
public int size() {
    this.counter = 0;
    Node<E> current = head;
    while (current != null) {
    this.counter++; // current.getNext();
    Node<E> next = current.next;
    }
    return counter;


    // return size;
} // size()
public boolean isEmpty() {
    if(this.size() == 0) {
        return true;
    } else {
        return false;
    }
} // isEmpty()

 public E first(){
    return head.getElement();
 } //E First

public E last() {
    // need to work on this one
    E temp = head.getNext();
    while(temp.getNext() != null) {
        temp = temp.getNext();
    } // while
    return temp;
} // last()

public void addFirst(E element) {
    DDL.Node<E> newNode = new DDL.Node (element);
    newNode.setNext(head);
    newNode.setPrev(null);
    head = newNode;
    counter++;
} //addFirst(E element)

public void addLast(E element) {
    DDL.Node<E> newNode = new DDL.Node (element);
    newNode.setPrev(tail);
    newNode.setNext(null);
    //wait what do i do here
    counter++;
} // addLast(E element)

public E removeFirst() {
    // removes and returns first element of list
    DLL.Node<E> temp = head.getNext();
    temp.setPrev(null);

} // removeFirst()

public E removeLast() {
    // removes and returns last element of list
} // removeLast()

public String toString() {
    // returns string displays in sequence of elements EX
    // "null"
    // "null <--a--> null"
    // "null <--a<-->b--> null"
    // "null <--a<-->b<-->c-->null"

} // toString()

public DDL<E> clone(){
    // creates a new sequence of nodes whose elements reference
    // the elements of original list
} // clone()
public DDL<E> deepClone(){
    // creates a new sequence of nodes that contain new elements whose
    // value equal to that of the objects of the original list
} // deepClone()
public void insert(int index, E element) {
    // insert an element at the specified position in the list. list elements
    // start at 0
} // insert(int index, E element)

public E get(int index) {
    // retrieves an element at the specified position in the list(doesn't remove)
    // if an index is out of bounds, return null. list starts at 0
} // get(int index)

public E remove(int index) {
    // removes an element at specified position from the list, returns element
} // remove(int index)

public void remove(Node<E> x){
    // removes the specified node from the list
} // remove(Node<E> x)

public Node<E> find(E element) {
    // returns a reference to the node containing the element. if the element
    // is not in the list, return null
} // find(E element)

public void swap(Node<E> x, Node<E> y){
    // the nodes x and y switch positions in list. The elements contained
    // in the ndoes are not alterted
} // swap(Node<E> x, Node<E> y)
publiv void clear() {
    // removes all elements of the list
    head = null;
    tail = null;
    size() = 0;
} // clear()

public E set(int index, E element) {
    // replaces the element at specified position in the list with specified
    // element and returns original element from the list
} // E set(int index, E element
} // DDL class
