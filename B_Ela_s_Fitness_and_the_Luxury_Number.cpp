#include <bits/stdc++.h>
using namespace std;
using ll = long long;

vector<ll> arr;
vector<ll> count;

void gen(){
     
     for(ll i=1;i<=1e9;i++){
         arr.push_back(i*i);
     }

     int last=0;
     ll count=0;
     count[0]=0;
     for(int i=1;i<arr.size();i++){
         count[i]=(arr[i]-l)/i;
         last=arr[i];
      } 

}


int main(){


     int t;
     cin >> t


     while(t--){
         ll l,r;
         cin >> l >> r;  
         vector<ll> v;

         auto ubl=upper_bound(arr.begin(),arr.end(),l);
         auto ubr=upper_bound(arr.begin(),arr.end(),r);

         
   


      

     }
   

}



