import java.util.*;
import java.lang.*;

public class A_Flipping_Game{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int arr[]=new int[n];
    
     for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
     }

/* O(n^3) Approach */
// ==========================

    //    int ans=0;

    //  for(int i=0;i<arr.length;i++){
    //      for(int j=i;j<arr.length;j++){
    //           //flip
    //           int temp=0;
    //           for(int k=i;k<=j;k++){
    //                arr[k]=1-arr[k];

    //           }
           
    //           //making array reverse to original state
    //           for(int k=0;k<arr.length;k++){
    //               if(arr[k]==1) ++temp;
    //               if(i<=k && k<=j){
    //                  arr[k]=1-arr[k]; 
    //               }
        
    //             }

    //           ans=Math.max(ans,temp);
                

    //      }
    //  }

    //  System.out.println(ans);

 int one=0;

    for(int i=0;i<arr.length;i++){
        if(arr[i]==1){
            ++one;
         arr[i]=-1;
        }else{
         arr[i]=1;
        }
    }


   
    int ans=0;
    int sum=0;
    for(int i=0;i<arr.length;i++){
        sum+=arr[i];
        if(sum<0){
            sum=0;
        }else{
             ans=Math.max((one+sum),ans); 
        }

}
    
if(one==arr.length){
    System.out.println(one-1);
}else{
    System.out.println(ans);
}



}
}
