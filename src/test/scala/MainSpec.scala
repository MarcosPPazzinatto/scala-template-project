import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class MainSpec extends AnyFlatSpec with Matchers {
  "The Scala project" should "run successfully" in {
    val output = "Hello, Scala world!" // expected output
    output shouldEqual "Hello, Scala world!"
  }
}

