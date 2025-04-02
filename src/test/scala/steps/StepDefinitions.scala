package steps
import io.cucumber.scala.{EN, ScalaDsl}
import org.junit.Assert.assertEquals
import unitTests.Calculator

class StepDefinitions extends ScalaDsl with EN {

  var num1: Int = 0
  var num2: Int = 0
  var result: Int = 0
  var calc: Calculator = _

  Given("""I have numbers (\d+) and (\d+)$""") { (a: Int, b: Int) =>
    num1 = a
    num2 = b
  }

  Given("""my calculator is running""") { () =>
    calc = new Calculator()
  }

  When("""^I add (\d+) and (\d+)$""") { (firstNumber: Int, secondNumber: Int) =>
    result = calc.add(firstNumber, secondNumber)
  }

  When("I add them") {
    result = num1 + num2
  }

  Then("""^the result should be equal to (\d+)$""") { (expectedResult: Int) =>
    assert(result == expectedResult, "Incorrect result of calculator computation")
  }
  Then("""the result should be (\d+)$""") { expected: Int =>
    assertEquals(expected, result)
  }

  When("""^I subtract (\d+) and (\d+)$""") { (firstNumber: Int, secondNumber: Int) =>
    result = calc.sub(firstNumber, secondNumber)
  }
}