//Alright it's time to give this question the final sujustsu

//Write a Java program to Find Maximum Element in a Stack.

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(472);
        stack.push(4);

        int max = stack.peek();
        System.out.println(max);
        //we have defined that this should be set to the head........
        // "Don't forget how head is seen in stack and Queue" remember the analogy of the book stuff
        //This block of code beneath checks or traverses through the stack to find the largest
        for (int num : stack){//This line gives basically everything in stack a variable, name called "num"

           if (num > max){
               //This check and updates the max from the head lemme explain ................
               max = num;
           }
        }
    // This one prints out the largest number sha
        System.out.println("The largest element is "+max);
    }
}