import java.util.*;
import java.lang.*;

public class A_Long_Comparison{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     while(t-->0){
         double x1=sc.nextInt(),x2=sc.nextInt();
         double y1=sc.nextInt(),y2=sc.nextInt();
         if(x2>y2){
             double temp=Math.pow(10,(x2-y2));
            y1=y1/temp;
            if(x1>y1) System.out.println(">");
            else if(x1<y1) System.out.println("<");
            else System.out.println("=");
         }else{
            x1=x1/Math.pow(10,(y2-x2));
            if(x1>y1) System.out.println(">");
            else if(x1<y1) System.out.println("<");
            else System.out.println("=");
         }
        //  System.out.println("One:"+x1+" two:"+y1);

     }
}
}