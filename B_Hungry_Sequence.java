import java.util.*;
import java.lang.*;

public class B_Hungry_Sequence{

public static boolean isPrime(int n){
 
    if(n==2) return true;

    if(n%2==0) return false;


       for(int i=3;i<=Math.sqrt(n);i++){
           if(n%i==0) return false;
       }

       return true;
   

}    


public static void main(String[] args){
   
   int lim=10000000;
   ArrayList<Integer> arr=new ArrayList<>(); 
   for(int i=2;i<=lim;i++){
       if(isPrime(i)==true){
        //    System.out.print(i+" ");
        arr.add(i);
        
       }
   }

   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
    for(int i=0;i<n;i++){
        System.out.println(arr.get(i)+" ");
    }
     
}
}
