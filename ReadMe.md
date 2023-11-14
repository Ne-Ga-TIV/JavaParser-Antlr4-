# Simple Java Parser

## Description

The Simple Java Parser is a syntactic analyzer for a subset of Java, created using Antlr4. 
Antlr4 is a powerful parser generator that simplifies the process of creating parsers for various programming languages. For more information on Antlr 4, you can visit the [Antlr 4 website](https://www.antlr.org/).

## Prerequisites

Ensure you have the following prerequisites installed before setting up the project:

- **Java 11 or later**: The project requires Java 11 or a more recent version. You can download it [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

- **Maven**: Maven is used for project build and dependency management. Install it by following the instructions [here](https://maven.apache.org/install.html).



## IntelliJ IDEA 

For an optimal development experience, it is recommended to use [IntelliJ IDEA](https://www.jetbrains.com/idea/) as your Integrated Development Environment (IDE).

## Usage

After building the project, the generated Antlr4 files will be located in the `src/main/java/org/javaParser/antlr` directory. These files are essential for parsing Java code using Antlr4. 

## Grammar 

The grammar for the Simple Java Parser is defined in the Antlr4 files located in the `src/main/java/antlr` directory. 

## Build
    mvn clean install

## Test

For examples of usage, refer to the tests located in the `src/test` directory. The test cases showcase various scenarios and demonstrate how to utilize the Java Parser in different situations.
    
    mvn test

### Result
You can explore the results of the tests in the `src/test/resources` directory. In this directory, you will find the generated syntax trees representing the outcomes of the tests.