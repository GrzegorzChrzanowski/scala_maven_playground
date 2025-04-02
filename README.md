# scala_maven_playground
Repository with scala unit example tests configured with maven

# all tests execution, html scalatest and surefire-reports generation
mvn clean install
mvn clean test
mvn test

# site report generation only
mvn site

# report can be found in location

target/html/scalatest/index.html
target/html/scalatest/unitTests.CalculatorTest.html
target/html/scalatest/unitTests.HelloWorldTest.html

target/site/surefire-report.html

