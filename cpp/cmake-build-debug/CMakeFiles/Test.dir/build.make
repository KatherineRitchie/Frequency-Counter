# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.9

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /Applications/CLion.app/Contents/bin/cmake/bin/cmake

# The command to remove a file.
RM = /Applications/CLion.app/Contents/bin/cmake/bin/cmake -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /Users/Kate/Documents/GitHub/frequencycount-KatherineRitchie/cpp

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /Users/Kate/Documents/GitHub/frequencycount-KatherineRitchie/cpp/cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/Test.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/Test.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/Test.dir/flags.make

CMakeFiles/Test.dir/test/Tests.cpp.o: CMakeFiles/Test.dir/flags.make
CMakeFiles/Test.dir/test/Tests.cpp.o: ../test/Tests.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/Kate/Documents/GitHub/frequencycount-KatherineRitchie/cpp/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/Test.dir/test/Tests.cpp.o"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/Test.dir/test/Tests.cpp.o -c /Users/Kate/Documents/GitHub/frequencycount-KatherineRitchie/cpp/test/Tests.cpp

CMakeFiles/Test.dir/test/Tests.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/Test.dir/test/Tests.cpp.i"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /Users/Kate/Documents/GitHub/frequencycount-KatherineRitchie/cpp/test/Tests.cpp > CMakeFiles/Test.dir/test/Tests.cpp.i

CMakeFiles/Test.dir/test/Tests.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/Test.dir/test/Tests.cpp.s"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /Users/Kate/Documents/GitHub/frequencycount-KatherineRitchie/cpp/test/Tests.cpp -o CMakeFiles/Test.dir/test/Tests.cpp.s

CMakeFiles/Test.dir/test/Tests.cpp.o.requires:

.PHONY : CMakeFiles/Test.dir/test/Tests.cpp.o.requires

CMakeFiles/Test.dir/test/Tests.cpp.o.provides: CMakeFiles/Test.dir/test/Tests.cpp.o.requires
	$(MAKE) -f CMakeFiles/Test.dir/build.make CMakeFiles/Test.dir/test/Tests.cpp.o.provides.build
.PHONY : CMakeFiles/Test.dir/test/Tests.cpp.o.provides

CMakeFiles/Test.dir/test/Tests.cpp.o.provides.build: CMakeFiles/Test.dir/test/Tests.cpp.o


CMakeFiles/Test.dir/src/FrequencyCounterFunctions.cpp.o: CMakeFiles/Test.dir/flags.make
CMakeFiles/Test.dir/src/FrequencyCounterFunctions.cpp.o: ../src/FrequencyCounterFunctions.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/Kate/Documents/GitHub/frequencycount-KatherineRitchie/cpp/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Building CXX object CMakeFiles/Test.dir/src/FrequencyCounterFunctions.cpp.o"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/Test.dir/src/FrequencyCounterFunctions.cpp.o -c /Users/Kate/Documents/GitHub/frequencycount-KatherineRitchie/cpp/src/FrequencyCounterFunctions.cpp

CMakeFiles/Test.dir/src/FrequencyCounterFunctions.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/Test.dir/src/FrequencyCounterFunctions.cpp.i"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /Users/Kate/Documents/GitHub/frequencycount-KatherineRitchie/cpp/src/FrequencyCounterFunctions.cpp > CMakeFiles/Test.dir/src/FrequencyCounterFunctions.cpp.i

CMakeFiles/Test.dir/src/FrequencyCounterFunctions.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/Test.dir/src/FrequencyCounterFunctions.cpp.s"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /Users/Kate/Documents/GitHub/frequencycount-KatherineRitchie/cpp/src/FrequencyCounterFunctions.cpp -o CMakeFiles/Test.dir/src/FrequencyCounterFunctions.cpp.s

CMakeFiles/Test.dir/src/FrequencyCounterFunctions.cpp.o.requires:

.PHONY : CMakeFiles/Test.dir/src/FrequencyCounterFunctions.cpp.o.requires

CMakeFiles/Test.dir/src/FrequencyCounterFunctions.cpp.o.provides: CMakeFiles/Test.dir/src/FrequencyCounterFunctions.cpp.o.requires
	$(MAKE) -f CMakeFiles/Test.dir/build.make CMakeFiles/Test.dir/src/FrequencyCounterFunctions.cpp.o.provides.build
.PHONY : CMakeFiles/Test.dir/src/FrequencyCounterFunctions.cpp.o.provides

CMakeFiles/Test.dir/src/FrequencyCounterFunctions.cpp.o.provides.build: CMakeFiles/Test.dir/src/FrequencyCounterFunctions.cpp.o


# Object files for target Test
Test_OBJECTS = \
"CMakeFiles/Test.dir/test/Tests.cpp.o" \
"CMakeFiles/Test.dir/src/FrequencyCounterFunctions.cpp.o"

# External object files for target Test
Test_EXTERNAL_OBJECTS =

Test: CMakeFiles/Test.dir/test/Tests.cpp.o
Test: CMakeFiles/Test.dir/src/FrequencyCounterFunctions.cpp.o
Test: CMakeFiles/Test.dir/build.make
Test: CMakeFiles/Test.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/Users/Kate/Documents/GitHub/frequencycount-KatherineRitchie/cpp/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_3) "Linking CXX executable Test"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/Test.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/Test.dir/build: Test

.PHONY : CMakeFiles/Test.dir/build

CMakeFiles/Test.dir/requires: CMakeFiles/Test.dir/test/Tests.cpp.o.requires
CMakeFiles/Test.dir/requires: CMakeFiles/Test.dir/src/FrequencyCounterFunctions.cpp.o.requires

.PHONY : CMakeFiles/Test.dir/requires

CMakeFiles/Test.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/Test.dir/cmake_clean.cmake
.PHONY : CMakeFiles/Test.dir/clean

CMakeFiles/Test.dir/depend:
	cd /Users/Kate/Documents/GitHub/frequencycount-KatherineRitchie/cpp/cmake-build-debug && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/Kate/Documents/GitHub/frequencycount-KatherineRitchie/cpp /Users/Kate/Documents/GitHub/frequencycount-KatherineRitchie/cpp /Users/Kate/Documents/GitHub/frequencycount-KatherineRitchie/cpp/cmake-build-debug /Users/Kate/Documents/GitHub/frequencycount-KatherineRitchie/cpp/cmake-build-debug /Users/Kate/Documents/GitHub/frequencycount-KatherineRitchie/cpp/cmake-build-debug/CMakeFiles/Test.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/Test.dir/depend

