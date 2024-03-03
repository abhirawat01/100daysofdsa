#include <iostream>
using namespace std;

int removeDuplicate(int *arr , int num , int n) {
    for(int i=0;i<n;i++){
        if(arr[i]==num){
            return i;
        }
    }
    return -1;
}

int main(){

    int ele;
    cin >> ele;

    int arr[10] = {1,3,5,5,6,7,7,8,8,9};
    int length = sizeof(arr) / sizeof(*arr);
    int result = removeDuplicate(arr, ele, length);

    cout << "element in the array: " << result;
    return 0;
}
   
    
