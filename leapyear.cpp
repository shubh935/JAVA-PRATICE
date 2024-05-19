#include <iostream>
using namespace std;

// program  of leapyear

int main()
{
    int year;
    cout << "Emter year :  " ;
    cin >> year;
    if (year % 400 == 0)
    {
        cout << year << " is  leap year " << endl;
    }

    else if (year % 4 == 0 && year % 100 != 0)
    {
        cout << year << "  leap yaer " << endl;
    }

    else
    {
        cout << year << " is not a leap year";
    }
    
}