import java.util.*;
import java.lang.*;

public class B_Groups{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     while(t-->0){
         int n=sc.nextInt();
         int arr[][]=new int[n][5];
         for(int i=0;i<arr.length;i++)
          for(int j=0;j<arr[0].length;j++)
            arr[i][j]=sc.nextInt();

         boolean flag=false;
          for(int i=0;i<5;i++){
              for(int j=i+1;j<5;j++){
                   int a=0,b=0,ab=0;
                   for(int k=0;k<n;k++){
                       //a + ab
                       if(arr[k][i]==1) ++a;
                       //b + ab
                       if(arr[k][j]==1) ++b;
                       //only ab
                       if(arr[k][i]==1 && arr[k][j]==1) ++ab;
                   }
                  //only a
                   int oa=a-ab;
                   //only b
                   int ob=b-ab;
                   int req=n/2;
                   //checking for correct ans
                   for(int e=0;e<=ab;e++){
                       if(oa+e==req && ob+ab-e==req){
                           flag=true;
                           break;
                       }
                   }
                   
                   if(flag==true) break;

              }
              if(flag==true) break;
          }  
        
          if(flag==true) System.out.println("YES");
          else System.out.println("NO");


     }
}
}
