public class Main {
    public static void main(String[] args) {
        //  Recursion = When a thing is defined in terms of itself
        //              Apply the result oif a procedure, to a procedure
        //              A recursive method calls itself. Can be a substitute for iteration.
        //              Commonly used with advanced sorting algorithms and navigating trees
        //
        //  Advantages
        //  1.easier to read/write
        //  2.easier to debug
        //
        //  Disadvantages
        //  1.sometimes slower
        //  2.uses more memory

        System.out.println(factorial(7));
        System.out.println(power(2, 8));
    }

    private static int factorial(int num){
        if(num < 1) return 1; //base case
        return num * factorial(num - 1);
    }

    private static int power(int base, int exponent){
        if(exponent  < 1) return 1; //base case
        return base * power(base, exponent - 1);
    }
}