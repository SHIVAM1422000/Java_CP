#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main(){


     int t;
     cin >> t;
     unordered_set<string> set;
     while(t--){
         string s;
         cin >> s; 
         if(set.find(s)==set.end()){
            cout<<"OK"<<endl;
            set.insert(s);
         }else{
             for(int i=1;i<(1e5+1);i++){
                 string temp=s+i;
                 if(set.find(temp)==set.end()){
                    cout<<temp<<endl;
                    set.insert(temp);
                 }
                 
             }
         }


      

     }
   

}



