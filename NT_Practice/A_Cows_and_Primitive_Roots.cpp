#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main()
{

    ll n;
    cin >> n;
    if (n == 3 || n == 2)
    {
        cout << 1 << endl;
    }
    else
    {

        for (int i = 2; i < n; i++)
        {
            ll curr = pow(i, n - 1);
            cout<<"Current No:" <<i << " H:" <<  (curr-1)<<endl;
            if ((curr - 1) % n == 0)
            {
                curr /= i;
                cout<<"Passed 1" << endl;
                bool flag = true;
                while (curr>0)
                {
                    cout<< " Sub Check  " << (curr-1) << endl;
                    if ((curr - 1) % n == 0)
                    {
                        cout<<"    Failed"<<endl;
                        flag = false;
                        break;
                    }
                    curr /= i;
                }
                if (flag)
                {
                    cout << i << endl;
                    break;
                }
            }
        }
    }
}
