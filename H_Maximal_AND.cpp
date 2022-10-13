#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main(){


     int t;
     cin >> t;
     while(t--){
         int n;
         ll k;
         cin >> n >> k;  
         vector<ll> v;
         for(int i=0 ; i<n ; i++){
             ll temp;
             cin>>temp;
             v.push_back(temp);
          }

ll ans=0;

          for(int i=30;i>=0;i--){
              ll mask=1<<i;
              ll count=0;
              for(ll e:v){
                if((e&mask)==0){
                    ++count;
                }
              }
              if(k>=count){
                k-=count;
                ans+=mask;
              }
          }

cout<<ans<<endl;
      

     }
   

}



