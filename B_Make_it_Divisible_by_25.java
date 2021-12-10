import java.util.*;
import java.lang.*;

public class B_Make_it_Divisible_by_25{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     while(t-->0){
        //   25,50,75,00  
        String str=sc.next();
        int ans=0,n=str.length();
        int five=0,zero=0;
        boolean bfive=false,bzero=false; 
        for(int i=n-1;i>=0;i--){
           if(str.charAt(i)=='5'){
               for(int j=i-1;j>=0;j--){
                   if(str.charAt(j)=='2' || str.charAt(j)=='7'){
                       five=n-j-2;
                       bfive=true;
                       break;
                   }
               }
           }
           if(bfive) break; 
        }

        for(int i=n-1;i>=0;i--){
            if(str.charAt(i)=='0'){
                for(int j=i-1;j>=0;j--){
                    if(str.charAt(j)=='5' || str.charAt(j)=='0'){
                        zero=n-j-2;
                        bzero=true;
                        break;
                    }
                }
            }
            if(bzero) break; 
         }

      
      if(five>0 && zero>0) System.out.println(Math.min(five,zero));
      else if(five>0) System.out.println(five);
      else System.out.println(zero);
       

     }
}
}
