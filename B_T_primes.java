import java.util.*;
import java.lang.*;

public class B_T_primes{

 public static HashMap<Integer,Integer> set=new HashMap<>();


public static boolean isPrime(long n){
   
   if(n==2) return true; 
 
   for(long i=2;i*i<n;i++){
         if(n%i==0) return false;
   }

   return true;

}


public static void precompute(){
      long lim=1000000;
     for(long i=2;i<=lim;i++){
         if(isPrime(i)==true){
            long prod=i*i;
            set.put((int)prod,1); 
            System.out.println("Passes_:"+i+" Added: "+prod);
         }
     }
}



public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     while(t-->0){
         long n=sc.nextInt();
         if(set.containsKey(n)){
             System.out.println("YES");
         }else{
             System.out.println("NO");
         }
     }
}
}
