#include <iostream>
using namespace std;

int consecutiveOnes(int *arr, int n)
{
    int max = 0;
    int count = 0;
    for (int i = 0; i < n; i++)
    {
        if (arr[i] == 1)
        {
            count++;
            if (count > max)
            {
                max = count;
            }
        }
        else
        {
            count = 0;
        }
    }
    return max;
}

int main()
{
    
    int arr[10] = {0,1,1,1,0,1,1,1,1,0};
    int length = sizeof(arr) / sizeof(*arr);
    int result = consecutiveOnes(arr, length);

    cout << "Maximum Ones: " <<  result;
    return 0;
}

//Time complexity: O(N)
//Space complexity: O(1)