#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main(){


     ll n,a,b,c;
     cin >> n >> a >> b >> c;



//         //   int x=n/a, y=n/b , z=n/c;
//         // int x=4000,y=4000,z=4000;
          ll ans=0;
          for(ll i=0;i<=4000;i++){
             for(ll j=0;j<=4000;j++){
                for(ll k=0;k<=4000;k++){
                    ll curr=(i*a)+(j*b)+(k*c);
                    if(curr==n && (i+j+k)>ans){
                        ans=(i+j+k);
                    }
                }
             }   
          }
// cout<<"Nikal ni paa rha hai"<<endl;
          cout<<ans<<endl;
        
      

     }
   





