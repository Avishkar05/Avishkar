#include <iostream>
#include <vector>

using namespace std;

void sortColors(vector<int>& nums) {
    int low = 0, mid = 0, high = nums.size() - 1;

    while (mid <= high) {
        if (nums[mid] == 0) {
            swap(nums[low], nums[mid]);
            low++;
            mid++;
        } else if (nums[mid] == 1) {
            mid++;
        } else {
            swap(nums[mid], nums[high]);
            high--;
        }
    }
}

int main() {
    vector<int> array = {2, 0, 1, 1, 0, 2};
    sortColors(array);

    for (int num : array) {
        cout << num << " ";
    }
    
    cout << endl; // This will print 0 0 1 1 2 2
    return 0;
}
