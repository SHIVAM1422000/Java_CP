#include <bits/stdc++.h>
 
using namespace std;
 
typedef long long ll;
map<ll,ll>p1,p2;
int main()
{
	ll n,x;
	cin>>n;
	while(n--){
		string s;
		cin>>s>>x;
		if(s=="+")p1[x]=1;
		else{
			while(p1[p2[x]+x])p2[x]+=x;
			cout<<p2[x]+x<<endl;
		}
	}
	return 0;
}
 