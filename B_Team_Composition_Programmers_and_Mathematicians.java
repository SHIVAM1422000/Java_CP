import java.util.*;
import java.lang.*;

public class B_Team_Composition_Programmers_and_Mathematicians{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     while(t-->0){
        long a=sc.nextLong();
        long b=sc.nextLong();
        long temp=(a+b)/4;
        long ans=Math.min(temp,Math.min(a,b));
        System.out.println(ans);
     }
}
}
