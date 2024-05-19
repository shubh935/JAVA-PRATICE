 #include<iostream>
using namespace std;
int main()
{
    int arr[] = {37, 38, 45, 46, 55};

    int start = arr[0];
    int last = arr[4];
    int target = 37;
    int mid;
    while (start <= last)
    {
        mid = (start + last) / 2;
        if (target == arr[mid])
        {
            cout<<"Matches";
            return 0;
                }
        else if (target < arr[mid])
        {
            last = mid - 1;
        }
        else
        {
            start = mid + 1;
 }
    }
 
}