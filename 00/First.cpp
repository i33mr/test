#include <iostream>
using namespace std;
int main() {
	int size;
	cout << "Enter size of array: ";
	cin >> size;
	int A[size];
	cout << "Enter " << size << " integer(s): ";
	for (int i = 0; i < size; i++)
		cin >> A[i];
	cout << "You entered: ";
	for (int i = 0; i < size; i++)
		cout << A[i] << " ";
	cout << endl;
	int sum = 0;
	for (int i = 0; i < size; i++)
		sum += A[i];
	cout << "Sum of array = " << sum;
	}