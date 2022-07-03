public class Main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(5);

        System.out.println("Empty: "+ dynamicArray.isEmpty());
        System.out.println("Size: " + dynamicArray.getSize());
        System.out.println("Capacity: " + dynamicArray.getCapacity());


        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.insert(0, "X");

        System.out.println("Empty: "+ dynamicArray.isEmpty());
        System.out.println("Size: " + dynamicArray.getSize());
        System.out.println("Capacity: " + dynamicArray.getCapacity());

        System.out.println(dynamicArray);
        System.out.println(dynamicArray.getFullArray());
        dynamicArray.delete("B");

        System.out.println("Empty: "+ dynamicArray.isEmpty());
        System.out.println("Size: " + dynamicArray.getSize());
        System.out.println("Capacity: " + dynamicArray.getCapacity());

        System.out.println(dynamicArray);
        System.out.println(dynamicArray.getFullArray());

        System.out.println("C is located at: " + dynamicArray.search("C"));

        dynamicArray.add("E");
        dynamicArray.add("F");
        dynamicArray.add("G");

        System.out.println("Empty: "+ dynamicArray.isEmpty());
        System.out.println("Size: " + dynamicArray.getSize());
        System.out.println("Capacity: " + dynamicArray.getCapacity());

        System.out.println(dynamicArray);
        System.out.println(dynamicArray.getFullArray());

        dynamicArray.delete("A");
        dynamicArray.delete("C");
        dynamicArray.delete("X");

        System.out.println("Empty: "+ dynamicArray.isEmpty());
        System.out.println("Size: " + dynamicArray.getSize());
        System.out.println("Capacity: " + dynamicArray.getCapacity());

        System.out.println(dynamicArray);
        System.out.println(dynamicArray.getFullArray());

    }
}