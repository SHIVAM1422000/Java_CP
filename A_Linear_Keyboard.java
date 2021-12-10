import java.util.*;
import java.lang.*;

public class A_Linear_Keyboard{

public static int sol(String str,HashMap<Character,Integer> map,char last){
 
    if(str.length()==0) return 0;
    char current=str.charAt(0);
    int diff=map.get(current)-map.get(last);
    return Math.abs(diff)+sol(str.substring(1),map,current);

}    


public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     while(t-->0){
         String pos=sc.next();
         String str=sc.next();

        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<pos.length();i++){
            map.put(pos.charAt(i),i+1);
        }

        
        int ans=sol(str,map,str.charAt(0));
        System.out.println(ans);

     }
}
}
