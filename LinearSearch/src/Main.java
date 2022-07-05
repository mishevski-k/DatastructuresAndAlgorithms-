public class Main {
    public static void main(String[] args) {
        //  Linear Search: iterate through a collection one element at a time
        //
        //  Runtime complexity: O(n)
        //
        //  Disadvantages
        //  1.Slow for large data sets
        //
        //  Advantages
        //  1.Fast for searches of small to medium data sets
        //  2.Does not need to be sorted
        //  3.Useful for data structures without that do not have random access (Linked List)

        int[] array = {9, 0, 5, 2, 6, 7, 1, 8};
        int index = linearSearch(array, 6);

        if(index != 1){
            System.out.println("Element found at index: " +index);
        }else{
            System.out.println("Element not found!");
        }
    }

    private static int linearSearch(int[] array, int value) {
        for(int i = 0; i < array.length; i++){
            if(array[i] == value) return i;
        }

        return -1;
    }
}