name := "OpenStratUser"
version := "0.0.1snap"
scalaVersion := "3.5.2"
libraryDependencies += "dev.zio" %% "zio" % "2.1.11" withSources() withJavadoc()
resolvers += "RichStrat" at "https://richstrat.com/repository"
libraryDependencies += "com.richstrat" % "rutil" % "0.3.4" withSources() withJavadoc()
libraryDependencies += "com.richstrat" % "geom" % "0.3.4" withSources() withJavadoc()
libraryDependencies += "com.richstrat" % "tiling" % "0.3.4" withSources() withJavadoc()