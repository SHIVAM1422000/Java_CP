#include <bits/stdc++.h>
using namespace std;
using ll = long long;



int main(){


    
         int n,m;
         cin >> n >> m;  
         vector<ll> arr;
         vector<ll> v;
         for(int i=0 ; i<n ; i++){
             ll temp;
             cin>>temp;
             arr.push_back(temp);
          }

          sort(arr.begin(),arr.end());
          ll maxv=LONG_LONG_MIN;

          for(int i=0 ; i<m ; i++){
             ll temp;
             cin>>temp;
             v.push_back(temp);
             maxv=max(maxv,temp);
          }


           vector<int> ans;
          for(int x:v){

           
            auto it=upper_bound(arr.begin(), arr.end(), x);
            
                int t=it-arr.begin();
                ans.push_back(t); 
       

          }

          for(int i:ans){
            cout<<i<<" ";
          }
          cout<<endl;

      

     }
   





