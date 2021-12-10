import java.util.*;

import javax.swing.plaf.synth.SynthSplitPaneUI;

import java.lang.*;

public class B_Coloring_Rectangles{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     while(t-->0){
         int n=sc.nextInt();
         int m=sc.nextInt();
         long temp=(n*m);
         if(temp%3==0){
            int ans=(int)temp/3;
            System.out.println(ans);
         }else{
            int ans=(int)temp/3;
            System.out.println(ans+1);
         }
     }
}
}
