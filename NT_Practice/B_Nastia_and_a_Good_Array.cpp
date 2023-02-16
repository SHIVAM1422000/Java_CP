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

          int idx=0,min=v[0];
          for(int i=0;i<n;i++){
            if(v[i]<min){
                idx=i;
                min=v[i];
            }
          }

        vector<vector<int>> ans;
        int l=idx-1,el=min+1;
        while(l>=0){
            ans.push_back(vector<int>{idx+1,l+1,min,el});
            v[l]=el;
            ++el; --l;
        } 


        int r=idx+1,er=min+1;
        while(r<n){
             ans.push_back(vector<int>{idx+1,r+1,min,er});
            v[r]=er;
            ++er; ++r;
        }   


    cout<<ans.size()<<endl;
    for(vector<int> i:ans){
        for(int j:i) cout<<j<<" ";
        cout<<endl;
    }

/**
 * 
    cout<<"Final Array:" << endl;
    for(int i:v) cout<<i << " ";
    cout<<endl;      
*/

     }
   

}



