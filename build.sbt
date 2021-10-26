name := "iservport-concurrency"

version := "0.1"

scalaVersion := "2.13.6"

idePackagePrefix := Some("com.iservport.concurrency")

libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.10"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.10" % "test"

publishTo := Some("GitHub iservport Apache Maven Packages" at "https://maven.pkg.github.com/iservport/iservport-concurrency")
publishMavenStyle := true
credentials += Credentials(
  "GitHub Package Registry",
  "maven.pkg.github.com",
  "iservport",
  System.getenv("PUBLISH_TOKEN")
)
