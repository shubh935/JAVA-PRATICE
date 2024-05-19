#include<stdio.h>
#include<string.h>
//using namespace std;


class a
{

public:
    int a[6];
    void set()
     
  
{        std:: cout  << "ENter nu,mber = " << endl;
    for ( int i = 0; i < a.length; i++)
    {
       std::cin>>a[i];
    }
    for (int  i = 0; i < a.length; i++)
    {
        cout << a[i] << endl;
    }
    }
};

int main()
{
    a  b;
    b.set();
    return 0;
}   