#include <iostream>
using namespace std;

int checksortedarray(int *a,int length){
    for(int i=1;i<length;i++){
        if(a[i]>=a[i-1]){

        }
        return false;
    }
    return true;
}

int main()
{

    int arr[10] = {5, 3, 4, 11, 9, 8, 8, 2, 7, 6};
    int length = sizeof(arr) / sizeof(*arr);

    cout << (checksortedarray(arr, length) ? "Array is Sorted" : "Array is not Sorted");
    return 0;
}

//Time complexity: O(N)
//Space complexity: O(1)