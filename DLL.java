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
