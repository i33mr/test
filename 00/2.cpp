#include <iostream>
#include <vector>
using namespace std;
int main() {
	vector<string> words;
	string word;
	cout << "Enter 4 words: ";
	for (int i = 0; i < 4; i++){
		cin >> word; 
		words.push_back(word);
	}
	bool ascending = true;
	bool duplicate = false;
	for (int i = 0; i < 3; i++) {
		if (words[i] > words[i+1])
			ascending = false;
		if (words[i] == words[i+1])
			duplicate = true;
		}
		if (ascending)
			cout << "Words in ascending order\n";
		else
			cout << "Words not in ascending order\n";
		if (duplicate)
			cout<< "Got duplicated words\n";
		
		else
			cout << "No duplicated words\n";
		
		
		}
		
		
		