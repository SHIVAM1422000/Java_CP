#include <bits/stdc++.h>
using namespace std;
using ll = long long;

vector<int> getDigits(ll n){
     vector<int> v;
     int idx=0;
     while(n>0){
        int last=n%10;
        n=n/10;
        v.push_back(last);
     }


reverse(v.begin(),v.end());
     return v;
}

int main(){


     int t;
     cin >> t;
     while(t--){
         ll n;
         cin >> n;
         vector<int> main=getDigits(n);
        //  for(int i:main) cout<<i<<" ";
        //  cout<<endl;

         int ans=main.size()+1;
         ll mask=1;
         int times=0;
         while(times<=60){
            //   cout<<"Current Mask: "<<mask<<endl;
              vector<int> curr=getDigits(mask);
              int n=main.size(),m=curr.size();
              int taken=0;
              int i=0,j=0;
              while(i<n && j<m){
                if(main[i]==curr[j]){
                    i++; j++; ++taken;
                }else{
                    ++i;
                }
              }

                int temp=n+m-(2*taken);
        // cout<<"Taken: "<<taken << "  :: Current Count:" <<temp<<endl;

               if(temp<ans){
                //  cout<<"Updating answer for: " << mask <<endl;
                 ans=temp;
                //  cout<<endl; 
               }
            //    cout<<endl;
              mask=mask<<1;
              ++times;
         }
    

cout<<ans<<endl;
         

     }
   

}



