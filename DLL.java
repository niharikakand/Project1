public class DLL<E> {
  class Node<E> {
      private <E> element;
      private Node<E> prev;
      private Node<E> next;

      public Node<E>(){
          element = null;
          prev = null;
          next = null;
      }

      public Node<E>(E element) {
          this.element = element;
          prev = null;
          next = null;
      }

      public Node<E>(E element, Node<E> prev, Node<E> next){
          this.element = element;
          this.prev = prev;
          this.next = next;
      }

      public void setElement(E element) {
          this.element = element;
      }

      public void setNext(Node<E> next) {
          this.next = next;
      }

      public void setPrev(Node<E> prev) {
          this.prev = prev;
      }

      public E getElement() {
          return element;
      }

      public Node<E> getNext() {
          return next;
      }

      public Node<E> getPrev() {
          return prev;
      }
  } // Node Class

    private int counter;

public int size() {

     return size;
} //size
public boolean isEmpty() {
if (this.size = 0) {
reutrn true;
} else {
    return false;
} // else

}// isEmpty

 public E first(){

 } //E First

public E last() {

  } // Elast

public void addFrist() {


} //addFrist
//
} // DDL class
