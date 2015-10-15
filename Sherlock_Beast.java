import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sherlock_Beast {

    public static void main(String[] args) {
        int[] input = getInput();
        for (int digits : input) {
            System.out.println(sherlock(digits));
        }
    }

    private static int[] getInput() {  // this method is for inputting the values into the array  , it is int() so it must return the value.
        Scanner scanner = new Scanner(System.in);
        try {
            int count = scanner.nextInt();
            int[] input = new int[count];
            for (int i = 0; i < count; i++) {
                input[i] = scanner.nextInt();
            }
            return input;
        } finally {
            scanner.close();
        }
    }

    private static String sherlock(final int target) {
        int threes = 0;
        int fives = 0;

        int digits = target; 
        while (digits > 0) {
            if (digits % 3 == 0) { // if the digit is divisible by 3 , then the loop is getting breaked including while & if.
                fives = digits;
                break;
            }
            digits -= 5; // if it is not divisible by 3, then it will decrement to (-5) and again check the if condition.       

        }   // here the loop has 44, then fives = 39 , and digit is also 39 after that the loop is breaked.
        threes = target - digits; 

        
        if (digits < 0 || threes % 5 != 0) { // if the  "three" variable is not divisible by 5, then it must be returned "-1".
            return "-1";
        }
        
        StringBuilder sb = new StringBuilder(target);
        
        while ((fives -= 3) >= 0) { // here the no. of fives is decrement by 3 , and appended "555" to the String Builder
            sb.append("555");
        }
        
        while ((threes-=5) >= 0) { // te no. of threes are decremented by 5 , and it is appended "33333" into String Builder 
            sb.append("33333");
        }
        
        return sb.toString();   // here the integer values are returned in String format.
    }

  }
