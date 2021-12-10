import java.util.*;
import java.lang.*;

public class B_Odd_Grasshopper{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     long t=sc.nextLong();
     while(t-->0){
         long x=sc.nextLong();
         long n=sc.nextLong();
         long k=(n/4)*4;
         if(n%2==0){
            if(n%4==0){
               System.out.println(x);
            }else if(n%4==1){
              System.out.println(x-(k+1));
            }else if(n%4==2){
              System.out.println(x+1);
            }else{
               System.out.println(x+(k+4));
            }
         }else{
            if(n%4==0){
                System.out.println(x);
             }else if(n%4==1){
               System.out.println(x+(k+1));
             }else if(n%4==2){
               System.out.println(x-1);
             }else{
                System.out.println(x-(k+4));
             } 
         }


     }
}
}
