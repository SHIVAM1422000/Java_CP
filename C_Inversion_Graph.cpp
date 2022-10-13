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

          ll count=0,m=v[0];
          for(int i=1;i<=n;i++){
              m=max(m,v[i-1]);
              if(i==m){
                 ++count;
              }
             
          }

          cout<< count << endl;

      

     }
   

}



