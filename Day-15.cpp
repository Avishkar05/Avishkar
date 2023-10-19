/*
Given an array having both positive and negative integers.Find length of the largest subarray with sum o array = {15, -2, 2, -8, 1, 7, 10, 23]
*/#include <iostream>
#include <vector>
#include <unordered_map>

using namespace std;

int findMaxLength(vector<int>& nums) {
    unordered_map<int, int> sumToIndex;
    int maxLength = 0;
    int sum = 0;

    for (int i = 0; i < nums.size(); i++) {
        sum += nums[i];

        if (sum == 0) {
            maxLength = i + 1;
        } else if (sumToIndex.find(sum) != sumToIndex.end()) {
            maxLength = max(maxLength, i - sumToIndex[sum]);
        } else {
            sumToIndex[sum] = i;
        }
    }

    return maxLength;
}

int main() {
    vector<int> nums = {15, -2, 2, -8, 1, 7, 10, 23};
    int result = findMaxLength(nums);
    cout << "Length of the largest subarray with a sum of 0: " << result << endl;
    return 0;
}
