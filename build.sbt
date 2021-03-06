val cats = "org.typelevel" %% "cats" % "0.8.1"
val scalaTest= "org.scalatest" %% "scalatest" % "3.0.1" % "test"
val scalaCheck = "org.scalacheck" %% "scalacheck" % "1.13.4" % "test"

val root=(project in file("."))
    .settings(
        name := """jug-workshops""",
        version := "1.0",
        scalaVersion := "2.12.1"
    ).settings(
    libraryDependencies ++= Seq(
      cats,
      scalaTest,scalaCheck
    )
  )
