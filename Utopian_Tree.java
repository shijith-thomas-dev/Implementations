import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Utopian_Tree{
    public static void main(String[] args){ 
        
        Scanner br=new Scanner(System.in);
        int T=br.nextInt(); // test cases
        int i=0;
        int N=0;
        for(i=0;i<T;i++){
            N=br.nextInt(); // input the value
            System.out.println(height1(N)); // display the o/p
        }
    }
    public static int height1(int M){ // method for displaying the output

        int height=1;
        
        if(M<=0){ // no. of cycles is LT or EQ to 0
            return height;
        }
        while(M>0){ // if the i/p value > 0, then it must have two cycles.... 1st for spring and other for summer

            if(M>0){ //spring started

                height=height*2;
                M=M-1;
            }
            if(M>0){ // summer started
                height=height+1;
                M=M-1;
            }
        }
        return height; // return the total value of "height" after parsing the while loop
    }
}        



