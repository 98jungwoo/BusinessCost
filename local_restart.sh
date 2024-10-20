# Shutdown Tomcat
sudo /usr/lib/apache-tomcat-9.0.95/bin/shutdown.sh
sleep 5

# Maven build
mvn clean install

# Copy the .war file to Tomcat webapps
sudo cp /home/ubuntu/data/BusinessCost2/target/business-1.0.0-BUILD-SNAPSHOT.war /usr/lib/apache-tomcat-9.0.95/webapps/

# Restart Tomcat
sudo /usr/lib/apache-tomcat-9.0.95/bin/startup.sh
