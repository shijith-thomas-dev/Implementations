import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sherloack_and_sq {

    public static void main(String[] args) {
        
        Scanner br=new Scanner(System.in);
        int Test=br.nextInt();
        int i=0;
        int A;
        int B;
        for(i=0;i<Test;i++){

            A=br.nextInt();
            B=br.nextInt();
            System.out.println(squares(A,B));
        }


    }
    public static int squares(int m, int n){

        

        int result=(int)(Math.floor(Math.sqrt(n))-Math.ceil(Math.sqrt(m)))+1;
        return result;
    }
}
