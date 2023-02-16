#include <bits/stdc++.h>
using namespace std;
using ll = long long;

class Triplet
{
public:
    ll x;
    ll y;
    ll gcd;
};

Triplet extendedEuclid(ll a, ll b)
{

    if (b > a)
        return extendedEuclid(b, a);

    if (b == 0)
    {
        Triplet ans;
        ans.gcd = a;
        ans.x = 1;
        ans.y = 0;
        return ans;
    }

    Triplet smallAns = extendedEuclid(b, a % b);
    Triplet ans;
    ans.gcd = smallAns.gcd;
    ans.x = smallAns.y;
    ans.y = smallAns.x - (a / b) * smallAns.y;
    return ans;
}

int main()
{

    ll a, b, c;
    cin >> a >> b >> c;




           cout<< "General : " << endl;
           Triplet eu = extendedEuclid(b, a);
           cout << "x: " << eu.y<< " y: " << eu.x<< " gcd: "  << eu.gcd << endl;
           if(eu.gcd%c!=0){
            cout<<"No" << endl;
           }else{
            cout<<"Will see" << endl;
           }

     

}
