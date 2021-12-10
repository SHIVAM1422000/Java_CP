import java.util.*;
import java.lang.*;

public class A_Make_Even{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     while(t-->0){
         int n=sc.nextInt();
         if(n%2==0){
            System.out.println(0);
         }else{
             boolean flag=false;
            String s=String.valueOf(n);
            for(int i=0;i<s.length();i++){
                if((s.charAt(i)-'0')%2==0){
                    if(i==0) System.out.println(1);
                    else System.out.println(2);
                    flag=true;
                    break;
                }
            }
            if(flag==false) System.out.println(-1);
         }
     }
}
}
