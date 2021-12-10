import java.util.*;
import java.lang.*;

public class B_Shifting_Sort{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     while(t-->0){
         int n=sc.nextInt();
         int arr[]=new int[n];
         int temp[]=new int[n];
         for(int i=0;i<n;i++) arr[i]=temp[i]=sc.nextInt();
      
         Arrays.sort(temp);
         ArrayList<Tup> ans=new ArrayList<>();
         for(int i=0;i<n;i++){
            int j=i;
            for(;j<n;j++){
              if(arr[j]==temp[i]){
                break;
              }
            }

            if(i!=j){
                  int x=j-i;
                  ans.add(new Tup((i+1),(j+1),x));
                  int last=arr[j];
                  for(int k=j;k>i;k--){
                      arr[k]=arr[k-1];
                   }

                   arr[i]=last;
                    
            }


         }
      
 
         System.out.println(ans.size());
         for(Tup j:ans) System.out.println(j.a+" "+j.b+" "+j.c);





     }
}
}


class Tup{
  int a,b,c;
  public Tup(int a,int b,int c){
       this.a=a;
       this.b=b;
       this.c=c;
  }
}