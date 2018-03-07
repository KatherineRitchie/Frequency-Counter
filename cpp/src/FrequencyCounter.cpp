//
// Created by Katherine Ritchie on 3/2/18.
//

#include "FrequencyCounter.h"

#include <iostream>
#include <map>
#include <cctype>
using namespace std;

const int knumElements = 10;

int main(int argc, char* argv[]);
string AnalyseWordFreq(int argc, char* argv[], int num_elements);
map<string, int> ArrToFreqMap(int argc, char **argv);
string MostFreqToString(map<string, int> word_freq_map, int num_elements);
string FindMaxKeyInMap(map<string, int> unsorted_map);

/**
 * This program accepts a string piped as a command line and prints out the most popular ten words
 * @param argc number of program arguments
 * @param argv array of program arguments
 * @return exit code 0 if successful
 */
int main(int argc, char* argv[]) {
    std::cout << AnalyseWordFreq(argc, argv, knumElements) << std::endl;
    return 0;
}

/**
 * Analyses word frequency of word array and returns string description
 * @param argc number of elements in argv
 * @param argv array of words
 * @param num_elements number of elements to display
 * @return string of frequent words description
 */
string AnalyseWordFreq(int argc, char* argv[], int num_elements) {
    map<string, int> word_frequency_map = ArrToFreqMap(argc, argv);
    string frequent_words_description = MostFreqToString(word_frequency_map, knumElements);
    return frequent_words_description;
}

/**
 * Creates a map with space split words from array and a count of their frequency.
 * @param argc number of arguments in argv
 * @param argv array* of strings
 * @return map detailing frequency of words in map
 */
map<string, int> ArrToFreqMap(int argc, char **argv) {
    map<string, int> freq_map;
    for (int i = 0; i < argc; i++) {
        string word = argv[i];
        transform(word.begin(), word.end(), word.begin(), ::tolower);
        freq_map[argv[i]] += 1;
    }
    return freq_map;
}

/**
 * Returns a string describing the n most popular words and their frequency, seperated by a colon and linebreak.
 * @param word_freq_map map of words and their frequencies
 * @param num_elements number of elements to display. Will display all words if numElements is larger than the number
 * of words
 * @return string describing most popular words.
 */
string MostFreqToString(map<string, int> word_freq_map, int num_elements) {
    string most_freq_string = "";
    if (num_elements > word_freq_map.size()) {
        num_elements = word_freq_map.size();
    }
    most_freq_string += "Most frequent " + std::to_string(num_elements) + " words are:\n";
    for (int i = 0; i < num_elements; i++) {
        string nextKey = FindMaxKeyInMap(word_freq_map);
        int nextVal = word_freq_map.at(nextKey);
        word_freq_map.erase(nextKey);
        most_freq_string += std::to_string(i + 1) + ". " + nextKey + " : " + std::to_string(nextVal) + "\n";
    }
    return most_freq_string;
}

/**
 * Finds the strinng with the highest value.
 * @param unsorted_map map<string, int> unsortedMap
 * @return string with highest value in map
 */
string FindMaxKeyInMap(map<string, int> unsorted_map) {
    string max_key_thus_far = "";
    int max_val_thus_far = 0;
    for (auto element : unsorted_map) {
        if (element.second > max_val_thus_far) {
            max_key_thus_far = element.first;
            max_val_thus_far = element.second;
        }
    }
    return max_key_thus_far;
}