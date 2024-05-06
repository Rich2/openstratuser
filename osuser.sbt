name := "OpenStratUser"
version := "0.0.1snap"
scalaVersion := "3.4.1"
libraryDependencies += "dev.zio" %% "zio" % "2.1.0-RC5" withSources() withJavadoc()
resolvers += "RichStrat" at "https://richstrat.com/repository"
libraryDependencies += "com.richstrat" % "rutil" % "0.3.2" withSources() withJavadoc()
libraryDependencies += "com.richstrat" % "geom" % "0.3.2" withSources() withJavadoc()
libraryDependencies += "com.richstrat" % "tiling" % "0.3.2"