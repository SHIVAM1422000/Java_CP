import java.util.*;
import java.lang.*;

public class A_Another_Sorting_Problem{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int n=sc.nextInt(),m=sc.nextInt();
     Pair arr[]=new Pair[n];
     for(int i=0;i<n;i++){
         String str=sc.next();
         arr[i]=new Pair(str,i);
     } 

    //   for(int i=0;i<arr.length;i++){
    //       Pair temp=arr[i];
    //       String str=temp.str;
    //       for(int i=1;i<str.length();i=i+2){
    //           int t=(str.charAt(i)+26);

    //           System.out.println(str.charAt(i)+"->"+c);
    //           str=str.substring(0,i)+c+str.substring(i+1);
    //       }
    //       arr[i]=new Pair(str,temp.idx);
    //   }    


     
     Arrays.sort(arr,new Comparator<Pair>(){
         public int compare(Pair one,Pair two){
              String s1=one.str,s2=two.str;
              for(int i=0;i<s1.length();i++){
                  if(s1.charAt(i)==s2.charAt(i)) continue;
                  if(i%2==0) return s1.charAt(i)-s2.charAt(i);
                  else return -1*(s1.charAt(i)-s2.charAt(i));
              }
              return 0;
         }
     });

  
     
       
    //    System.out.println();
    //   for(Pair j:arr) System.out.print(j.str+" ");
    //   System.out.println();
      for(Pair j:arr) System.out.print((j.idx+1)+" ");
      System.out.println();
     

    }


}


class Pair{
    String str;
    int idx;

    public Pair(String str,int idx){
        this.str=str;
        this.idx=idx;
    }

}