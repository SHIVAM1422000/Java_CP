#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main(){




         int n;
         cin >> n;  
         vector<ll> v;
         for(int i=0 ; i<n ; i++){
             ll temp;
             cin>>temp;
             v.push_back(temp);
          }


          ll g=v[0];
          for(int i=1;i<n;i++){
              g=gcd(g,v[i]);

          }


          ll ans=0;
          for(ll i=1;i*i<=g;i++){
              if(g%i==0){
                 ++ans;
                 if((g/i)!=i){
                     ++ans;
                 }
              }
          }

          cout<<ans<<endl;

      


   

}



