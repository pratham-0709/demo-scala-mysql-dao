name := """scala-rest-api-example"""
organization := "edutech.org"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.11"

libraryDependencies ++= Seq(
    guice,
    "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test,
    jdbc,
    "mysql" % "mysql-connector-java" % "8.0.27",
    "com.typesafe.play" %% "play-slick" % "5.0.0",
    "com.typesafe.play" %% "play-slick-evolutions" % "5.0.0" % Test
)


//TwirlKeys.templateImports += "edutech.org.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "edutech.org.binders._"
