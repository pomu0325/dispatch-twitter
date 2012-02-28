name := "dispatch-twitter"

organization := "net.databinder"

version := "0.8.7-SNAPSHOT"

resolvers += "my repo" at "http://pomu0325.github.com/repo"

libraryDependencies ++= Seq(
  "net.databinder" %% "dispatch-core" % "0.8.7",
  "net.databinder" %% "dispatch-http-json" % "0.8.7",
  "net.databinder" %% "dispatch-oauth" % "0.8.7",
  "net.databinder" %% "dispatch-lift-json" % "0.1.1-SNAPSHOT",
  "org.specs"      % "specs" % "1.4.3" % "test"
)
