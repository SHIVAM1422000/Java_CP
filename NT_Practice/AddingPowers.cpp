#include <bits/stdc++.h>
using namespace std;
using ll = long long;


bool solve(ll mp, vector<ll> &v,int k){
    while(mp>0){
        ll curr = mp,count=0;
        for(int i=0;i<v.size();i++){
            if(v[i]>=mp){
                ++count; v[i]-=mp;
            }
            if(count>1){
                return false;
            }
        }
        mp/=k;
    }

    for(ll i:v){
        if(i!=0){
            return false;
        }
    }

    return true;

}

int main(){


     int t;
     cin >> t;
     while(t--){
         int n,k;
         cin >> n >> k;  
         vector<ll> v;
         for(int i=0 ; i<n ; i++){
             ll temp;
             cin>>temp;
             v.push_back(temp);
          }


          ll curr=1,lim=1e16;
          while(curr<lim){
                 curr*=k;
          }

       

        if(solve(curr,v,k)){
            cout<<"YES"<<endl;
        }else{
            cout<<"NO"<<endl;
        }

      

     }
   

}



