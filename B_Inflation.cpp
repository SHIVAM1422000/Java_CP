#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main(){

 

     int t;
     cin >> t;
     while(t--){
         int n,k;
         cin>>n>>k;
         vector<ll> v;
         for(int i=0;i<n;i++){
            int temp;
            cin>>temp;
            v.push_back(temp);
         }

         for(auto i:v) cout<<i<<" ";
         cout<<endl;

         ll sum=0;
         ll ans=0;

          long double ratio=(k*1.0)/100;
          cout<<"Req Ratio: " << ratio << endl;
          cout<<endl;

         for(int i=1;i<n;i++){
            cout<<"Index: " << i <<endl;
             sum+=v[i-1];
            cout<< "sum:: " << sum<<endl;
            
              long double curr=(v[i]*1.0000000)/sum;
             cout<< "curr: " << curr<< endl; 
             if(curr>ratio){
                 cout<<"Need for change";
                 long double change=(v[i]*1.0)/ratio;
                 ll temp=ceil(change);
                 cout<<"New Sum: " <<temp<<endl;
                 ans+=(temp-sum);
                 sum=temp;
             }else{
                cout<<" Ok Ration, move on..!!" << endl; 
             }

             cout<<endl;

         }

         cout<<ans<<endl;
        

     }
   

}

