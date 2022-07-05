import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //  Binary Search: Search algorithm that finds the position of a target value within  a sorted array
        //  Half of the array is eliminated during each step

        int array[] = new int[1000000000];
        int target = 6565980;
        
        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }
        //int index = Arrays.binarySearch(array, target);
        int index = binarySearch(array, target);


        if(index != -1){
            System.out.println("Element " + target +" found at index: " + index);
        }else{
            System.out.println(target + " not found");
        }
    }

    private static int binarySearch(int[] array, int target) {

        int low = 0;
        int high = array.length -1;
        int step = 0;

        while(low <= high){
            int middle = low + (high - low) / 2;
            int value = array[middle];
            step++;

            System.out.println("middle: " + value + " Step: " + step);

            if(value < target) low = middle + 1;
            else if(value > target) high = middle - 1;
            else return middle; //target is found

        }

        return -1; //target not found
    }
}