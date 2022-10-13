#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main(){


     int t;
     cin >> t;
     while(t--){
         int n;
         cin >> n;  
         vector<ll> v;
         for(int i=0 ; i<n ; i++){
             ll temp;
             cin>>temp;
             v.push_back(temp);
          }

          ll sum=0,m=-1;
          for(ll i:v){
            sum+=i;
            if(i>m) m=i;
          } 



          double t=(sum * 1.0)/(n-1);
          ll eq=(ll)ceil(t);
          ll all=max(m,eq);
          ll ans=(n-1)*all - sum;
          cout<<ans<<endl;
      

     }
   

}



