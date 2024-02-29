#include <iostream>
using namespace std;

int largest(int *a,int length)
{

    int largest = a[0];

    for(int i = 1; i < length; i++){
        if (a[i] > largest){
            largest = a[i];
        }
    }

    return largest;
}

int main()
{

    int arr[10] = {5, 3, 4, 1, 9, 8, 0, 2, 7, 6};
    int length = sizeof(arr) / sizeof(*arr);
    int result = largest(arr, length);

    cout << "The Larhest Number in the array: " <<  result;
    return 0;
}

//Time complexity: O(N)
//Space complexity: O(1)