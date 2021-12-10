import java.util.*;
import java.lang.*;

public class A_Sereja_and_Bottles{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
     for(int i=0;i<=1000;i++){
         arr.add(new ArrayList<Integer>());
     }

     int bottles[]=new int[1000+1];
     for(int i=0;i<n;i++){
         int a=sc.nextInt();
         int b=sc.nextInt();
         bottles[a]++;
        //  b can be opened up by a
        //  ArrayList<Integer> temp=arr.get(b);
        //  if(!temp.contains(a)){
            arr.get(b).add(a);
        //  }
     }

     
     for(int i=0;i<=1000;i++){
       if(bottles[i]>0){
            int same=0;
           for(int it:arr.get(i)){
            if(it==i){
                ++same;
                if(same==2){
                  bottles[i]=0;
                  break;
                }else{
                  bottles[i]=1;
                }
            }else{
                bottles[i]=0;
                break;
            }
        }
       }
    }

    long count=0;
    for(int i:bottles){
        count+=i;
    }
    System.out.println(count);
    

     
}
}
