import java.util.*;
import java.lang.*;

public class Maximum_Number_Of_Distinct_Elements{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     while(t-->0){
         int n=sc.nextInt();
         int arr[]=new int[;];
         int brr[]=new int[n];
         for(int i=0;i<n;i++) brr[i]=sc.nextInt();

          
         HashMap<Integer,Integer> map=new HashMap<>();
         Set<Integer> set=new HashSet<>();
         for(int i=0;i<brr.length;i++){
             if(brr[i]==1){
                 arr[i]=1;    
             }else if(map.containsKey(brr[i])){
                 int temp=brr[i]-1;
                 if(temp<0){
                   temp=brr[i]+1;
                 }else{
                    
                 }
            }else{
                 int temp=brr[i]+1;
                 arr[i]=temp;
            }
             

         }


        

     }
}
}
