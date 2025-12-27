#include <iostream>
using namespace std;

template <class T>
T arraySum(T arr[], int n) {
    T sum = 0;
    for (int i = 0; i < n; ++i) {
        sum += arr[i];
    }
    return sum;
}

int main() {
    int n;
    cin >> n;

    int* arr1 = new int[n];
    double* arr2 = new double[n];

    for (int i = 0; i < n; ++i)
        cin >> arr1[i];

    for (int i = 0; i < n; ++i)
        cin >> arr2[i];

    cout << arraySum(arr1, n) << endl;
    cout << arraySum(arr2, n);

    delete[] arr1;
    delete[] arr2;

    return 0;
}