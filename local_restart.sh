# Shutdown Tomcat
echo "Shutting down Tomcat..."
sudo /usr/lib/apache-tomcat-9.0.95/bin/shutdown.sh
sleep 5

# Maven build
echo "Starting Maven build..."
mvn clean install
sleep 3

# 빌드 성공여부 확인
if [ $? -ne 0 ]; then
    # 빌드 실패 시 Tomcat 재시작 후 스크립트 종료
    echo "Maven build failed. Restarting Tomcat."
    sudo /usr/lib/apache-tomcat-9.0.95/bin/startup.sh
    # 스크립트 종료
    exit 1
fi

# Copy the .war file to Tomcat webapps
sudo cp /home/ubuntu/data/BusinessCost2/target/business-1.0.0-BUILD-SNAPSHOT.war /usr/lib/apache-tomcat-9.0.95/webapps/

# Restart Tomcat
echo "Starting Tomcat..."
sudo /usr/lib/apache-tomcat-9.0.95/bin/startup.sh
