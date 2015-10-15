import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Find_Digits{
    
    public static void main(String[] args){ 
        
        Scanner br=new Scanner(System.in);
        int Test=br.nextInt();
        int i=0;
        int Num=0;
        for(i=0;i<Test;i++){
            Num=br.nextInt();
            System.out.println(count(Num));
        }
    }

    public static int count(int M) {

        String N=Integer.toString(M);
        int M1=M;
        int j=0;
        int count=0;
        int length=N.length();
        int[] array=new int[length];
       
            if(M>0){
                for(j=0;j<length;j++){
                    
                    array[j]=M % 10;
                    M=M / 10;    
                }
            }
            for(j=length-1;j>=0;j--){

                

                if(array[j]>0){

                    if(M1 % array[j]==0){
                        count=count+1;
                    }
                }
                if(array[j]<=0){
                    continue;
                }

            }
        return count;
    }
}




