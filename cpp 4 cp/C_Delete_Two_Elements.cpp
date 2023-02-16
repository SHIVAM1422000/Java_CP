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
         unordered_map<ll,ll> map;
         for(int i=0 ; i<n ; i++){
             ll temp;
             cin>>temp;
             v.push_back(temp);
             map[temp]+=1;
          }


          ll sum=0;
          for(ll i:v) sum+=i;

          ll req=(2*sum)/n;

          ll ans=0;
          for(int i=0;i<n;i++){
             ll c=req-v[i];
                cout<< " Current Index:  "  << i << endl;
             if(c==v[i]){
                if(map.find(c)!=map.end() && map[c]>1){
                    ans+=(map[c]-1);
                    // cout<<"Found Match: " <<  (map[c]-1);
                }
             }else{
                if(map.find(c)!=map.end()){
                 ans+=map[c];
                //  cout<<"Found Match: " <<  (map[c]);
                }
             }
             

          }

          cout<< (ans)/2 << endl;






      

     }
   

}



