#include <iostream>
using namespace std;

void rotate(int *arr, int n, int k){

    int start = 0;
    int end = k;
    //first reverse arr[0] --> arr[k]
    for(int i=0; i<=k; i++){
        if (start <=end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end] = temp;
        }
        start++;
        end--;
    }

    //second reverse arr[n-k] --> arr[n]
    int start1 = n-k;
    int end1 = n-1;

    for(int i=n-k; i<n; i++){
        if (start1 <=end1){
            int temp = arr[start1];
            arr[start1]=arr[end1];
            arr[end1] = temp;
        }
        start1++;
        end1--;
    }

    //third reverse arr[0] --> arr[n]
    int start2 = 0;
    int end2 = n-1;
    for(int i=0; i<n; i++){
        if (start2 <=end2){
            int temp = arr[start2];
            arr[start2]=arr[end2];
            arr[end2] = temp;
        }
        start2++;
        end2--;
    }
}

int main(){
    int k;
    cin >> k;

    int arr[7] = {1,2,3,4,5,6,7};
    int length = sizeof(arr) / sizeof(*arr);
    rotate(arr, length, k);


    cout << "Rotated array by kth place: " ;
    for(int i=0;i<length;i++){
        cout << arr[i] << " ";
    }
    return 0;
}