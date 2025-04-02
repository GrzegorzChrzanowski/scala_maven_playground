package unitTests
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CalculatorTest extends AnyFlatSpec with Matchers {


  "add method" should "return the correct sum" in {
    Calculator.add(2, 3) shouldEqual 5
    Calculator.add(-1, 1) shouldEqual 0
    Calculator.add(0, 0) shouldEqual 0
  }

  "sub method" should "return the correct difference" ignore {
    Calculator.sub(5, 3) shouldEqual 2
    Calculator.sub(3, 5) shouldEqual -2
    Calculator.sub(0, 0) shouldEqual 0
  }
}
