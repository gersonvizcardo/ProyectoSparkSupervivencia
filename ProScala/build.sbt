name := "ProScala"

version := "0.1"

scalaVersion := "2.11.7"

// https://mvnrepository.com/artifact/org.apache.spark/spark-core
libraryDependencies += "org.apache.spark" %% "spark-core" % "1.6.0"

// https://mvnrepository.com/artifact/org.apache.spark/spark-streaming
libraryDependencies += "org.apache.spark" %% "spark-streaming" % "1.6.0" % "provided"

// https://mvnrepository.com/artifact/org.apache.spark/spark-sql
libraryDependencies += "org.apache.spark" %% "spark-sql" % "1.6.0"

// https://mvnrepository.com/artifact/org.apache.hadoop/hadoop-yarn-common
libraryDependencies += "org.apache.hadoop" % "hadoop-yarn-common" % "2.7.2"

// https://mvnrepository.com/artifact/org.apache.hadoop/hadoop-yarn-client
libraryDependencies += "org.apache.hadoop" % "hadoop-yarn-client" % "2.7.2"
