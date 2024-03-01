#include <iostream>
using namespace std;

int removeDuplicate(int nums[] , int n) {
        int i=0;
        for(int j=0;j<n;j++){
            if(nums[j]!=nums[i]){
                nums[i+1]=nums[j];
                i++;
            }
        }

        return (i+1);
}

int main(){

    int arr[10] = {1,3,5,5,6,7,7,8,8,9};
    int length = sizeof(arr) / sizeof(*arr);
    int result = removeDuplicate(arr, length);

    cout << "Non-Duplicate element in the array: " << result;
    return 0;
}

//Time complexity: O(N)
//Space complexity: O(1)