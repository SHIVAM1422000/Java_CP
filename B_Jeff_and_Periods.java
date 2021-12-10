import java.util.*;
import java.lang.*;
import java.lang.reflect.Array;


public class B_Jeff_and_Periods{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<arr.length;i++){
         arr[i]=sc.nextInt();
     }


         TreeMap<Integer,Pair> map=new TreeMap<>();


         for(int i=0;i<arr.length;i++){
                
            if(map.containsKey(arr[i]) && map.get(arr[i]).diff!=-1){
                Pair temp=map.get(arr[i]);
                int d=i-temp.n;
                if(temp.diff==-2){
                    map.put(arr[i],new Pair(i,d)); 
                }else if(d==temp.diff){
                    map.put(arr[i],new Pair(i,d)); 
                }else{
                    map.put(arr[i],new Pair(i,-1));
                }
            }else{
              map.put(arr[i],new Pair(i,-2));
            }
               

         }

             
         ArrayList<int[]> ans=new ArrayList<>();


         for(Map.Entry<Integer,Pair> element:map.entrySet()){
                 if(element.getValue().diff!=-1){
                     if(element.getValue().diff==-2){
                        ans.add(new int[]{element.getKey(),0});
                     }else{
                        ans.add(new int[]{element.getKey(),element.getValue().diff});
                     }
                    
                 }       
         }


         System.out.println(ans.size());
         for(int temp[]:ans){
             System.out.println(temp[0]+" "+temp[1]);
         }



     
}
}


class Pair{

  int n;
  int diff;


  public Pair(int n,int diff){
      this.n=n;
      this.diff=diff;
  }

}
