#include <iostream>
using namespace std;

void N_print(int i)
{
    if (i > 10)
    {
        return;
    }
    cout << i << endl;
    i++;
    
    N_print(i);
}
int main(){
    int i=0;
    N_print(i);
}