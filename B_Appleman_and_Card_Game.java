import java.util.*;
// import java.lang.*;

public class B_Appleman_and_Card_Game{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long n=sc.nextInt();
    long k=sc.nextInt();
    String str=sc.next();


    long arr[]=new long[26];
    Arrays.fill(arr,0);
    for(int i=0;i<str.length();i++){
        int index=str.charAt(i)-'A';
        arr[index]++;
    }
    Arrays.sort(arr);

    // System.out.println("Given Char Count");
    // for(int i=25;i>=0;i--){
    //     System.out.println(arr[i]);
    // }



   long count=0;
//    int idx=25;
   for(int idx=25;idx>=0;idx--){
        if(k>=arr[idx]){
            count=count+(arr[idx]*arr[idx]);
            k=k-arr[idx];
        }else{
            count=count+(k*k);
            break;  
        }
   }

   System.out.println(count);



}
}
