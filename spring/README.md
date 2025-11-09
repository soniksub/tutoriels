# Commencez par le tutoriel JAVA
[le tuto JAVA](https://github.com/soniksub/tutoriels/tree/main/java#readme)

# installer java 17

```
# sous git-bash ça donne ça
mkdir /c/java
cd /c/java
curl https://builds.openlogic.com/downloadJDK/openlogic-openjdk/17.0.16+8/openlogic-openjdk-17.0.16+8-windows-x64.zip  --output openjdk.zip
unzip openjdk.zip
rm -f openjdk.zip

# ajoute les lignes suivante dans ~/.bash_profile
export JAVA_HOME=/c/java/openlogic-openjdk-17.0.16+8-windows-x64
export PATH=${JAVA_HOME}/bin:$PATH
```

# installer maven 3.9.11

```
mkdir /c/maven
cd /c/maven
curl https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/3.9.11/apache-maven-3.9.11-bin.tar.gz --output maven.tar.gz
gzip -d maven.tar.gz
rm -f maven.tar.gz

# ajoute les lignes suivante dans ~/.bash_profile
export MAVEN_HOME=/c/maven/apache-maven-3.9.11
export PATH=${MAVEN_HOME}/bin:$PATH
```

# Tuto web/sa-backend basé sur ce [tuto](https://www.youtube.com/watch?v=k6Nmt-l1Bzc)

## Initialisation du projet avec l'aide de [spring initializr](https://start.spring.io/)

![](https://github.com/soniksub/tutoriels/blob/main/spring/spring%20initializr.png)

