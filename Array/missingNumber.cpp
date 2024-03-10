#include <iostream>
using namespace std;

int missingNumber(int *arr, int n) {
    int naturalsum = (n*(n+1))/2;
    int sum = 0;
    for(int i=0;i<n;i++){
            sum+=arr[i];
    }

    return naturalsum-sum;
}

int main(){

    int ele;
    cin >> ele;

    int arr[9] = {9,0,1,7,3,5,2,4,5};
    int length = sizeof(arr) / sizeof(*arr);
    int result = missingNumber(arr,length);

    cout << " Missing element in the array: " << result;
    return 0;
}

//Time complexity: O(N)
//Space complexity: O(1)
   
    
