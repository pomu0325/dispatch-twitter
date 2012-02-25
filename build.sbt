name := "dispatch-twitter"

organization := "net.databinder"

version := "0.8.7-SNAPSHOT"

libraryDependencies ++= Seq(
  "net.databinder" %% "dispatch-core" % "0.8.7",
  "net.databinder" %% "dispatch-http-json" % "0.8.7",
  "net.databinder" %% "dispatch-oauth" % "0.8.7"
)
