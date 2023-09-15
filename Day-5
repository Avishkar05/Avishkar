#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter the number of elements in the array: ";
    cin >> n;

    if (n < 2) {
        cout << "The array should have at least two elements to find the second largest." << endl;
        return 1;
    }

    int largest = INT_MIN;
    int secondLargest = INT_MIN;

    int num;
    for (int i = 0; i < n; i++) {
        cout << "Enter element " << i + 1 << ": ";
        cin >> num;

        if (num > largest) {
            secondLargest = largest;
            largest = num;
        } else if (num > secondLargest && num != largest) {
            secondLargest = num;
        }
    }

    if (secondLargest != INT_MIN) {
        cout << "The second largest element is: " << secondLargest << endl;
    } else {
        cout << "There is no second largest element in the array." << endl;
    }
    return 0;
}
