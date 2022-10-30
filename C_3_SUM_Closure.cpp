#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main(){


     int t;
     cin >> t;
     while(t--){

         int n;
         cin >> n;  
         vector<int> v;
         unordered_set<int> set;
         int pos=0,neg=0;
         for(int i=0 ; i<n ; i++){
             ll temp;
             cin>>temp;
             cout<<"CURRENT ELEMENT: " << temp << endl;
             if(set.find(temp)==set.end()){
                v.push_back(temp);
                set.insert(temp);
             }
          }


if(pos>2 || neg>2) {
     cout<<"NO"<<endl;
     continue;
}

// cout<<"Yaha tak theek sab"<<endl;


          int s=v.size();
          bool flag=false;
          for(int i=0;i<s;i++){
           if(flag) break;
            for(int j=i+1;j<s;j++){
              if(flag) break;
                for(int k=j+1;k<s;k++){
                    int sum=v[i]+v[j]+v[k];
                    if(set.find(sum)!=set.end()){
                        flag=true;
                    }
                }
            }
          }

          if(flag) {
             cout<<"YES"<<endl;
          }else{
            cout<<"NO"<<endl;
          }

      

     }
   

}



