import java.util.*;
import java.lang.*;

public class B_Update_Files{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     while(t-->0){
         int n=sc.nextInt();
         int k=sc.nextInt();
      
         if(k>=2){
             if(n%2==0)
              System.out.println(n/2);
             else
              System.out.println((n/2)+1); 
         }else{
             System.out.println(n-1);
         }


     }
}
}
