import java.util.*;
import java.lang.*;

public class B_Polo_the_Penguin_and_Matrix{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int m=sc.nextInt();
     int d=sc.nextInt();

   ArrayList<Integer> arr=new ArrayList<>();
//    System.out.println("Given Array");
   for(int i=0;i<n*m;i++){
       arr.add(sc.nextInt());
   }

   Collections.sort(arr);
   
//    for(int i:arr){
//        System.out.print(i+" ");
//    }
   int total=m*n; 
   int mid=(total-1)/2;
   int med=arr.get(mid);
  boolean flag=true;
   long ans=0;
   for(int i:arr){
       long temp=Math.abs(i-med);
       if(temp%d!=0){
         System.out.println(-1);
         flag=false;
         break;
       }else{
          ans+=temp/d;
       }
       
   }

   if(flag) System.out.println(ans); 

}
}
