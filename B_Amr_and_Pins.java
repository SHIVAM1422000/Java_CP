import java.util.*;
import java.lang.*;

public class B_Amr_and_Pins{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    // r, x, y, x' y
     int r=sc.nextInt();
     int x=sc.nextInt();
     int y=sc.nextInt();
     int xd=sc.nextInt();
     int yd=sc.nextInt();



     double dis=Math.sqrt(Math.pow((xd-x),2)+Math.pow((yd-y),2));
     Double temp=2*r*1.0;
     int ans=(int)Math.ceil(dis/temp);
     System.out.println(ans);
     
}
}
