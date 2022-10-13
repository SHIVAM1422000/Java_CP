#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main(){



         ll n;
         cin >> n;  
         vector<ll> v;
         for(int i=0 ; i<n ; i++){
             ll temp;
             cin>>temp;
             v.push_back(temp);
          }


         ll ans=1e18;
           
            //fix zero at i
          for(int i=0;i<n;i++){
               
                ll a[n];
                ll temp=0;
                a[i]=0;
             

               // on the left of i decrease 
               for(int j=i-1;j>=0;j--){
                         ll m=(a[j+1]/v[j]) + 1;
                         temp+=m;
                         a[j]=v[j]*m;
               }

               // on the right if i increase
               for(int j=i+1;j<n;j++){
                         ll m=(a[j-1]/v[j]) + 1;
                         temp+=m;
                         a[j]=v[j]*m;
               }

               

               ans=min(ans,temp);


          }

          cout<<ans<<endl;

      


   

}



