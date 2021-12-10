import java.util.*;
import java.lang.*;

public class A_Little_Elephant_and_Bits{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     String str=sc.next();
     
     int pos=-1;
     for(int i=0;i<str.length();i++){
         if(str.charAt(i)=='0'){
             pos=i;
             break;
            }
     }

     if(pos!=-1){
        str=str.substring(0,pos)+str.substring(pos+1,str.length());
     }else{
        str=str.substring(0,str.length()-1);
     }
     System.out.println(str);


}
}
