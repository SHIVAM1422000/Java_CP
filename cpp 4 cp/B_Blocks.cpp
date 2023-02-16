#include <bits/stdc++.h>
using namespace std;
using ll = long long;


void change(int i,string &s){
    if(s[i]=='B') s[i]='W';
    else s[i]='B';
}

void print(vector<int> &ans){
     cout<<ans.size()<<endl;
     for(int i:ans) cout<<i << " ";
     cout<<endl;
}

int main(){


         int n;
         cin >> n;
         string str;
         cin >> str;  

         int black=0,white=0;
         vector<int> bloc;
         vector<int> wloc;

         for(int i=0;i<n;i++){
            if(str[i]=='W'){
                white++;
                wloc.push_back(i);
            }else{
                black++;
                bloc.push_back(i);
            }
         } 

        bool same=false;
        if(bloc.size()==n || wloc.size()==n) same=true;
        vector<int> ans;

         if(black%2==0 && !same){

            for(int i=0;i<bloc.size();i=i+2){
                 for(int j=bloc[i];j<bloc[(i+1)];j++){
                    ans.push_back(j+1);
                    change(j,str);
                    change(j+1,str);
                 }
            }

            print(ans);


         }else if(white%2==0 && !same){

               for(int i=0;i<wloc.size();i=i+2){
                 for(int j=wloc[i];j<wloc[(i+1)];j++){
                    ans.push_back(j+1);
                    change(j,str);
                    change(j+1,str);
                 }
            }

            print(ans);

         }else if(same){
            cout<<0;
         }else{
            cout<<-1;
         }

cout<<endl;
// cout<< "My String : " << str<<endl;

}



