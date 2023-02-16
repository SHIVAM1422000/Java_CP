#include <bits/stdc++.h>
using namespace std;
using ll = long long;

bool sol(vector<ll> &v){
          
          for(int i=1;i<v.size();i++){
            if(v[i-1]!=v[i]) return false;
          }

          return true;
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

         
         for(int i=0;i<n;i++){
            ll curr=v[i];
            while(curr%2==0) curr/=2;
            while(curr%3==0) curr/=3;
            v[i]=curr;
         }
           


          if(sol(v)){
            cout<<"Yes"<<endl;
          }else{
            cout<<"No"<<endl;
          }

      

   

}



