import java.util.*;
import java.lang.*;

public class A_System_of_Equations{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int m=sc.nextInt();

    int count=0;
     for(int i=0;i<=n;i++){
         int b=n-(i*i);
         boolean temp=false;
         if((b*b)+i==m){
             temp=true;
         }
          
         if(b>=0 && temp==true){
             ++count;
         }

     }


     System.out.println(count);
    
}
}