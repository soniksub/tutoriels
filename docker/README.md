# Commencez par le tutoriel JAVA
[le tuto JAVA](https://github.com/soniksub/tutoriels/tree/main/java#readme)

# DEPLOIEMENT des wars avec DOCKER

## fabrication du container "jbossdemo" contenant jboss/wildfly + les 2 wars ( voir Dockerfile )

creez un fichier Dockefile contenant
```
FROM jboss/wildfly

RUN /opt/jboss/wildfly/bin/add-user.sh admin tralala --silent 

COPY demo/target/demo.war /opt/jboss/wildfly/standalone/deployments/
COPY java-web-project/target/java-web-project.war /opt/jboss/wildfly/standalone/deployments/

EXPOSE 8080 9990

CMD [ "/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0" ]

```

puis lancez 
```
docker build -t jbossdemo .

```

## on lance une instance nommée "jbd" du container "jbossdemo"
```
docker run --name jbd -d -p 8081:8080/tcp -p 9990:9990/tcp jbossdemo
docker ps
docker stop jbd
docker ps -a
docker rm jbd
```

* [le WAR demo](http://localhost:8081/demo/) 
* [le WAR java-web-project](http://localhost:8081/java-web-project/)

# plus
pour supprimer les images créées sans nom : 
```
docker rmi $( docker images --filter "dangling=true" --format "{{.ID}}" )
```

