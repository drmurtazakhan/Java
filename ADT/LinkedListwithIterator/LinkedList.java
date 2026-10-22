/* A linked list is a sequence of links with efficient element insertion and removal. */class LinkedList {  /** Constructs an empty linked list. */
   public LinkedList() {         first = null;   } // End of constructor LinkedList()
/** Returns the first element in the linked list.
      @return the first element in the linked list. */
   public Object getFirst() {         if (first == null) throw new NoSuchElementException();
       return first.data;   } // End of getFirst() method
/** Removes the first element in the linked list.
   @return the removed element. */
   public Object removeFirst() {       if (first == null) throw new NoSuchElementException();       Object obj = first.data;       first = first.next;       return obj;   } // End of removeFirst() method