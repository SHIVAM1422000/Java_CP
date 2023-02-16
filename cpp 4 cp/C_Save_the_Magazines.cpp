#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main(){


     int t;
     cin >> t;
     while(t--){
         int n;
         cin >> n;  
         cin.ignore();
         vector<int> v;
         string str;
         getline(cin,str);
         for(int i=0 ; i<n ; i++){
             int temp;
             cin>>temp;
             v.push_back(temp);
          }


        int i=0;
        ll ans=0;
        if(str[i]=='1'){
            ans+=v[i];
            ++i;
        }

         while(i<n){
            if(str[i]=='0'){
                int j=i+1,cmin=v[i];
                ll sum=v[i];
                while(j<n && str[j]=='1'){
                    cmin=min(cmin,v[j]);
                    sum+=v[j];
                    ++j;
                }
                
                ans+=(sum-cmin);
                i=j;

            }else{
                ans+=v[i];
                ++i;
            }
         }


 
                cout<<ans<<endl;


      

     }
   

}



