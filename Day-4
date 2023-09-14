#include <iostream>
using namespace std;

int main() 
{
    cout << "Enter a string: ";
    string inputString;
    cin >> inputString;

    int length = inputString.length();
    bool isPalindrome = true;

    for (int i = 0; i < length / 2; i++) {
        if (inputString[i] != inputString[length - i - 1]) {
            isPalindrome = false;
            break;
        }
    }

    if (isPalindrome) {
        cout << "The string is a palindrome." << endl;
    } else {
        cout << "The string is not a palindrome." << endl;
    }

    return 0;
}
