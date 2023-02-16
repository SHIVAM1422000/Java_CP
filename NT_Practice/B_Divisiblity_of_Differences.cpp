#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main(){



         int n,k,m;
         cin >> n >> k >>m;  
         vector<ll> v;
         for(int i=0 ; i<n ; i++){
             ll temp;
             cin>>temp;
             v.push_back(temp);
          }

 
           map<ll,vector<ll>> map;

        for(ll num:v){
            ll modu=(num%m);
            if(map[modu].size()) cout<<"Modu: "<< modu << " map: " << map[modu];
        }
        cout<<"Pushed";

/**

        for(auto it=map.begin();it!=map.end();++it){
            cout<<"element:" << it->first;
        }

*/
      

   

}



