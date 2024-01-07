val scala3Version = "3.3.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "Chapter2",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-core" % "3.5.0",
      "org.apache.spark" %% "spark-sql" % "3.5.0"
    )
  )
