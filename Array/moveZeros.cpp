#include <iostream>
using namespace std;

int moveZeros(int *a, int n)
{
    int j = -1;
    for (int i = 0; i < n; i++)
    {
        if (a[i] == 0)
        {
            j = i;
            break;
        }
    }

    if (j == -1)
    {
        return;
    }

    for (int i = j + 1; i < n; i++)
    {
        if (a[i] != 0)
        {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            ++j;
        }
    }
}

int main()
{

    int arr[10] = {1, 0, 5, 5, 0, 7, 7, 0, 8, 9};
    int length = sizeof(arr) / sizeof(*arr);
    int result = moveZeros(arr, length);

    cout << "New array: " << result;
    return 0;
}

// Time Complexity: O(N)
// Space Complexity: O(1)
