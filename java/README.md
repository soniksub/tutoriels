# Utilisez WSL ou MOBAXTERM ( terminal local )
```
mkdir test
cd test
```

# il nous faut JAVA + MAVEN, si il sont présents, il suffit de positionner les variables suivantes

```
export JAVA_HOME=<chemin du jdk>
PATH=$PATH:<chemin des binaires maven>
```

# sinon
## telechargement et installation openjdk 8
```
curl https://builds.openlogic.com/downloadJDK/openlogic-openjdk/8u392-b08/openlogic-openjdk-8u392-b08-windows-x64.zip --output openlogic-openjdk-8u392-b08-windows-x64.zip
unzip openlogic-openjdk-8u392-b08-windows-x64.zip
rm -f openlogic-openjdk-8u392-b08-windows-x64.zip
export JAVA_HOME=$PWD/openlogic-openjdk-8u392-b08-windows-64
```

## telechargement et installation maven 3.5.3
```
curl https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/3.5.3/apache-maven-3.5.3-bin.tar.gz --output - | tar xzf -
PATH=$PATH:$PWD/apache-maven-3.5.3/bin
```
## verification des pré-requis
![vérification des pré-requis](https://raw.githubusercontent.com/soniksub/tutoriels/main/java/mvn_version.png)

# Developpement

## creation d'un war simple
```
rm -rf demo
mvn archetype:generate -DinteractiveMode=false -DgroupId=com.domain -DartifactId=demo -DarchetypeArtifactId=maven-archetype-webapp
( cd demo; mvn package )
```

# un autre war ...
voir https://mkyong.com/maven/how-to-create-a-web-application-project-with-maven/
```
git clone https://github.com/mkyong/maven-examples.git
mv maven-examples/java-web-project .
rm -rf maven-examples
# un fichier manque dans cet exemple récupéré, on l'ajoute
curl https://raw.githubusercontent.com/soniksub/tutoriels/main/java/SpringConfig.java --output java-web-project/src/main/java/com/mkyong/web/SpringConfig.java
( cd java-web-project; mvn package )
```

ces war sont testables avec "mvn tomcat7:run" en ajoutant quelques lignes dans demo/pom.xml et java-web-project/pom.xml 
```
	<dependency>
		<groupId>javax.servlet</groupId>
		<artifactId>jstl</artifactId>
		<version>1.2</version>
	</dependency>
</dependencies>

<build>
	...
	<plugins>
		<plugin>
			<groupId>org.apache.tomcat.maven</groupId>
			<artifactId>tomcat7-maven-plugin</artifactId>
			<version>2.2</version>
		</plugin>
	</plugins>
```

# puis
```
( cd demo; mvn tomcat7:run )
```
[le WAR demo](http://localhost:8080/demo/) 
```
( cd java-web-project; mvn tomcat7:run )
```
[le WAR java-web-project](http://localhost:8080/java-web-project/)
