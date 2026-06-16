version := "0.3.12"
scalaVersion := "3.8.4"
resolvers += "RichStrat" at "https://richstrat.com/repository"

val Core = Project("Core", file("Core")).settings(
  name := "Core",
  Compile/scalaSource := baseDirectory.value / "src",
  libraryDependencies += ("com.richstrat" % "rutil" % "0.3.12").withSources().withJavadoc(),
  libraryDependencies += ("com.richstrat" % "geom" % "0.3.12").withSources().withJavadoc(),
  libraryDependencies += ("com.richstrat" % "tiling" % "0.3.12").withSources().withJavadoc(),
  libraryDependencies += ("com.richstrat" % "egrid" % "0.3.12"). withSources().withJavadoc(),
)

val WebJs = Project("WebJs", file("WebJs")).settings(
  name := "WebJs",
  Compile/scalaSource := baseDirectory.value / "src",
  libraryDependencies += ("com.richstrat" % "rutiljs" % "0.3.12").withSources().withJavadoc(),
  libraryDependencies += ("com.richstrat" % "geomjs" % "0.3.12").withSources().withJavadoc(),
)