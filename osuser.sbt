name := "OpenStratUser"
version := "0.3.12"
ThisBuild/scalaVersion := "3.8.3"
ThisBuild/resolvers += "RichStrat" at "https://richstrat.com/repository"

val Core = Project("Core", file("Core")).settings(
  Compile/scalaSource := baseDirectory.value / "src",
  libraryDependencies += "com.richstrat" % "rutil" % "0.3.12" withSources() withJavadoc(),
  libraryDependencies += "com.richstrat" % "geom" % "0.3.12" withSources() withJavadoc(),
  libraryDependencies += "com.richstrat" % "tiling" % "0.3.12" withSources() withJavadoc(),
  libraryDependencies += "com.richstrat" % "egrid" % "0.3.12" withSources() withJavadoc(),
)

val WebJs = Project("WebJs", file("WebJs")).settings(
  Compile/scalaSource := baseDirectory.value / "src",
  libraryDependencies += "com.richstrat" % "rutiljs" % "0.3.12" withSources() withJavadoc(),
  libraryDependencies += "com.richstrat" % "geomjs" % "0.3.12" withSources() withJavadoc(),
)