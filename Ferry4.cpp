#include <iostream>
#include <vector>
#include <queue>
#include <string>
using namespace std;

static const int LEFT = 0;
static const int RIGHT = 1;

int main()
{   
    int c;
    cin >> c;
    while ( c-- )
    {
        int l, m;
        cin >> l >> m;
        l *= 100;

        vector<queue<int> > cars(2);
        for (int i = 0; i < m; ++i)
        {
            int length;
            string side;
            cin >> length >> side;
            if (side == "left")
                cars[LEFT].push(length);
            else
                cars[RIGHT].push(length);
        }

        int index = LEFT;
        int tra = 0;
        while(!(cars[LEFT].empty() && cars[RIGHT].empty()))
        {
            int totalLength = 0;
            while (! cars[index].empty()
                   && totalLength + cars[index].front()<=l)
            {
                totalLength += cars[index].front();
                cars[index].pop();
            }
            ++tra;
            index ^= 1;
        }
        cout << tra << endl;
    }
    return 0;
}
