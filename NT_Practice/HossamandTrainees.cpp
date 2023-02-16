#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int n=32000;
vector<bool> prime(n+1, true);
vector<int> sprime;

void sieve(){
    prime[0]=prime[1]=false;
    for(int i=2;i<=n;i++){
        if(prime[i]){
            sprime.push_back(i);
            for(int j=i*i;j<=n;j+=i){
                if(j%i==0){
                    prime[j]=false;
                }
            }
        }
    }

}

bool sol(vector<int> &v){
    unordered_map<int,int> map;
          for(int e:v){
            int curr=e;
            for(int j:sprime){
                if(curr%j==0){
                    if(map[j]){
                        return true;
                    }else{
                        while(curr%j==0) curr/=j;
                        map[j]=1;
                    }
                }
            }
            if(curr!=1){
                if(map[curr]){
                    return true;
                }else{
                    map[curr]=1;
                }
            }
          }
return false;

}


int main(){


     int t;
     cin >> t;
     sieve();
     while(t--){
         int n;
         cin >> n;  
         vector<int> v;
         for(int i=0 ; i<n ; i++){
             int temp;
             cin>>temp;
             v.push_back(temp);
          }

          if(sol(v)){
            cout<<"YES"<<endl;
          }else{
            cout<<"NO"<<endl;
          }

     }
   

}



