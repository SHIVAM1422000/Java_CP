import java.util.*;
import java.lang.*;

public class C_Two_Arrays{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     while(t-->0){
         int n=sc.nextInt();
         int a[]=new int[n];
         int b[]=new int[n];
         for(int i=0;i<n;i++) a[i]=sc.nextInt();
         for(int i=0;i<n;i++) b[i]=sc.nextInt();

         Arrays.sort(a);
         Arrays.sort(b);

         boolean flag=true;
         for(int i=0;i<n;i++){
            //  System.out.println("Diff:"+(b[i]-a[i]));
            if((b[i]-a[i])==1 || (b[i]-a[i])==0){
                continue;
            }else{
                // System.out.println("Broke");
                flag=false;
                break;
            }
         }

         if(flag==true) System.out.println("YES");
         else System.out.println("NO");

     }
}
}
