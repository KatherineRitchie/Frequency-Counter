//
// Created by Katherine Ritchie on 3/5/18.
//
#define CATCH_CONFIG_MAIN  // This tells Catch to provide a main() - only do this in one cpp file

#define CATCH_CONFIG_MAIN
//#include "Tests.h"
#include "catch.hpp"
#include "string"
#include "iostream"
#include "map"
#include "../src/FrequencyCounterFunctions.cpp"
#include "../src/FrequencyCounterFunctions.hpp"
using namespace std;

/*int MyFunction(int my_int);
unsigned int Factorial( unsigned int number );
//TEST_CASE("Correct output is created");


int MyFunction(int my_int) {
    return my_int;
}

TEST_CASE("MyFunction is computed") {
    REQUIRE( MyFunction(1) == 1 );
    REQUIRE( MyFunction(3) == 3 );
}

unsigned int Factorial( unsigned int number ) {
    return number <= 1 ? number : Factorial(number-1)*number;
}

TEST_CASE( "Factorials are computed", "[factorial]" ) {
    REQUIRE( Factorial(1) == 1 );
    REQUIRE( Factorial(2) == 2 );
    REQUIRE( Factorial(3) == 6 );
    REQUIRE( Factorial(10) == 3628800 );
}*/

TEST_CASE("Basic and alphanumerical test cases") {
    string actual_string_one = AnalyseWordFreq(2, "hello world", 10);
    string expected_string_one = "Most frequent 2 words are:\n"
            "hello : 1\n"
            "world : 1";
    REQUIRE(actual_string_one.std::compare(expected_string_one) == 0);

    string actual_string_two = AnalyseWordFreq(2, "hello I am a test string", 10);
    string expected_string_two = "The most frequent 6 words are:\n" + "1. a : 1 \n" + "2. am : 1 \n" + "3. hello : 1 \n" + "4. i : 1 \n" + "5. string : 1 \n" + "6. test : 1 \n";
            "world : 1";
    REQUIRE(actual_string_two.std::compare(expected_string_two) == 0);

    string text_string_three = "hello2 unfor4tuanately 5this s%^&*(tring ha;s 6 a bunch&*) of     other stu&&*(ff.";
    string actual_string_three = AnalyseWordFreq(2, text_string_three, 10);
    string expected_string_three = "The most frequent 10 words are:\n" + "1. a : 1 \n" + "2. bunch : 1 \n" + "3. has : 1 \n" + "4. hello : 1 \n" + "5. of : 1 \n" + "6. other : 1 \n" + "7. string : 1 \n" + "8. stuff : 1 \n" + "9. this : 1 \n" + "10. unfortuanately : 1 \n";
    REQUIRE(actual_string_three.std::compare(expected_string_three) == 0);
}

TEST_CASE("White Space and empty tests") {
    string text_string_whitespace = "         ******************              help";
    string actual_string_whitespace = AnalyseWordFreq(2, text_string_whitespace, 10);
    string expected_string_whitespace = "The most frequent 1 words are:\n" + "1. help : 1 \n";
    REQUIRE(actual_string_whitespace.std::compare(expected_string_whitespace) == 0);

    string text_string_empty = "";
    string actual_string_empty = AnalyseWordFreq(2, text_string_empty, 10);
    string expected_string_empty = "There aren't any words to analyse!";
    REQUIRE(actual_string_empty.std::compare(expected_string_empty) == 0);
}

TEST_CASE("Stress Test Cases") {
    string text_string = "                  THE THREE LITTLE PIGS\n" + "\n" + "   Once upon a time . . . there were three little pigs, who left their mummy\n" + "and daddy to see the world.\n" + "   All summer long, they roamed through the woods and over the plains,playing\n" + "games and having fun. None were happier than the three little pigs, and they\n" + "easily made friends with everyone. Wherever they went, they were given a warm \n" + "welcome, but as summer drew to a close, they realized that folk were drifting\n" + "back to their usual jobs, and preparing for winter. Autumn came and it began\n" + "to rain. The three little pigs started to feel they needed a real home. Sadly\n" + "they knew that the fun was over now and they must set to work like the others,\n" + "or they'd be left in the cold and rain, with no roof over their heads. They\n" + "talked about what to do, but each decided for himself. The laziest little pig\n" + "said he'd build a straw hut.\n" + "   \"It wlll only take a day,' he said. The others disagreed.\n" + "   \"It's too fragile,\" they said disapprovingly, but he refused to listen. Not\n" + "quite so lazy, the second little pig went in search of planks of seasoned\n" + "wood.\n" + "   \"Clunk! Clunk! Clunk!\" It took him two days to nail them together. But the\n" + "third little pig did not like the wooden house.\n" + "   \"That's not the way to build a house!\" he said. \"It takes time, patience \n" + "and hard work to buiid a house that is strong enough to stand up to wind, \n" + "rain, and snow, and most of all, protect us from the wolf!\"\n" + "   The days went by, and the wisest little pig's house took shape, brick by\n" + "brick. From time to time, his brothers visited him, saying with a chuckle:\n" + "   \"Why are you working so hard? Why don't you come and play?\" But the\n" + "stubborn bricklayer pig just said \"no\".\n" + "   \"I shall finish my house first. It must be solid and sturdy. And then I'll\n" + "come and play!\" he said. \"I shall not be foolish like you! For he who laughs\n" + "last, laughs longest!\"\n" + "   It was the wisest little pig that found the tracks of a big wolf in the\n" + "neighbourhood.\n" + "   The little pigs rushed home in alarm. Along came the wolf, scowling \n" + "fiercely at the laziest pig's straw hut.\n" + "   \"Come out!\" ordered the wolf, his mouth watering. I want to speak to you!\"\n" + "   \"I'd rather stay where I am!\" replied the little pig in a tiny voice.\n" + "   \"I'll make you come out!\" growled the wolf angrily, and puffing out his\n" + "chest, he took a very deep breath. Then he blew wlth all his might, right onto\n" + "the house. And all the straw the silly pig had heaped against some thin poles,\n" + "fell down in the great blast. Excited by his own cleverness, the wolf did not\n" + "notice that the little pig had slithered out from underneath the heap of\n" + "straw, and was dashing towards his brother's wooden house. When he realized \n" + "that the little pig was escaping, the wolf grew wild with rage.\n" + "   \"Come back!\" he roared, trying to catch the pig as he ran into the wooden \n" + "house. The other little pig greeted his brother, shaking like a leaf.\n" + "   \"I hope this house won't fall down! Let's lean against the door so he can't\n" + "break in!\"\n" + "   Outside, the wolf could hear the little pigs' words. Starving as he was, at\n" + "the idea of a two-course meal, he rained blows on the door.\n" + "   \"Open up! Open up! I only want to speak to you!\"\n" + "   Inside, the two brothers wept in fear and did their best to hold the door\n" + "fast against the blows. Then the furious wolf braced himself a new effort: he\n" + "drew in a really enormous breath, and went ... WHOOOOO! The wooden house\n" + "collapsed like a pack of cards.\n" + "   Luckily, the wisest little pig had been watching the scene from the window\n" + "of his own brick house, and he rapidly opened the door to his fleeing \n" + "brothers. And not a moment too soon, for the wolf was already hammering \n" + "furiously on the door. This time, the wolf had grave doubts. This house had a\n" + "much more solid air than the others. He blew once, he blew again and then for\n" + "a third time. But all was in vain. For the house did not budge an lnch. The\n" + "three little pigs watched him and their fear began to fade. Quite exhausted by\n" + "his efforts, the wolf decided to try one of his tricks. He scrambled up a\n" + "nearby ladder, on to the roof to have a look at the chimney. However, the\n" + "wisest little pig had seen thls ploy, and he quickly said:\n" + "   \"Quick! Light the fire!\" With his long legs thrust down the chimney, the\n" + "wolf was not sure if he should slide down the black hole. It wouldn'tbe easy\n" + "to get in, but the sound of the little pigs' voices below only made him feel\n" + "hungrier.\n" + "   \"I'm dying of hunger! I'm goin to try and get down.\" And he let himself \n" + "drop. But landing was rather hot, too hot! The wolf landed in the fire, stunned\n" + "by his fall.\n" + "   The flames licked his hairy coat and his tail became a flaring torch.\n" + "   \"Never again! Never again will I go down a chimneyl\" he squealed, as he\n" + "tried to put out the flames in his tail. Then he ran away as fast as he could.\n" + "   The three happy little pigs, dancing round and round the yard, began to \n" + "sing:\n" + "   \"Tra-la-la! Tra-la-la! The wicked black wolf will never come back...!\"\n" + "   From that terrible day on, the wisest little pig's brothers set to work\n" + "with a will. In less than no time, up went the two new brick houses. The wolf\n" + "did return once to roam in the neighbourhood, but when he caught sight of\n" + "three chimneys, he remembered the terrible pain of a burnt tail, and he left\n" + "for good.\n" + "   Now safe and happy, the wisest little pig called to his brothers:\n" + "   \"No more work! Come on, let's go and play!\"\n";
    string actual_string = AnalyseWordFreq(2, text_string, 10);
    string expected_string = "The most frequent 10 words are:\n" + "1. the : 83 \n" + "2. and : 33 \n" + "3. to : 32 \n" + "4. he : 28 \n" + "5. a : 26 \n" + "6. little : 22 \n" + "7. his : 17 \n" + "8. wolf : 16 \n" + "9. in : 15 \n" + "10. pig : 14 \n";
    REQUIRE(actual_string.std::compare(expected_string) == 0);
}
