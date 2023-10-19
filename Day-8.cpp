#include <iostream>

using namespace std;

int main() {
    int a, b;

    cout << "Enter the first number: ";
    cin >> a;

    cout << "Enter the second number: ";
    cin >> b;

    int max = (a > b) ? a : b;
    int min = (a < b) ? a : b;

    cout << "Maximum: " << max << endl;
    cout << "Minimum: " << min << endl;

    return 0;
}
