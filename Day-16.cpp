/*
Detect whether a singly linked list contains a cycle (loop) or not. If a cycle is present, return true; otherwise, return false. Detect whether a singly linked list contains a cycle (loop) or not. If a cycle is present, return true; otherwise, return false.
*/
#include <iostream>
#include <unordered_set>

using namespace std;

// Definition for singly-linked list.
struct ListNode {
    int val;
    ListNode* next;
    ListNode(int x) : val(x), next(nullptr) {}
};

bool hasCycle(ListNode* head) {
    ListNode* tortoise = head;
    ListNode* hare = head;

    while (hare != nullptr && hare->next != nullptr) {
        tortoise = tortoise->next;      // Move one step
        hare = hare->next->next;        // Move two steps

        if (tortoise == hare) {
            // If the two pointers meet, there is a cycle
            return true;
        }
    }

    // If the hare reaches the end, there is no cycle
    return false;
}

int main() {
    // Create a linked list with a cycle
    ListNode* head = new ListNode(1);
    head->next = new ListNode(2);
    head->next->next = new ListNode(3);
    head->next->next->next = head;  // Create a cycle

    bool hasCycleResult = hasCycle(head);
    cout << "Does the linked list have a cycle? " << (hasCycleResult ? "Yes" : "No") << endl;

    // Clean up the linked list to prevent memory leaks
    delete head->next->next;
    delete head->next;
    delete head;

    return 0;
}
