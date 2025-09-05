name := "OpenStratUser"
version := "0.3.6"
scalaVersion := "3.7.2"
resolvers += "RichStrat" at "https://richstrat.com/repository"
libraryDependencies += "com.richstrat" % "rutil" % "0.3.8" withSources() withJavadoc()
libraryDependencies += "com.richstrat" % "geom" % "0.3.8" withSources() withJavadoc()
libraryDependencies += "com.richstrat" % "tiling" % "0.3.8" withSources() withJavadoc()
libraryDependencies += "com.richstrat" % "egrid" % "0.3.8" withSources() withJavadoc()