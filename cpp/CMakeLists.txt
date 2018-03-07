cmake_minimum_required(VERSION 3.9)
project(cpp)

set(CMAKE_CXX_STANDARD 11)

add_executable(cpp
        src/FrequencyCounter.cpp
        src/FrequencyCounter.h
        src/FrequencyCounterFunctions.cpp
        src/FrequencyCounterFunctions.hpp
        )

add_executable(Test
        test/Tests.cpp
        test/Tests.h
        test/catch.hpp
        src/FrequencyCounterFunctions.cpp
        src/FrequencyCounterFunctions.hpp
        )

