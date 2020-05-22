[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE.md)

# Java Training - Courses

* [Description](#description)
* [Objectives](#objectives)
* [Local setup](#local-setup)
* [License](#license)

## Description
Implementation of several courses: 
- Course https://www.linkedin.com/learning/learning-java-4/ for practicing Java basics. 
The code for this course lives on the [basics folder](src/basics).
- Course https://www.linkedin.com/learning/java-11-plus-essential-training/ for practicing Java intermediate essentials. 
The code for this course lives on the [essentials folder](src/essentials).

## Objectives
Practicing Java at different levels.
- The history and principles of Java
- Installing the JDK and IntelliJ IDEA
- Working with variables and values
- Working with object data types
- Building, comparing, and parsing strings
- Debugging and exception handling
- Creating loops and reusable code
- Passing arguments by reference or value
- Creating custom classes
- Working with inheritance
- Managing data collections

## Local setup
- Install Java SE (Standard Edition) Development Kit. The JDK includes the JRE (Java Runtime Environment). 
 https://www.oracle.com/uk/java/technologies/javase-downloads.html
- Add the appropriate documentation URL to the SDK configuration in the IDE. 
In IntelliJ: `File -> Project Structure -> SDKs -> Documentation Paths -> Specify URL`
 
## Running a program
For example, to run the basic program [MultipleChoiceQuestion.java](src/basics/MultipleChoiceQuestion.java)
- Go to the basics folder: `cd src/basics`
- Compile the java source code into java bytecode: `javac -d . MultipleChoiceQuestion.java`
- Run the compiled program: `java basics.MultipleChoiceQuestion`
  
## License
This project is licensed under the terms of the MIT License.
Please see [LICENSE](LICENSE.md) for details.
