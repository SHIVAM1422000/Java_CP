#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main(){


     int t;
     cin >> t;
     while(t--){
       
       int n;
       string s;
       cin>>n>>s;
       
       vector<bool> freq(n+1,false);

        
      ll count=0;
       for(int i=1;i<=n;i++){
        //remove this element
         if(s[i-1]=='0'){  
             for(int j=i;j<=n;j+=i){

                if(s[j-1]=='1') break;
                
                //if we have already remove this continue
                if(freq[j]==true) continue;

                //it's multiples needs to be removed
                 if(s[j-1]=='0'){
                    count+=i;
                    freq[j]=true;
                 }
             }
         }
       }


       cout << count << endl;

       


      

     }
   

}



