import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Stack - LIFO data structure: Last-in First-out
        //          -stores object into a sort of "vertical tower"
        //          -push() to add to the top
        //          -pop() to remove from the top

        Stack<String> stack = new Stack<String>();

        System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        System.out.println(stack.empty());
        System.out.println(stack.peek());
        System.out.println(stack.search("DOOM"));
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        String topElement = stack.pop();
        System.out.println(topElement);
        System.out.println(stack);

        System.out.println("Reverse String");

        System.out.println("Please enter a string to reverse");
        Scanner stringScanner = new Scanner(System.in);
        if(stringScanner.hasNextLine()){
            String beforeReverseString = stringScanner.nextLine();
            String reversedString = "";
            Stack<String> stringStack = new Stack<String>();

            for(int i = 0; i < beforeReverseString.length(); i ++){
                char letter = beforeReverseString.charAt(i);
                stringStack.push(Character.toString(letter));
            }

            while(!stringStack.empty()){
                String letter = stringStack.pop();
                reversedString+= letter;
            }

            System.out.println(reversedString);

        }else{
            System.out.println("You entered a invalid input!");
        }


    }
}