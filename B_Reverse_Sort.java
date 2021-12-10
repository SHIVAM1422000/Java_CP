import java.util.*;
import java.lang.*;

public class B_Reverse_Sort{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     while(t-->0){
         
        int n=sc.nextInt();
        String s=sc.next();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++) a[i]=b[i]=s.charAt(i)-'0';
        Arrays.sort(b);
        
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(a[i]!=b[i]){
                arr.add(i+1);
            }
        }

         if(arr.size()>0){
             System.out.println("1");
             System.out.print(arr.size()+" ");
             for(int i:arr) System.out.print(i+" ");
             System.out.println(); 
         }else{
             System.out.println("0");
         } 
        
        



     }
}
}
