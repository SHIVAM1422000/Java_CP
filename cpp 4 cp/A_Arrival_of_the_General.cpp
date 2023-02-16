#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main(){


 
         int n;
         cin >> n;  
         vector<ll> v;
         for(int i=0 ; i<n ; i++){
             ll temp;
             cin>>temp;
             v.push_back(temp);
          }


          int mini=-1,maxi=-1;
          ll min=1000,max=-1;

          for(int i=0;i<n;i++){
            if(v[i]<=min){
                min=v[i];
                mini=i;
            }

            if(v[i]>max){
                max=v[i];
                maxi=i;
            }

          }

/**
cout<<"Came out of loop" << endl;
cout<<"mini: " << mini << "  maxi:" << maxi <<endl;
cout<<"Min Element: " << min  <<  " , Max Element: "  << max<<endl;
*/
        
         int maxidx=n-1;
        ll ans=(maxidx-mini)+(maxi);
       
        if(mini<maxi && v[mini]!=v[maxi]){
                // cout<<"Fall into this case:"<<endl;
                --ans;
          }


        if(v[mini]==v[maxi]){
            cout<<0<<endl;
        }else{
            cout<<ans<<endl;
        }
          
      

     
   

}



