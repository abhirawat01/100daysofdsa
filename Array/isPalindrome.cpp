#include <iostream>
#include <string>
#include <cctype>
using namespace std;

bool isPalindrome(string s) {

        if(s.empty()){
            return true;
        }

        std::string modifiedString;
        for (char c : s) {
            if (isalnum(c)) {
                modifiedString += tolower(c);
            }
        }

        // Use two pointers approach to check palindrome
        int left = 0, right = modifiedString.length() - 1;
        while (left < right) {
            if (modifiedString[left] != modifiedString[right]) {
                return false;
            }
            ++left;
            --right;
        }

        return true;
    }

int main(){

    string s;
    cout << "Enter your String: " << endl;
    cin >> s;

    bool result = isPalindrome(s);
    cout << result ;
}