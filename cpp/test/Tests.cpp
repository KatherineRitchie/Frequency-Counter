//
// Created by Katherine Ritchie on 3/5/18.
//
#define CATCH_CONFIG_MAIN  // This tells Catch to provide a main() - only do this in one cpp file

#include "Tests.h"
#include "catch.hpp"

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
}
