#include <bits/stdc++.h>
using namespace std;
using ll = long long;

ll dsum(int n){
    ll sum=0;
    while(n>0){
    sum+=(n%10);
    n/=10;
    }
    return sum;
}

ll poww(ll a, ll b){
    // a^b
    if(b==0){
        return 1;
    }

    if(b%2==0){
       return poww((a*a),(b/2));       
    }else{
        return a*poww(a,b-1);
    }
}

int main(){


     ll a,b,c;
     cin >> a >> b >> c;
     ll lim=1e9;
     vector<ll> ans;
     for(ll gs=1;gs<=81;gs++){
        ll x=(b*poww(gs,a))+c;
        ll as=dsum(x);
        if(as==gs && x<lim){
            ans.push_back(x);
        }
     }

     cout<<ans.size()<<endl;
     for(ll i:ans) cout<<i<<" ";
     cout<<endl;


}



