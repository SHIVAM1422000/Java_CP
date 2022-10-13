#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main(){


     int t;
     cin >> t;
     while(t--){
         int n,k;
         cin >> n >> k; 
         cin.ignore();
         set<int> set1,set2;
         string s;
         getline(cin,s);

         for(int i=0 ; i<s.size(); i++){
             if(s[i]=='1'){ 
                set1.insert(-i);
                set2.insert(i);
                }
          }


          int ans=0;

/**

cout<<"Initial"<<endl;
for(auto et:set1) cout<<et<<" ";
cout<<endl;
for(auto et:set2) cout<<et<<" ";
cout<<endl;
cout<<endl;

**/


          for(int i=0;i<n;i++)
          {
             if(s[i]=='1') continue;
              int ul=i+k;
              int ll=i-k;
             
              
              auto lit=set1.upper_bound(-i);
              auto uit=set2.upper_bound(i);
              int lidx=(lit!=set1.end()) ? (*lit)*-1 : -1;
              int uidx=(uit!=set2.end()) ? (*uit) : -1;
            //   cout<<"Index: "<< i<< " lidx: " << lidx << "  uidx: " << uidx << endl;
              bool flag=true;


              if(lidx==-1 || lidx<ll) flag=flag&true;
              else flag=flag&false;

              if(uidx==-1 || uidx>ul) flag=flag&true;
              else flag=flag&false;


              if(flag){
                  s[i]='1';
                  ++ans;
                set1.insert(-i);
                set2.insert(i);
              } 
 

          }


      cout<< ans << endl;



     }
   

}



