import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //  LinkedList = stores Nodes in 2 parts ( data | address)
        //      - Nodes are in non-consecutive memory locations
        //      - Elements are Lined using pointers
        //                                      Singly Linked List
        //                      Node                  Node                  Node
        //                [ data | address ] -> [ data | address ] -> [ data | address ]
        //
        //                                      Doubly Linked List
        //              Node                            Node                            Node
        //  [ address | data | address ] -> [ address | data | address ] -> [ address | data | address ]
        //
        //                                      Circular Linked List
        //               Node                            Node                            Node
        //      [ tail | data | address ] -> [ address | data | address ] -> [ address | data | head ]
        //               head                                                            tail
        //
        //  Advantages?
        //      1.Dynamic Data Structure ( allocates memory while running )
        //      2.Insertion and deletion of Nodes is very easy and fast
        //      3.No/Low memory waste
        //
        //  Disadvantages?
        //      1.Greater memory usage ( additional pointer )
        //      2.No random access of elements ( no index [i] )
        //      3.Accessing/searching elements is more time-consuming. O(n)
        //
        //  Uses?
        //      1.Implement Stack/Queue
        //      2.GPS navigation
        //      3.Music playlist

        LinkedList<String> list = new LinkedList<String>();

        list.push("A");
        list.push("B");
        list.push("C");

        System.out.println(list);
        System.out.println(list.peek());
        System.out.println(list);
        System.out.println(list.pop());
        System.out.println(list);
        list.pop();
        list.pop();

        System.out.println();

        list.offer("A");
        list.offer("B");
        list.offer("C");

        System.out.println(list);
        System.out.println(list.peek());
        System.out.println(list);
        System.out.println(list.poll());
        System.out.println(list);

        list.add(1, "F");
        System.out.println(list);
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
    }
}