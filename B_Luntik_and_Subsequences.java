import java.util.*;
import java.lang.*;

public class B_Luntik_and_Subsequences{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
    
		while (t-- > 0) {
			int n = sc.nextInt();
			int c_0 = 0, c_1 = 0;
			for (int i = 0; i < n; i++) {
				int a = sc.nextInt();
				if (a == 0)
					c_0++;
				else if (a == 1)
					c_1++;
			}
			System.out.println((long)Math.pow(2, c_0) * c_1);
		}

     
}
}
