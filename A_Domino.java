import java.util.*;
import java.lang.*;

public class A_Domino{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     boolean flag=false;
     int topSum=0;
     int bottomSum=0;
     while(t-->0){
        int a=sc.nextInt(); 
        int b=sc.nextInt();
        
        if(((a%2==0) && (b%2!=0))||((a%2!=0) && (b%2==0))){
            flag= true;
        }

        topSum+=a;
        bottomSum+=b;

    }


    if(topSum%2==0 && bottomSum%2==0){
        System.out.println("0");
    }else if(((topSum%2==0) && (bottomSum%2!=0))|| ((topSum%2!=0) && (bottomSum%2==0))){
        System.out.println("-1");
    }else{
        if(flag==true){
            System.out.println("1");
        }else{
            System.out.println("-1");
        }
    }





}
}
