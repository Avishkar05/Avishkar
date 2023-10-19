/*
Write a Program to check if given number is a Armstrong Number
*/
#include <iostream>
#include <cmath>

using namespace std;

bool isArmstrongNumber(int number) {
    int originalNumber = number;
    int numDigits = 0;
    int sum = 0;

    // Count the number of digits
    while (number > 0) {
        numDigits++;
        number /= 10;
    }

    number = originalNumber; // Reset number to its original value

    // Calculate the sum of digits raised to the power of numDigits
    while (number > 0) {
        int digit = number % 10;
        sum += pow(digit, numDigits);
        number /= 10;
    }

    // Check if the sum is equal to the original number
    return sum == originalNumber;
}

int main() {
    int number;
    cout << "Enter a number: ";
    cin >> number;

    if (isArmstrongNumber(number)) {
        cout << number << " is an Armstrong number." << endl;
    } else {
        cout << number << " is not an Armstrong number." << endl;
    }

    return 0;
}
