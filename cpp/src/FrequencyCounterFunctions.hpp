//
// Created by Katherine Ritchie on 3/6/18.
//

#ifndef CPP_FREQUENCYCOUNTERFUNCTIONS_H
#define CPP_FREQUENCYCOUNTERFUNCTIONS_H

#endif //CPP_FREQUENCYCOUNTERFUNCTIONS_H

#include <iostream>
#include <map>
#include <cctype>
using namespace std;

string AnalyseWordFreq(int argc, char* argv[], int num_elements);
map<string, int> ArrToFreqMap(int argc, char **argv);
string MostFreqToString(map<string, int> word_freq_map, int num_elements);
string FindMaxKeyInMap(map<string, int> unsorted_map);
