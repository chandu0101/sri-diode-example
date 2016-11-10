enablePlugins(ScalaJSPlugin)

name := "sri-diode-example"

scalaVersion := "2.11.8"

val sriVersion = "0.6.0"

val sriDiodeVersion = "2016.11.0"

val sriScalacssVersion = "2016.11.0"

libraryDependencies ++= Seq("com.github.chandu0101" %%% "sri-web" % sriVersion,
  "com.github.chandu0101" %%% "sri-diode" % sriDiodeVersion,
  "com.github.chandu0101" %%% "sri-scalacss" % sriScalacssVersion)

val assetsDir = "assets/"

// copy fastOptJS/fullOptJS  files to assets directory
crossTarget in(Compile, fullOptJS) := file(assetsDir)
crossTarget in(Compile, fastOptJS) := file(assetsDir)
crossTarget in(Compile, packageScalaJSLauncher) := file(assetsDir)
artifactPath in(Compile, fastOptJS) := ((crossTarget in(Compile, fastOptJS)).value /
  ((moduleName in fastOptJS).value + "-opt.js"))

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature",
  "-language:postfixOps", "-language:implicitConversions",
  "-language:higherKinds", "-language:existentials")