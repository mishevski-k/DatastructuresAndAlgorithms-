public class Main {
    public static void main(String[] args) {
        //  Interpolation search = improvement over binary search best used for "uniformly" distributed "guesses" where a value might be based on calculate
        //                         probe results, if probe is incorrect, search area is narrowed, and new probe is created
        //
        //  average case: O(log(log(n)))
        //  worst case: O(n) [values increase exponentially]


        //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 8};
        //int target = 8;

        int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192};
        int target = 1024;

        int index = interpolationSearch(array, target);

        if(index != -1){
            System.out.println("Element " + target +" found at index: " + index);
        }else{
            System.out.println(target + " not found");
        }
    }

    private static int interpolationSearch(int[] array, int target) {

        int low = 0;
        int high = array.length - 1;
        int step = 0;

        while(target >= array[low] && target <= array[high] && low <= high){
            int probe = low + ( (( target - array[low] ) * (high - low)) / ( array[high] - array[low] ) );

            step++;

            System.out.println("Probe: " + probe + " Step: " + step);

            if(array[probe] == target) return probe;
            else if(array[probe] < target) low = probe + 1;
            else high = probe - 1;
        }

        return -1;
    }
}