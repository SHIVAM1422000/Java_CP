#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int n=1e5 ;
vector<bool> p(n+1,true);
vector<int> sprime;

void sieve(){
    p[0]=p[1]=false;
    for(int i=2;i*i<=n;i++){
        if(!p[i]) continue;
        sprime.push_back(i);
        for(int j=i*i;j<=n;j+=i) if(j%i==0) p[j]=false;
    }
}

int main(){


     sieve();
    //  cout<<"Sieve Generated: " << sprime.size() << endl;
     int l;
     cin >> l;
     int m=l-1;
     int ans[m];
     for(int i=0;i<m;i+=2){
        ans[i]=1;
     }

      int j=0;
     for(int i=1;i<m;i+=2){
        ans[i]=sprime[j++];
     }

    //  cout<<"Ans"<<endl;
     for(int i:ans) cout<<i<<" ";
     cout<<endl;

      

     }
   





