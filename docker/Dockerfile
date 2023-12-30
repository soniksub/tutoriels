FROM jboss/wildfly

RUN /opt/jboss/wildfly/bin/add-user.sh admin tralala --silent 

COPY demo/target/demo.war /opt/jboss/wildfly/standalone/deployments/
COPY java-web-project/target/java-web-project.war /opt/jboss/wildfly/standalone/deployments/

EXPOSE 8080 9990

CMD [ "/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0" ]

