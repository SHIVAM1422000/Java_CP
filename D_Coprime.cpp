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
         unordered_map<int,int> map;
         for(int i=1 ; i<=n ; i++){
             int temp;
             cin>>temp;
            //  v.push_back(temp);
             map.insert({temp,i});


           ll ans=-1;
          for(int i=1;i<=1000;i++){
            for(int j=1;j<=1000;j++){
                if(map.find(i)!=map.end() &&  map.find(j)!=map.end() && gcd(i,j)==1){
                    ll temp= map.find(i) + map.find(j);
                    ans=max(ans,temp);
                }
            }
          }

        cout<<ans<<endl;

      

     }
   

}



}