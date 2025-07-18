# Scala Template Project

This is a minimal and clean template for Scala projects. It includes a standard directory structure, `build.sbt` configuration, and simple examples to help you get started quickly with your Scala development.

## Features

- Organized project structure
- SBT build configuration
- Simple example code (`HelloWorld.scala`)
- Ready for local and IDE-based development (IntelliJ IDEA recommended)

## Project Structure

```
scala-template-project/
├── build.sbt
├── project/
│ └── build.properties
├── src/
│ ├── main/
│ │ └── scala/
│ │ └── HelloWorld.scala
│ └── test/
│ └── scala/
│ └── HelloWorldSpec.scala
```


## Getting Started

### Prerequisites

- Java 8 or higher
- [SBT (Scala Build Tool)](https://www.scala-sbt.org/)

### Running the Project

To compile and run the project, use the following commands:

```
sbt compile
sbt run
```
### Running Tests

```
sbt test
```

## License
This project is open source and available under the MIT License.
