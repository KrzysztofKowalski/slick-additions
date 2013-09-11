import sbt._
import Keys._
import play.Project._

object SlickAdditionsBuild extends Build {

  lazy val slickAdditions =
    Project(id = "slick-additions", base = file("."), settings = Project.defaultSettings).settings(
    
      scalaVersion := "2.10.2",
      version := "0.1",
      organization := "com.jiffey",
      resolvers ++= Seq(
        //Resolver.file("Local ivy Repository", file("~/.ivy2/local/"))(Resolver.ivyStylePatterns),
        "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases",
        "sonatype-snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
        "java-net" at "http://download.java.net/maven/2",
        "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
        "Adam Gent Maven Repository" at "http://mvn-adamgent.googlecode.com/svn/maven/release"
      ),
      libraryDependencies += "play" %% "play" % "2.1.3",
      libraryDependencies += jdbc,
      libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.26",
      libraryDependencies += "com.typesafe.slick" %% "slick" % "1.0.1",
      libraryDependencies += "com.github.tminglei" % "slick-pg_2.10.1" % "0.1.2",
      libraryDependencies += "com.github.scaldi" %% "scaldi" % "0.2",
      libraryDependencies += "com.github.nscala-time" %% "nscala-time" % "0.4.2"
    )   
}
