import java.util.*;
import java.lang.*;

public class C_Save_More_Mice{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     while(t-->0){
         int n=sc.nextInt(); 
         int k=sc.nextInt();
         int arr[]=new int[k];
         for(int i=0;i<arr.length;i++) arr[i]=sc.nextInt();
         Arrays.sort(arr);
         long sum=0,count=0;
         for(int i=arr.length-1;i>=0;i--){
               if(sum+n-arr[i]>=n) break; 
               sum+=n-arr[i];
               count++;
         }

         System.out.println(count);
         
     }
}
}
