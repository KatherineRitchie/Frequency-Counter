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
std::string getUrlContentAsString(std::string filename);
string analyseWordFrequency(string, int numElements);
map<string, int> textToCountMap(string textString);
map<string, int> findMostPopular(map<string, int> unsortedMap, int numElements);
string findMaxKeyInMap(map<string, int> unsortedMap);
string mapToString(map<string, int> mostSeenMap);

int main()
{
    string textString = "this this this is a string strign";
    std::cout << "Hello World!" << std::endl;

    std::cout << analyseWordFrequency(textString, 10) << std::endl;
    return 0;

}

string getUrlContentAsString(string filename) {
    return "";
    
}

string analyseWordFrequency(string textString, int numElements) {
    map<string, int> unsortedCountMap = textToCountMap(textString);
    map<string, int> mostPopularMap = findMostPopular(unsortedCountMap, numElements);
    string resultsString = mapToString(mostPopularMap);
    return resultsString;
}

map<string, int> textToCountMap(string textString) {
    map<string, int> resultMap;
    resultMap.insert(std::pair<string, int>("test string", 5));
    return resultMap;
}

map<string, int> findMostPopular(map<string, int> unsortedMap, int numElements) {
    map<string, int> resultMap;
    resultMap.insert(std::pair<string, int>("test string", 5));
    return resultMap;
}

string findMaxKeyInMap(map<string, int> unsortedMap) {
    return "";
}

string mapToString(map<string, int> mostSeenMap) {
    return string("blank");
}
