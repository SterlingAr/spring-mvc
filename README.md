# spring-mvc
[Docker repo](https://hub.docker.com/r/sterlingar/spring-mvc/)
```
docker container run -it -p 80:80 sterlingar/spring-mvc
```

__Deploy__
```
cd bookstore/
mvn clean install
__Copy where your tomcat installation resides__
cp target/bookstore.war $TOMCAT/webapps/bookstore
```

To make it root, rename it ROOT.war and delete the existing ROOT folder at webapps/
