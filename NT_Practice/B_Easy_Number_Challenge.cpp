#include <bits/stdc++.h>
using namespace std;
using ll = long long;

ll fact(ll curr){
 
 ll ans=0;
 for(ll i=1;i*i<=curr;i++){
    if(curr%i==0){
        ++ans;
        if(i!=(curr/i)) ++ans;
    }
 }

 return ans;


}



int main(){


        ll a,b,c;
        cin >> a >> b >> c;
        ll mod=1073741824;

        int max=(a*b*c) + 1;
        ll fact[max]={0};
        for(int i=1;i<max;i++){
            // cout<<"I am factor of: " << i <<" endl";
            for(int j=i;j<max;j+=i){
                // cout<<"j: " <<j << endl;
                fact[j]++;
            }
        }

        cout<<endl;

     ll ans=0;
        for(int i=1;i<=a;i++){
          for(int j=1;j<=b;j++){
            for(int k=1;k<=c;k++){
                ll curr= i * j * k;
                // cout<<"for: " << curr<< " fact:" << fact[curr]<<endl;
                ans=(ans+fact[curr])%mod;
            }
          }
            
        }

        cout << ans << endl;



   

}



