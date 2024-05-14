#Notes
# Maven Project
 - create Java Project -> JDK (java.lang)
 - but you need to explicitly import java.util, etc.
 - CAN WRITE A CLASS UPDATE TO MAVEN-> GET A CLASS AS FUNCTION

 - Command "mvn compile" -> check dependency in pom.xml -> download dependency
 - Java project = JDK + junit + lombok
 - target folder -> generated main + test class files (similar to javac)
# Maven Command
 - Command "mvn clean" -> clear target folder

 - Command "mvn clean compile" -> clear target folder, check dependency, compile class folder

 - Command "mvn clean install" -> 
 - Clear target folder, check dependency, compile class folder, bundle a single jar(representing all class files)

 # pom.xml
  - UPDATE version <- file version
  - UPDATE properties <- JAVA version
  - UPDATE dependencies <- LOMBOK version & Junit version
  - plugin

 # gitignore
  - ignore update unuseable file eg (target file)
