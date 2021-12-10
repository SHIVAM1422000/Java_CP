import java.util.*;

public class B_DZY_Loves_Strings{

  
 public static void main(String[] args) {
     
    Scanner sc=new Scanner(System.in); 
    String str=sc.next();
    int n=sc.nextInt();
    int arr[]=new int[26];
    int maxval=Integer.MIN_VALUE;
    for(int i=0;i<26;i++){
        arr[i]=sc.nextInt();
        maxval=Math.max(maxval,arr[i]);
    }


    long present=0;
     for(int i=0;i<str.length();i++){
           int id=str.charAt(i)-'a';
        //    System.out.println("Id: "+id+"for Char: "+str.charAt(i));
           present=present+((i+1)*arr[id]);
     }
     
     int length=str.length()+1;
     while(n-->0){
         present+=(length*maxval);
         ++length;
     }
    
     
     System.out.println(present);



   




 }



}