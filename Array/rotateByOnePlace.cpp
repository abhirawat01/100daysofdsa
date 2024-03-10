#include <iostream>
using namespace std;

void rotateOne(int *arr , int n) {
    int first=arr[0];

    for(int i=1;i<n;i++){
        arr[i-1]=arr[i];
    }
    arr[n-1]=first;
}

int main(){

    int arr[10] = {1,3,5,5,6,7,7,8,8,9};
    int length = sizeof(arr) / sizeof(*arr);
    rotateOne(arr, length);


    cout << "Rotated by one place array: " ;
    for(int i=0;i<length;i++){
        cout << arr[i] << " ";
    }
    return 0;
}

//Time complexity: O(N)
//Space complexity: O(1)