import java.util.*;
// import java.lang.*;

public class B_Anton_and_currency_you_all_know{

// public static int max;
// public static int index;

// public static void generate(int n,ArrayList<Integer> arr,int count){
//       if(n==0) return;
//       int digit=n%10;
//       if(digit%2==0 && digit<max){
//           max=digit;
//           index=count;
//       }
//       generate(n/10,arr,count+1);
//       arr.add(digit);

// }  
    
public static void main(String[] args){
    
    Scanner s=new Scanner(System.in);
		
    char[] ss=s.next().toCharArray();
    int j=-1;
    int x=Integer.MAX_VALUE;
    
    for(int i=ss.length-1;i>=0;i--) {
        int y=ss[i]-'0';
        
        if(y%2==0 && y<=x) {
            j=i;
            x=y;
        }
    }
    if(j==-1) System.out.println(-1);
    else {
        char temp=ss[j];
        ss[j]=ss[ss.length-1];
        ss[ss.length-1]=temp;
        System.out.println(ss);
    }

    
    

   
}
}
