import java.util.*;
import java.lang.*;

public class B_Pashmak_and_Flowers{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }

   Arrays.sort(arr);
   long maxc=0,minc=0;
   int maxe=arr[n-1],mine=arr[0];

//    for(int i=0;i<arr.length;i++){
//        maxe=Math.max(maxe,arr[i]);
//        mine=Math.min(mine,arr[i]);
//    }
   int d=maxe-mine;
    for(int i=0;i<arr.length;i++){
       if(arr[i]==maxe){
           ++maxc;
       }

       if(arr[i]==mine){
              ++minc;
       } 
        
   }
   
 
 long total=0;
   if(mine==maxe){
     total=(minc*(minc-1))/2;
   }else{
     total=minc*maxc;
   }


   System.out.println(d+" "+total);


}
}
