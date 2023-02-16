#include <bits/stdc++.h>
using namespace std;
using ll = long long;



void sol(vector<bool> &vst, vector<vector<int>> &edge, int start,int parent,map<pair<int,int>,int> &map,bool even){
// cout<<"CALLING ON:" << start << endl;
    vst[start]=true;
    if(parent!=-1){
        pair<int,int> curr={min(parent,start), max(parent,start)};
        map[curr]= even ? 2 : 3;
        // cout<<"for pair: " <<  min(parent,start) << " & " << max(parent,start) << " : weight: " << map[curr];
        // cout<<endl;
    }
    for(int nei:edge[start]){
        if(!vst[nei]){
            vst[nei]=true;
            sol(vst,edge,nei,start,map,!even);
        }
    }




}

int main(){


     int t;
     cin >> t;
     while(t--){
         int n;
         cin >> n;
         vector<vector<int>> edge(n+1);
         vector<pair<int,int>> input;
         map<pair<int,int>,int> map;

        
         bool flag=true;
         for(int i=1;i<=n-1;i++){
            int v1,v2;
            cin>>v1>>v2;
            edge[v1].push_back(v2);
            edge[v2].push_back(v1);
            if(edge[v1].size()>2) flag=false;
            if(edge[v2].size()>2) flag=false;
            pair<int,int> curr={min(v1,v2),max(v1,v2)};
            map[curr]=-1;
            // cout<<"Pushing pair:" << curr.first << "&" << curr.second << "map[curr]: " << map[curr] << endl; 
            input.push_back(curr);
         }

         if(!flag){

            cout<<"-1"<<endl;
            continue;;
         }


        int start=-1;
        for(int i=1;i<=n;i++){
            if(edge[i].size()==1){
                start=i;
                break;
            }
        }

        vector<bool> vst(n+1,false);

        sol(vst,edge,start,-1,map,true);

        for(pair<int,int> p:input){
            cout<< map[p] << " " ;
        }
        cout<<endl;
         

      

     }
   

}



