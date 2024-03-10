#include <iostream>
using namespace std;

int secondLargest(int *list, int length)
{

    int largestNumber = list[0];
    int secondLargest;

    for (int i = 1; i < length; i++)
    {
        if (list[i] > largestNumber || list[i]>secondLargest)
        {
            if(list[i] < largestNumber && list[i]>secondLargest){
                secondLargest = list[i];
            }
            else{
                int temp = largestNumber;
                largestNumber = list[i];
                secondLargest = temp;
            }
        }
    }

    return secondLargest;
}

int main()
{

    int arr[10] = {5, 3, 4, 11, 9, 8, 8, 2, 7, 6};
    int length = sizeof(arr) / sizeof(*arr);
    int result = secondLargest(arr, length);

    cout << "The  Second Larhest Number in the array: " << result;
    return 0;
}