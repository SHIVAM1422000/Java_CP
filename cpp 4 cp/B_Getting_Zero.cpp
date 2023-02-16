#include <bits/stdc++.h>
using namespace std;
using ll = long long;


ll getmin(ll n){
       
       ll mina=15;

          for(ll add=0;add<=15;add++){
             for(ll mul=0;mul<=15;mul++ ){
                    ll nn=(n+add)*(pow(2,mul));
                    if(nn%32768==0){
                        mina=min(mina,(add+mul));
                    }
            }
          }


          return mina;
}


int main(){



         int n;
         cin >> n;  
         vector<ll> v;
         for(int i=0 ; i<n ; i++){
             ll temp;
             cin>>temp;
             v.push_back(temp);
          }

          
        for(ll i:v){
            cout<<getmin(i)<<" ";
        }

        cout<<endl;
      

   

}



