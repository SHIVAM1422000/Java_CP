#include <bits/stdc++.h>
using namespace std;
using ll = long long;


int getMinLength(vector<int> arr){

     int n=arr.size();
     int i=n-1;
     while(i-1>=0){
        if(arr[i]==arr[i-1]){
            arr[i-1]=0;
            arr[i]=-1;
            i-=2;
        }else{
            arr[i-1]=arr[i-1]%arr[i];
            arr[i]=-1;
            i-=1;
        }
     }

     int count=0;
     for(int e:arr) if(e!=-1) ++count;
     return count;

}

int main(){


     int t;
     cin >> t;
     while(t--){
         int n;
         cin >> n;  
         vector<int> v;
         for(int i=0 ; i<n ; i++){
             ll temp;
             cin>>temp;
             v.push_back(temp);
          }
     



        cout<< getMinLength(v);


      

     }
   

}



