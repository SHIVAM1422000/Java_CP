#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main(){


     int t;
     cin >> t;
     while(t--){
         int n;
         cin >> n;  
         vector<int> v;

        if(n==3){
            cout<<-1<<endl;
            continue;;
        }


          int curr=n;
         for(int i=0 ; i<n ; i++){
               v[i]=curr;
               --curr;
          }

          if(n%2!=0){
             int mid=(n+1)/2;
             swap(v[mid],v[mid+1]);
          }

           for(int i:v) cout<<i<<" ";
             cout<<endl;

      

     }
   

}



