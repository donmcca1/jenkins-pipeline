ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "jenkins-pipeline",
    libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.13",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.13" % "test"
  )
