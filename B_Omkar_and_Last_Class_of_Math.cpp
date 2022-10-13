#include <bits/stdc++.h>
using namespace std;
using ll = long long;



int main(){


     int t;
     cin >> t;
     while(t--){
         ll n;
         cin >> n;  
         
         bool flag=true;
 
         for(ll i=1;i*i<=n;i++){
           
                if(n%(i+1)==0){
 
                     ll ta=n/(i+1);
                     ll tb=ta*i;
                     cout<< ta <<" " << tb << endl;
                     flag=false;
                     break;
                     
                }
              
         }


         if(flag){
            cout<< 1 << " " << (n-1) << endl;
         }

    
      

     }
   

}



