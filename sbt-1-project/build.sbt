scalaVersion := "2.13.18"

name := "sbt-1-project"

scalacOptions ++= Seq(
  "-release:17",
  "-deprecation",
  "-Xsource:3",
)

libraryDependencies ++= Seq(
  compilerPlugin(("org.typelevel" %% "kind-projector" % "0.13.4").cross(CrossVersion.full)),
)
