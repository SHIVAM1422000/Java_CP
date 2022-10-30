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


          ll idx=1,count=0,ans=0;
          for(ll i=0;i<n;i++){
            cout<<"At Index: " << i << " curr element: "<< v[i] << "  , idx: " << idx<< endl;
              if(v[i]>=idx){
                cout<<"Taking into account :: ++count" << endl;
                ++count; ++idx;
              }else{
                ll t=((count*(count-1))/2);
                t+=count;
                ans+=t;
                 if(idx>1) --i; 
                 idx=1;
                 count=0;
                 cout<<"Reseting Params" << " , Current ans: " << t << endl;
              }

          }

  ll t=((count*(count-1))/2);
                t+=count;
                 ans+=t;
 cout<<"Reseting Params" << " , Current ans: " << t << endl;


          cout<<ans<<endl;

      

     }
   

}



