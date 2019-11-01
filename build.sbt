name := "cafeteria-management"

version := "0.1"

scalaVersion := "2.12.8"

mainClass in Compile := Some("CafeteriaMgmtImpl")

libraryDependencies ++= {
  val mySqlVersion = "8.0.17"
  Seq(
    "mysql" % "mysql-connector-java" % mySqlVersion,
    "com.typesafe.akka" %% "akka-http" % "10.1.10",
    "com.typesafe.akka" %% "akka-stream" % "2.5.23",
    "com.typesafe.akka" %% "akka-http-spray-json" % "10.1.10",
    "ch.qos.logback" % "logback-classic" % "1.2.3",
    "org.scalatest" %% "scalatest" % "3.0.8" % "test",
    "com.typesafe.akka" %% "akka-http-testkit" % "10.1.10",
    "com.typesafe.akka" %% "akka-stream-testkit" % "2.5.23",
    "com.pauldijou" %% "jwt-core" % "4.1.0"
  )
}