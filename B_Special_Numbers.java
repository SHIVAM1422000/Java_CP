import java.util.*;
import java.lang.*;

public class B_Special_Numbers{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     while(t-->0){
         long n=sc.nextInt();
         long k=sc.nextInt();
         long mod=1000000007;
         long p=1;
         long bit=1;
         long ans=0;
         for(int i=0;i<32;i++){
           
            // System.out.println("p: "+p+" "+" bit: "+bit+" "+" ans: "+ans+" k: "+k);

           if((k&bit)!=0){
            //    System.out.println("Bit Matched");
              ans=(ans+p)%mod;  
           }

           bit=bit<<1;
           p=((p%mod)*(n%mod))%mod;
           

         }

// System.out.println(4&4);

         System.out.println(ans);

     }
}
}
