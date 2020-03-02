FROM registry.lisong.pub:28500/hadoop_env
#FROM registry.lisong.pub:5000/sunrise/java:8-jdk-211
VOLUME /tmp
#ADD hosts tmp/
ADD target/data-moudle-mangaer-0.0.1-SNAPSHOT.jar app.jar

ENV LANG C.UTF-8
#CMD cat /tmp/hosts >> /etc/hosts;cat /etc/hosts
ENTRYPOINT java -jar app.jar
