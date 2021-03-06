lazy val root = (project in file("."))
  .dependsOn(pureApp)
  .settings(
    scalaVersion := "2.12.4",
    name := "pureapp-cli-args-example"
  )

lazy val pureApp = ProjectRef(file("../.."), "pureapp")
