import sbt._
import Dependencies._

// "bare" definition, applies to all projects
ThisBuild / scalaVersion := "2.13.3"
ThisBuild / version := "current"
ThisBuild / organization := "io.jokester.tapir_todoapi"
ThisBuild / organizationName := "scala tapir demo"

lazy val root = (project in file("."))
  .settings(
    name := "tapir-todoapi",
    libraryDependencies ++= runtimeDeps ++ testDeps ++ buildDeps,
    scalacOptions ++= Seq("-Xlint")
  )
  .enablePlugins(
    JavaAppPackaging,
  )
