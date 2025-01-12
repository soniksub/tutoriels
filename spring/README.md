# Commencez par le tutoriel JAVA
[le tuto JAVA](https://github.com/soniksub/tutoriels/tree/main/java#readme)

# installer java 17

```
# sous git-bash ça donne ça
mkdir /c/java
cd /c/java
curl https://builds.openlogic.com/downloadJDK/openlogic-openjdk/17.0.13+11/openlogic-openjdk-17.0.13+11-windows-x64.zip  --output openlogic-openjdk-17.0.13+11-windows-x64.zip
unzip openlogic-openjdk-17.0.13+11-windows-x64.zip
rm -f openlogic-openjdk-17.0.13+11-windows-x64.zip

# ajoute les lignes suivante dans ~/.bash_profile
export JAVA_HOME=/c/java/openlogic-openjdk-17.0.13+11-windows-x64
export PATH=${JAVA_HOME}/bin:$PATH
```

# installer maven 3.6.3

```
mkdir /c/maven
cd /c/maven
curl https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/3.6.3/apache-maven-3.6.3-bin.tar.gz --output apache-maven-3.6.3-bin.tar.gz
unzip apache-maven-3.6.3-bin.tar.gz
rm -f apache-maven-3.6.3-bin.tar.gz

# ajoute les lignes suivante dans ~/.bash_profile
export MAVEN_HOME=/c/maven/apache-maven-3.6.3
export PATH=${MAVEN_HOME}/bin:$PATH
```

# Tuto spring boot basé sur ce [tuto](https://www.youtube.com/watch?v=k6Nmt-l1Bzc)

## Initialisation du projet avec l'aide de [spring initializr](https://start.spring.io/)

![](https://github.com/soniksub/tutoriels/blob/main/spring/spring%20initializr.png)

