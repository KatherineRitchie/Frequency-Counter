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
#include <sstream>
using namespace std;

int main(int argc, char* argv[]);
string analyseWordFrequency(int argc, char* argv[], int numElements);
map<string, int> arrToCountMap(int argc, char* argv[]);
map<string, int> findMostPopular(map<string, int> unsortedMap, int numElements);
string findMaxKeyInMap(map<string, int> unsortedMap);
string mapToString(map<string, int> mostSeenMap);

int main(int argc, char* argv[])
{
    string textString = "this this this is a string strign";
    std::cout << "Hello World!" << std::endl;

    std::cout << argc << std::endl;
    for (int i = 0; i < argc; i++) {
        std::cout << argv[i] << std::endl;
    }

    std::cout << analyseWordFrequency(argc, argv, 10) << std::endl;
    return 0;

}

string analyseWordFrequency(int argc, char* argv[], int numElements) {
    string textString = "dfghjk";
    map<string, int> unsortedCountMap = arrToCountMap(argc, argv);
    for(auto elem : unsortedCountMap)
    {
        std::cout << elem.first << " " << elem.second << " " << std::endl;
    }
    std::cout << "max key in map is: " << findMaxKeyInMap(unsortedCountMap) << std::endl;
    map<string, int> mostPopularMap = findMostPopular(unsortedCountMap, numElements);
    string resultsString = mapToString(mostPopularMap);
    return resultsString;
}

map<string, int> arrToCountMap(int argc, char* argv[]) {
    map<string, int> resultMap;
    for (int i = 0; i < argc; i++) {
        if (resultMap.count(argv[i])) {
            int currentVal = resultMap.at(argv[i]);
            resultMap.at(argv[i]) = currentVal + 1;
        } else {
            resultMap.emplace(argv[i], 1);
        }
    }
    return resultMap;
}

map<string, int> findMostPopular(map<string, int> unsortedMap, int numElements) {
    map<string, int> resultMap;
    resultMap.insert(std::pair<string, int>("test string", 5));
    return resultMap;
}

string findMaxKeyInMap(map<string, int> unsortedMap) {
    string maxKeyThusFar = "";
    int maxValThusFar = 0;
    for (auto elem : unsortedMap) {
        if (elem.second > maxValThusFar) {
            maxKeyThusFar = elem.first;
            maxValThusFar = elem.second;
        }
    }
    return maxKeyThusFar;
}

string mapToString(map<string, int> mostSeenMap) {
    return string("blank");
}
