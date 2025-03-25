# HBV202GAssignment9
A project implementing the *Composite* pattern, *Observer* pattern, and a variation of the *Template Method* pattern based on JUnit4 tests.
### Overview
This project demonstrates design pattern implementations through a structured Maven project. It provides test cases to validate each pattern implementation.
### Project Structure
- `src/main/java`:
  - `is.hi.hbv202g.ass9.composite`: Implementation of the *Composite* pattern.
  - `is.hi.hbv202g.ass9.compositeObserved`: Implementation of the *Composite* pattern combined with the *Observable* pattern.
  - `is.hi.hbv202g.ass9.compositeObservedTemplateMethod`: Refactored implementation using the *Template Method* pattern.

- `src/test/java`:
  - `is.hi.hbv202g.ass9.composite`: Test cases for the Composite implementation.
  - `is.hi.hbv202g.ass9.compositeObserved`: Test cases for the Composite with Observer implementation.
  - `is.hi.hbv202g.ass9.compositeObservedTemplateMethod`: Test cases for the Template Method refactoring.
## Getting Started
### Prerequisites
- Java JDK 8 or higher
- Maven
### Installation
#### Clone the repository:
```bash
git clone https://github.com/yourusername/HBV202GAssignment9.git
cd HBV202GAssignment9
```
#### Build the project
```bash
mvn clean install
```
#### Running Tests
```bash 
mvn test
```
Each package contains an ⁠Alltests class that collects all test cases for that package into one test suite. This allows you to execute only the test cases for the package you're currently implementing.
#### Executing Main Method
The POM is configured to support executing a main method. You can run the main class using:
```bash
mvn exec:java -Dexec.mainClass="is.hi.hbv202g.ass9.CompositeMain"
```
#### Generating Documentation
```bash
mvn site
```
This generates Javadoc documentation and places it in ⁠target/site/index.html.
