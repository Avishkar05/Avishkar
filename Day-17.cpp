/*
Find the most frequent element in an array Using Hash Table
*/
#include <iostream>
#include <vector>
#include <unordered_map>

using namespace std;

int findMostFrequentElement(vector<int>& nums) {
    unordered_map<int, int> freqMap;

    for (int num : nums) {
        freqMap[num]++;
    }

    int mostFrequentElement = nums[0];
    int maxFrequency = freqMap[nums[0]];

    for (int num : nums) {
        if (freqMap[num] > maxFrequency) {
            mostFrequentElement = num;
            maxFrequency = freqMap[num];
        }
    }

    return mostFrequentElement;
}

int main() {
    vector<int> nums = {1, 3, 4, 2, 2, 3, 3, 4, 4, 4};
    int mostFrequent = findMostFrequentElement(nums);
    cout << "The most frequent element in the array is: " << mostFrequent << endl;
    return 0;
}
