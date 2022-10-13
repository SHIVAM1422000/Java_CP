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
         for(int i=0 ; i<n ; i++){
             int temp;
             cin>>temp;
             v.push_back(temp);
          }


         bool flag=true;
         for(int i=0;i<n;i++){
              bool temp=false;
              for(int j=2;j<=i+2;j++){
                  if(v[i]%j){
                    temp=true;
                    break;
                  }
              }
             flag=(flag&temp);
         }

         if(flag){
            cout<<"YES"<<endl;
         }else{
            cout<<"NO"<<endl;
         }

      

     }
   

}



