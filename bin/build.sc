import mill._, scalalib._

// `HelloWorld` must match the subdirectory name
object HelloWorld extends ScalaModule {
    def scalaVersion = "2.13.1"

    object test extends Tests {

        def ivyDeps = Agg(
            ivy"org.specs2::specs2-core:4.6.0"
        )

        def testFrameworks = Seq("org.specs2.runner.Specs2Framework")

        def scalacOptions = HelloWorld.scalacOptions() ++ Seq(
          "-Yrangepos"    // Required by specs2
        )
    }
}
