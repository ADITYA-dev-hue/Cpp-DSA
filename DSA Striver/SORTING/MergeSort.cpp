#include <iostream>
#include <vector>

using namespace std;

// Merges two sorted subarrays into one sorted section
void merge(vector<int>& arr, int low, int mid, int high) {
    vector<int> temp;
    int left = low;
    int right = mid + 1;

    // Compare elements from both halves and push the smaller one
    while (left <= mid && right <= high) {
        if (arr[left] <= arr[right]) {
            temp.push_back(arr[left]);
            left++;
        } else {
            temp.push_back(arr[right]);
            right++;
        }
    }

    // Copy any remaining elements from the left half
    while (left <= mid) {
        temp.push_back(arr[left]);
        left++;
    }

    // Copy any remaining elements from the right half
    while (right <= high) {
        temp.push_back(arr[right]);
        right++;
    }

    // Transfer sorted elements from temporary vector back to original array
    for (int i = low; i <= high; i++) {
        arr[i] = temp[i - low];
    }
}

// Recursive function to divide and sort the array
void mergeSort(vector<int>& arr, int low, int high) {
    if (low >= high) return; // Base case: 1 or 0 elements

    int mid = low + (high - low) / 2; // Prevents potential integer overflow

    mergeSort(arr, low, mid);       // Sort left half
    mergeSort(arr, mid + 1, high);  // Sort right half
    merge(arr, low, mid, high);     // Merge the sorted halves
}

int main() {
    vector<int> data = {38, 27, 43, 3, 9, 82, 10};
    
    cout << "Original array: ";
    for (int num : data) cout << num << " ";
    cout << "\n";

    mergeSort(data, 0, data.size() - 1);

    cout << "Sorted array:   ";
    for (int num : data) cout << num << " ";
    cout << "\n";

    return 0;
}
