import java.util.*;

import javax.swing.event.InternalFrameEvent;

import java.lang.*;

public class B_Little_Girl_and_Game{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     String str=sc.next();
     HashMap<Character,Integer> map=new HashMap<>();
     for(int i=0;i<str.length();i++){
         char c=str.charAt(i);
         if(map.containsKey(c)){
            map.put(c,map.get(c)+1);
         }else{
            map.put(c,1);
         }
     }

   
    long odd=0;
   for(Map.Entry<Character,Integer> entry:map.entrySet()){
       odd=odd+(entry.getValue()%2);
   }

   
           odd--;
           if(odd<0){
              System.out.println("First");
           }else if(odd%2==0){
              System.out.println("First");
           }else{
              System.out.println("Second");
           }
         

   }






     
}

