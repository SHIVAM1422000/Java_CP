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
         unordered_map<ll,int> map;
         for(int i=0 ; i<n ; i++){
             ll temp;
             cin>>temp;
             temp=temp%10;
             map[temp]=map[temp]+1;
          }

bool flag=false;
          for(int i=0;i<10;i++){
              if(flag) break;
             for(int j=0;j<10;j++){
                if(flag) break;
                for(int k=0;k<10;k++){
                     ll sum=i+j+k;
                     if(sum%10==3){
                         bool pi=false,pj=false,pk=false;
                         if(map[i]>0){
                            map[i]--;
                            pi=true;
                         }
                         if(map[j]>0){
                            map[j]--;
                            pj=true;
                         }
                         if(map[k]>0){
                            map[k]--;
                            pk=true;
                         }

                        if(pi) map[i]++; if(pj) map[j]++; if(pk) map[k]++;

                        if(pi && pj && pk){
                            cout<<"YES"<<endl;
                            flag=true;
                            break;
                        }
                     }
                }
             }
          }


          if(!flag){
            cout<<"NO"<<endl;
          }

      

     }
   

}



