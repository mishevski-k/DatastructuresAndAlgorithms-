import java.util.*;

public class Main {
    public static void main(String[] args)  {
        //  Hashtable = A data structure that stores unique keys to values ex.<Integer, String>
        //              Each key/value pair is known as an Entry
        //              Fast insertion, look up, deletion of key/value pairs
        //              Not ideal for small data sets, great with large data sets

        //  hashing = takes a key and computes an integer (formula will vary based on key & data type)
        //            In a Hashtable, we use hash % capacity to calculate an index number
        //            key.hasCode() % capacity = index

        //  bucket = an index storage location for one or more Entries
        //           can store multiple Entries in case of a collision (linked similarly a LinkedList)

        //  collision = hash function generates the same index for more than one key
        //              less collisions = more efficiency

        //  Runtime complexity: Best case O(1)
        //                      Worst case O(n)

        Hashtable<Integer, String> studentTable = new Hashtable<>();

        studentTable.put(100,"Kiril");
        studentTable.put(123,"Maja");
        studentTable.put(321,"Filip");
        studentTable.put(555,"Milan");
        studentTable.put(777,"Marko");

        studentTable.remove(777);

        for(Integer key : studentTable.keySet()){
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + studentTable.get(key));
        }
    }
}