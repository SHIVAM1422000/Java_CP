#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main(){


     int t;
     cin >> t;
     while(t--){
         ll n,k;
         cin >>n>>k;  
        
       
           ll ans=n;

           for(ll i=1;i*i<=n;i++){
              if(n%i==0){
                 ll o=n/i;
                 if(i<=k){
                    ans=min(ans,o);
                 }
                 if(o<=k){
                    ans=min(ans,i);
                 }

              }
           }


            cout<<ans<<endl;


     }
   

}



