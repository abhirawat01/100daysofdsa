#include <iostream>
using namespace std;

int singleElement(int *arr, int n){
    for(int i=0;i<n;i++){
		if(i!=0 && arr[i]!=arr[i-1] && arr[i]!=arr[i+1]){
			return arr[i];
		}
	}
	return arr[0];
}

int main(){

    int arr[5] = {1,1,2,2,3};
    int n = sizeof(arr)/sizeof(arr[0]);

    int result = singleElement(arr,n);
    cout << "element is: "<< result;
    return 0;
}

//Time complexity: O(N)
//space complexity: O(1)