lazy val root = (project in file(".")).
  settings(
    organization := "eu.limebox",
    name := "twitter-stream-poller",
    version := "0.1-SNAPSHOT",
    scalaVersion := "2.11.11",
    mainClass in Compile := Some("eu.limebox.twitterstreampoller.Main")
  )

libraryDependencies ++= Seq(
//  "org.apache.spark" %% "spark-core" % "1.2.0" % "provided",
  "com.github.scopt" % "scopt_2.11" % "3.6.0",
  "com.danielasfregola" %% "twitter4s" % "5.1",
  "ch.qos.logback" % "logback-classic" % "1.2.3"
)

assemblyMergeStrategy in assembly := {
  // Discar META-INF in resulting uber JAR
  case PathList("META-INF", xs@_*) => MergeStrategy.discard
  case x =>
    val oldStrategy = (assemblyMergeStrategy in assembly).value
    oldStrategy(x)
}

