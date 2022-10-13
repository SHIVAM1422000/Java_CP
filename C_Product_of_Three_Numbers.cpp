#include <bits/stdc++.h>
using namespace std;
using ll = long long;


ll N=1e9;
vector<bool> p(N+1,true);
void sieve(){

    p[0]=p[1]=false;
    for(ll i=2;i<=N;i++){
        if(p[i]==false) continue;
        for(ll j=i*i;j<=N;j+=i){
            p[j]=false;
        }
    }
    
}

int main()
{


     int t;
     cin >> t;
     while(t--)
     {

         ll n;
         cin >> n;  


   // first we break n into two parts :-  i & n/i

   //in the second step we break n/i into two parts:-  j & n/ij


//    At last we mutliply:- i * j * (n/(i*j))

   

         ll a=-1,b=-1,c=-1;
         for(ll i=2;i*i<=n;i++)
         {

             if(n%i==0){ 
                n/=i;
                if(a==-1){
                    a=i;
                }else{
                    b=i;
                    break;
                }
             }
                    
         }



         if(a!=-1 && b!=-1 && n>b){
            cout<<"YES"<<endl;
            cout<<a<<" "<<b<<" "<<n<<endl;
         }else{
            cout<<"NO"<<endl;
         }   

          
         
     }

      
}
   





