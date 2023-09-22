/*program to Give an array containing n district number take from 0, 1,2,...... n,where one number is missing and one number is repeating. Find both the missing and repeating number array ={313}*/
#include <iostream>
#include <vector>

using namespace std;

void findMissingAndRepeating(vector<int>& nums) {
    int n = nums.size();
    vector<int> count(n + 1, 0);

    int missing, repeating;

    for (int i = 0; i < n; i++) {
        count[nums[i]]++;
    }

    for (int i = 1; i <= n; i++) {
        if (count[i] == 0) {
            missing = i;
        } else if (count[i] == 2) {
            repeating = i;
        }
    }

    cout << "Missing number: " << missing << endl;
    cout << "Repeating number: " << repeating << endl;
}

int main() {
    vector<int> arr = {0, 1, 2, 3, 4, 5, 6, 7, 7}; // Replace this with your array

    findMissingAndRepeating(arr);

    return 0;
}
