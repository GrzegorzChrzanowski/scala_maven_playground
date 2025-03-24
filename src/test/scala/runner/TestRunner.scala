package runner

import io.cucumber.junit.{Cucumber, CucumberOptions}
import org.junit.runner.RunWith

@RunWith(classOf[Cucumber]) // Correct syntax in Scala
@CucumberOptions(
  features = Array("src/test/resources/features"),
  glue = Array("classpath:steps"),
  tags = "@wip",
  monochrome = true,
  plugin = Array("pretty",
    "html:target/cucumber/test-report.html",
    "json:target/cucumber/test-report.json",
    "junit:target/cucumber/test-report.xml")
)
class TestRunner {}
