# scala_maven_playground

Repository with scala unit example tests configured with maven

# Test execution

# BDD specific tags execution

`mvn test -D"cucumber.filter.tags=@wip"`

# all BDD tests with all scala tests execution

`mvn test -D"cucumber.filter.tags=@all"`

# all tests execution, html scalatest and surefire-reports generation

`mvn clean install`
`mvn clean test`
`mvn test`

# site report generation only

`mvn site`

# report can be found in location for:

# - scala

```target/html/scalatest/index.html```
```target/html/scalatest/unitTests.CalculatorTest.html```
```target/html/scalatest/unitTests.HelloWorldTest.html```

```target/site/surefire-report.html```

# - BDD

```target/cucumber/test-report.html```
```target/cucumber/test-report.json```
```target/cucumber/test-report.xml```