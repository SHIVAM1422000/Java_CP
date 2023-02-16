#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main(){


     int t;
     cin >> t;
     while(t--){
         int n,x,c;
         cin >> n >> x >> c; 
         int start=-1,end=-2;
         while (c-->0)
         {
           
            int l,r;
            cin >> l >> r;

            if(start==-1 && !(l<=x && x<=r)) continue;

            if(start==-1) {
                 start=l; end=r;
            }else{
                  if(start<=l && l<=end){
                      end=max(r,end);
                  }else if(start<=r && r<=end){
                      start=min(l,start);
                  }else if(l<= start && start<=r){
                     start = min(start, l );
                     end= max(end , r);
                  } 
                  
            }
           



         }

         int ans = (end-start+1);
          if(ans==0) ans=1;
          cout<< ans << endl;
           

      

     }
   

}




