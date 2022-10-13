#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main(){


     int t;
     cin >> t;
     while(t--){
         ll a,b,c;
         cin>>a>>b>>c;
         
         ll sum=a+b+c;

         ll extra=sum/9;
        
         bool flag=true; 
        if(sum%9!=0 || a<extra || b<extra || c<extra) flag=false;



    if(flag) cout<<"YES"<<endl;
    else cout<<"NO"<<endl;


     }
   

}



