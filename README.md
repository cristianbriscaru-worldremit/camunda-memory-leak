# Spring Boot Camunda Platform 7 - Memory Leak

### How to reproduce
1) start the application `./gradlew bootRun`
2) get [heap memory dump](http://localhost:8080/actuator/heapdump)  or `curl 'http://localhost:8080/actuator/heapdump' -O`
3) analyze heapdump.hprof with VisualVM or similar tool and observe org.apache.ibatis.session.defaults.DefaultSqlSessionFactory which is used by Camunda Engine has a memory leak


### Reported issue with camunda
[Issue 3002](https://github.com/camunda/camunda-bpm-platform/issues/3002)