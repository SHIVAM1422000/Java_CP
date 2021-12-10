// import java.lang.*;

// public class A_AB_Balance{

// public static int sol(String s,int i){
//     if(i==s.length()) return Integer.MAX_VALUE;
   
//     int a=0,b=0;
//          for(int j=0;j<s.length()-1;j++){
//              String temp=""+s.charAt(j)+s.charAt(j+1);
//              if(temp.equals("ab")) ++a;
//              else if(temp.equals("ba")) ++b;
//         }

//        if(a==b) return 0; 

//        String temp="";
//        if(s.charAt(i)=='a'){
//          temp=s.substring(0,i)+'b'+s.substring(i+1,s.length());
//        }else{
//          temp=s.substring(0,i)+'a'+s.substring(i+1,s.length());
//        }

//        int one=1+sol(temp,i+1);
//        int two=sol(s,i+1);
//        if(one<0) one=Integer.MAX_VALUE;

//        return Math.min(one,two);
     

// }

// public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//      int t=sc.nextInt();
//      while(t-->0){
//          String s=sc.next();
//          int a=0,b=0;
//          for(int j=0;j<s.length()-1;j++){
//              String temp=""+s.charAt(j)+s.charAt(j+1);
//              if(temp.equals("ab")) ++a;
//              else if(temp.equals("ba")) ++b;
//         }

//         if(a==b){
//             System.out.println(s);
//         }else{
//             int ans=sol(s,0);
//             System.out.println("Ans="+ans);
//         }

// }
// }
// }


import java.util.*;

public class A_AB_Balance{

  public static void main(String[] args) {
      
           Scanner sc=new Scanner(System.in);
           int t=sc.nextInt();
           while(t-->0){
               String s=sc.next();
               char c=s.charAt(s.length()-1);
               s=s.substring(1);
               s=""+c+s;
               System.out.println(s);
           }
     
  }


}


