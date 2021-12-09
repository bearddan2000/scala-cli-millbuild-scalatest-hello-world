package example;

import org.specs2.mutable._

class TestMain extends Specification {
    "say hello" in  {
      "Hello World" must beEqualTo(hello.Hello.greeting())
    }
}
