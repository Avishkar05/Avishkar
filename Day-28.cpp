// Write a program to print ' Hello world' 1000 Times without using loop      
// day28
#include <iostream>
using namespace std;

void printHelloWorld(int n) {
    if (n <= 0) {
        return;
    }

    cout << "Hello  world" << endl;
    printHelloWorld(n - 1);
}

int main() {
    int times = 1000;
    printHelloWorld(times);

    return 0;
}
