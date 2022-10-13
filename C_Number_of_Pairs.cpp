#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main(){

 

     int t;
     cin >> t;
     while(t--){
         int n;
         long long l,r;
         cin>>n>>l>>r;
         long long arr[n];
         for(int i=0;i<n;i++){
             cin>>arr[i];
         }
         
        sort(arr,arr+n);


        
        long long ans=0;
        for(int i=0;i<n;i++){
            ll low=lower_bound(arr,arr+n,l-arr[i])-arr;
            ll high=upper_bound(arr,arr+n,r-arr[i])-arr;
    
            if(high>low) ans+=(high-low);
             // check if i is also counted in the upper & lower bounds
             if(l<=2*arr[i] && 2*arr[i]<=r) --ans;
        }

        cout<< (ans/2) << endl;

     }
   

}

