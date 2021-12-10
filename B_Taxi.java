import java.util.*;
import java.lang.*;

public class B_Taxi{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int one=0,two=0,three=0,four=0;
      for(int i=0;i<arr.length;i++){
         int temp=sc.nextInt();
         if(temp==1){
              ++one;
         }else if(temp==2){
              ++two;
         }else if(temp==3){
             ++three;
         }else{
            ++four;
         }
      }



     if(one<=three){
          one=0;
        int t=two/2;
        if(two%2!=0) ++t;  
       int sum=two+three+four;
       System.out.println(sum);
     }else{
        
        one=one-three;
        if(one<=two){
          one=one
        }else{

        }

     }


   

}
}
