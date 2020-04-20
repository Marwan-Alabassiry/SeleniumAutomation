# Fully Functional Selenium Workspace

[![N|Solid](https://www.selenium.dev/images/selenium_logo_large.png)](https://www.selenium.dev/)

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://github.com/marwan-alabassiry)

Primarily it is for automating web applications for testing purposes, but is certainly not limited to just that.
Boring web-based administration tasks can (and should) also be automated as well.

# Features!

  - Pagefile
  - TestNG integration
  - SureFire plugin
  - Maven


### Installation

Everything you need is in the pom.xml no prerequisites needed

Install the dependencies using this command

```sh
$ mvn dependency:sources
```

For javadoc run this command (optional)

```sh
$ mvn dependency:resolve -DClassifier=javadoc
```

### Plugins

SureFire is added in the pom file


### Running test cases

First clean the /target directory using this command
```sh
$ mvn clean
```

You can then install the dependencies from the above commands

Then to run the SanityTest suite use this command
```sh
$ mvn test -PSanityTest
```

And use this command for the RegTest suite
```sh
$ mvn test -PRegTest
```


### Todos

 - You tell me!
