#include <bits/stdc++.h>
using namespace std;


bool cmp(int a,int b){
   if(a<b) return true;
   return false;
}

int main(){

   vector<int> v;
   int n;
   cin>>n;
   for(int i=0;i<n;i++){
      int temp;
      cin>>temp;
      v.push_back(temp);
   }

   sort(v.begin(),v.end(),[](int a,int b){if(a<b) return true; return false;});

   for(auto e:v) cout<< e <<"  ";
   

}

