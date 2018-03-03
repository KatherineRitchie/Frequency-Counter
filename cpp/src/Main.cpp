//
// Created by Katherine Ritchie on 3/2/18.
//

#include "Main.h"

// 'Hello World!' program

#include <iostream>
#include<string>
using namespace std;
#include <map>
using namespace std;

int main();
std::string getUrlContentAsString(std::string *filename);
std::map<std::string, int>* analyseWordFrequency(std::map<std::string, int>, int numElements);
map<string, int>* textToCountMap(string textString);
map<string, int>* findMostPopular(map<string, int> unsortedMap, int numElements);
string findMaxKeyInMap(map<string, int> unsortedMap);
string mapToString(map<string, int> mostSeenMap);

int main()
{
    std::cout << "Hello World!" << std::endl;
    return 0;
}

string getUrlContentAsString(string *filename) {
    return "";
}

std::map<std::string, int>* analyseWordFrequency(std::map<std::string, int>, int numElements) {
    return new std::map<std::string, int>;
}

map<string, int>* textToCountMap(string textString) {
    return new map<string, int>;
}

map<string, int>* findMostPopular(map<string, int> unsortedMap, int numElements) {
    return new map<string,int>;
}

string findMaxKeyInMap(map<string, int> unsortedMap) {
    return "";
}

string mapToString(map<string, int> mostSeenMap) {

}
