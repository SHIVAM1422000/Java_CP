#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main(){


     ll n,k;
     cin >> n >> k;

     ll dp[n+1][k+1];
     for(int i=0;i<=n;i++){
        for(int j=0;j<=k;j++){
            if(j==1){
                dp[i][j]=1;
            }else{
                dp[i][j]=0;
            }
        }
     }

 ll mod=1e9+7;

    //  for(int i=1;i<=n;i++){
    //     for(int j=2;j<=k;j++){
    //         for(int d1=1;d1*d1<=i;d1++){
    //             if(i%d1==0){
    //                 int d2=i/d1;
    //                 if(d1==d2){
    //                     dp[i][j]=(dp[i][j]+dp[d1][j-1])%mod;
    //                 }else{
    //                     dp[i][j]=(dp[i][j]+dp[d1][j-1])%mod;
    //                     dp[i][j]=(dp[i][j]+dp[d2][j-1])%mod;
    //                 }
    //             }
    //         }
    //     }
    //  }


    for(int l=1;l<=k;l++){
        for(int i=1;i<=n;i++){
            for(int d=i;d<=n;d+=i){
                dp[d][l]=(dp[d][l]+dp[i][l-1])%mod;
            }
        }
    }


     ll ans=0;
     for(int i=1;i<=n;i++) ans=(ans+dp[i][k])%mod;
     cout<<ans<<endl;
   

}



