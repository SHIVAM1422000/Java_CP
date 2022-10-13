#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main(){

string s;
cin>>s;

char c[s.size()];
for(int i=0;i<s.size();i++) c[i]=s[i];

int n=s.size();
int last=c[n-1]-'0';
bool flag=false;
for(int i=0;i<n-1;i++){
    int curr=c[i]-'0';
    if(curr%2==0 && curr<last){
         flag=true;
         swap(c[i],c[n-1]);
         break;
    }
}

if(!flag){
    for(int i=n-2;i>=0;i--){
         int curr=c[i]-'0';
         if(curr%2==0){
            swap(c[i],c[n-1]);
            flag=true;
            break;
         }
    }
}

if(flag){
    for(char e:c) cout<<e;
    cout<<endl;
}else{
    cout<<"-1"<<endl;
}

   

}



