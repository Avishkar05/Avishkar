#include <iostream>
using namespace std; 
int main() {
    
    // Define a constant integer
    const int myConstant = 5;

    // Attempting to change the value of the constant will result in a compilation error
    // Uncommenting the line below will result in an error.
    //myConstant = 10;

    cout << "The value of myConstant is: " << myConstant << endl;

    return 0;

}
