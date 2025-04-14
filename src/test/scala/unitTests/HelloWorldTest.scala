package unitTests

import org.scalatest.flatspec.AnyFlatSpec

class HelloWorldTest extends AnyFlatSpec {

  object Constants {
    val HelloWorld = "Hello World"
  }

  import Constants._

  behavior of HelloWorld

  it should "start with 'Hello'" in {
    assert(HelloWorld.startsWith("Hello"))
  }

  it should "not start with 'Hi'" in {
    assert(!HelloWorld.startsWith("Hi"))
  }

  it should "end with 'World'" in {
    assert(HelloWorld.endsWith("World"))
  }

  ignore should "not end with 'Universe'" in {
    assert(!HelloWorld.endsWith("Universe"))
  }
}

