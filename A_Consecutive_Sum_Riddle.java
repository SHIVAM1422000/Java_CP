import java.util.*;
import java.lang.*;

public class A_Consecutive_Sum_Riddle{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     while(t-->0){
         long n=sc.nextLong();
         
         if(n>=0){
           long n2=(n-1)*(-1);
           System.out.println(n2+" "+n);
         }else{
            long n2=Math.abs(n+1);
            System.out.println(n+" "+n2);
         }

     }
}
}
