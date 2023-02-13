import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Java_Loops_I {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N=s.nextInt();
        int result; 
        for(int i=1;i<=10;i++)
        {
            result=N*i;
            System.out.format("%d x %d = %d\n",N,i,result);
        }
    }
}
