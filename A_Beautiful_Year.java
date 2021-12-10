import java.util.*;
import java.lang.*;

public class A_Beautiful_Year{

public static boolean check(long n){

    long a=n%10;
    n=n/10;
    long b=n%10;
    n=n/10;
    long c=n%10;
    n=n/10;
    long d=n%10;
    n=n/10;


   if((a==b) || (a==c) || (a==d)) return false;
   else if((b==c) || (b==d)) return false;
   else if(c==d) return false;
   else return true;

}

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     for(long i=n+1;i<Long.MAX_VALUE;i++){
         if(check(i)==true){
             System.out.println(i);
             break;
         }
     }
}
}
