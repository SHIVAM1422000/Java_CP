#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main(){


     int t;
     cin >> t;
     while(t--){
         string str1,
         int n,k;
         cin >> n >> k; 
         cin >> str; 

         int arr[n];
         arr[0]=(str[0]=='1')?1:0;
         for(int i=1;i<n;i++){
            arr[i]=arr[i-1];
            if(s[i]=='1'){
                arr[i]++;
            }
         }


int ans=0;
         for(int i=0;i<str.length;i++){
            if(str.charAt(i)=='1') continue;
            boolean flag=true;
            if(i==0){
                if(i-k>=0 && arr[i]!=arr[i-k]) ++ans;
            }else if(i==n-1){
                if(i+k<n && arr[i]==arr[i+k]) ++ans; 
            }else{

            }
            
         }

cout<<ans<<endl;

      

     }
   

}



